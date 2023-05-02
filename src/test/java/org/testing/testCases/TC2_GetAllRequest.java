package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPmethods;
import org.testing.utilities.HandlePropertiesFile;
import org.testng.annotations.Test;

public class TC2_GetAllRequest {
	@Test
	public void testcase2() throws IOException {
	Properties prObj = HandlePropertiesFile.loadProperties("../API_Project/URI.properties");
	HTTPmethods http=new HTTPmethods(prObj);
	http.getAllRequest("QA_URI");
	}
	

}
