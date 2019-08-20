package com.alterra.deoxys.sampler;



import java.util.logging.Logger;

import org.apache.cxf.common.util.StringUtils;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import com.alterra.deoxys.sampler.ServiceClient2;
import com.alterra.deoxys.stub.ReadAllResponse;
import com.alterra.deoxys.stub.ReadResponse;

import io.grpc.StatusRuntimeException;


public class JmeterReadSampler extends AbstractJavaSamplerClient  {

	ServiceClient2 bclient = null;
	String apiVersion = "v1";
	String id = "id";
	String environment = "localhost";
	String port = "9090";
	ReadResponse responseRaw ;
	ReadAllResponse responseAllRaw ;
	
	@Override
	public Arguments getDefaultParameters() {
		
		Arguments defaultParameters = new Arguments();
		defaultParameters.addArgument("host", environment);
		defaultParameters.addArgument("port", port);
		defaultParameters.addArgument("apiVersion", apiVersion);
		defaultParameters.addArgument("id", "");
		
		return defaultParameters;
	}
	
	

	
	//get variable from jmeter
	@Override 
	public void setupTest(JavaSamplerContext context) {
		Logger logger   = Logger.getLogger( ServiceClient2.class.getName()); 
	    logger.info("sample setup" ); 
		this.environment = context.getParameter("host");
		this.port = context.getParameter("port");
		this.apiVersion = context.getParameter("apiVersion");
		this.id = context.getParameter("id");
	

		//create logger
		logger.info("ENVIRONTMENT : " + environment +"\n");
		logger.info("PORT : " + port +"\n");
		logger.info("API VERSION : " + apiVersion +"\n");
		logger.info("ID : " + id +"\n");
		
		
		//build connection
		this.bclient = new ServiceClient2(environment, Integer.parseInt(port));
		super.setupTest(context);
	}



	@Override
	public SampleResult runTest(JavaSamplerContext context) {
		
		SampleResult sampleResult = new SampleResult();
		boolean success = true;
		String response = "";
		sampleResult.sampleStart();   
		
		try {
			if(id.equals("")) {
				responseAllRaw = this.bclient.sendReadAllRequestToService(bclient, this.apiVersion);
				sampleResult.setResponseData(responseAllRaw.toString().getBytes());
			}else {
				
				responseRaw = this.bclient.sendReadRequestToService(bclient, this.apiVersion, Integer.parseInt(this.id));
				sampleResult.setResponseData(responseRaw.toString().getBytes());
			}
			
			
			sampleResult.sampleEnd();
			sampleResult.setSuccessful(success);
			sampleResult.setResponseMessage("Success");
			sampleResult.setResponseCodeOK(); // 200 code
		} catch (StatusRuntimeException e) {
			sampleResult.sampleEnd(); // stop stopwatch
			sampleResult.setSuccessful(false);
			sampleResult.setResponseMessage("Exception: " + e);
			
			// get stack trace as a String to return as document data
			java.io.StringWriter stringWriter = new java.io.StringWriter();
			e.printStackTrace(new java.io.PrintWriter(stringWriter));
			sampleResult.setResponseData(stringWriter.toString().getBytes());
			sampleResult.setDataType(org.apache.jmeter.samplers.SampleResult.TEXT);
			sampleResult.setResponseCode("500");
		}
		
		
		
		return sampleResult;
	}
	
	@Override
	public void teardownTest(JavaSamplerContext context) {
		try {
			bclient.shutdown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		super.teardownTest(context);
	}
}

