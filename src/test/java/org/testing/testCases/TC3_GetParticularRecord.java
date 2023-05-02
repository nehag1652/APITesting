package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPmethods;
import org.testing.utilities.HandlePropertiesFile;
import org.testng.annotations.Test;

public class TC3_GetParticularRecord {
	@Test
	public void testcase3() throws IOException {
		Properties prObj = HandlePropertiesFile.loadProperties("../API_Project/URI.properties");
		HTTPmethods http=new HTTPmethods(prObj);
		http.getParticularRequest("QA_URI",TC1_PostRequest.returnidvalue);
	}

}
