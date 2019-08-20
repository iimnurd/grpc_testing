package com.alterra.deoxys.test;

import static org.junit.Assert.fail;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.alterra.deoxys.sampler.ServiceClient2;
import com.alterra.deoxys.stub.CreateResponse;
import com.alterra.deoxys.stub.DeleteResponse;
import com.alterra.deoxys.stub.ReadAllResponse;
import com.alterra.deoxys.stub.ReadResponse;
import com.alterra.deoxys.stub.UpdateResponse;
import io.grpc.StatusRuntimeException;

public class GreeterClientTest {

	String environment = null;
	int port;
	ServiceClient2 bclient = null;
	int new_id;
	String new_api;
	private static final Logger logger = Logger.getLogger("l");

	private void readProperties() {
		ResourceBundle unittestBundle = ResourceBundle.getBundle("unittest", Locale.getDefault());
		this.environment = unittestBundle.getString("environment");
		this.port = Integer.parseInt(unittestBundle.getString("port"));
	}

	@Before
	public void setUp() {
		logger.setLevel(Level.ALL);
		readProperties();
		// see this configuration on src/main/resources (properties file)
		this.bclient = new ServiceClient2(environment, port);

	}

	@Test
	public void CrudTest() {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		System.out.println(formatter.format(date));

		try {

			logger.info("============== CREATE STAGE ==============");
			//test create
			CreateResponse responseCreate = this.bclient.sendCreateRequestToService(bclient, "v1", "baru - " + formatter.format(date), "desc baru ya");
			logger.info("RAW Response Create : " + responseCreate.toString());
			//get new id and string api
			new_id = (int) responseCreate.getId();
			new_api = responseCreate.getApi();
			logger.info("=========================================="+"\n \n");
			
			
			
			
			

			logger.info("============== READ STAGE ==============");
			//test read data by id
			ReadResponse responseRead = this.bclient.sendReadRequestToService(bclient, "v1", new_id);
			logger.info("RAW Response Read : " + responseRead.toString());
			logger.info("=========================================="+"\n \n");
			
			
			
			
			

			logger.info("============== READ ALL DATA STAGE ==============");
			//test read all data
			ReadAllResponse responseAllRead = this.bclient.sendReadAllRequestToService(bclient, "v1");
			logger.info("RAW Response Read All Data : " + responseAllRead.toString());
			logger.info("=========================================="+"\n \n");
			
			
			
			

			logger.info("============== UPDATE DATA STAGE ==============");
			//test update data
			UpdateResponse responseUpdate = this.bclient.sendUpdateRequestToService(bclient, new_id, "v1", "update " + new_id, "desc update" + formatter.format(date));
			logger.info("RAW Response Update Data : " + responseUpdate.toString());
			logger.info("=========================================="+"\n \n");
			
			
			
			
			

			logger.info("============== DELETE STAGE ==============");
			//test read data by id
			DeleteResponse responseDelete = this.bclient.sendDeleteRequestToService(bclient, "v1", new_id);
			logger.info("RAW Response Read : " + responseDelete.toString());
			logger.info("=========================================="+"\n \n");
			
			
			
			

			logger.info("============== READ ALL DATA STAGE 2 ==============");
			//test read data by id (again)
			responseAllRead = this.bclient.sendReadAllRequestToService(bclient, "v1");
			logger.info("ID = " + new_id + " MUST BE NOT FOUND");
			logger.info("RAW Response Read : " + responseAllRead.toString());
			logger.info("=========================================="+"\n \n");

			Logger logger = Logger.getLogger(ServiceClient2.class.getName());

		}
		catch(StatusRuntimeException e) {

			fail("healthcheck threw StatusRuntimeException");
		}
	}

	@After
	public void tearDown() {
		try {
			this.bclient.shutdown();

		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}