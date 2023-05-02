package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPmethods;
import org.testing.utilities.HandleJSONFile;
import org.testing.utilities.HandlePropertiesFile;
import org.testing.utilities.RandomData;
import org.testing.utilities.ReplaceJSONData;
import org.testng.annotations.Test;

public class TC4_UpdateRequest {
	@Test
	public void testcase4() throws IOException {
		Properties prObj = HandlePropertiesFile.loadProperties("../API_Project/URI.properties");
		String requestBody = HandleJSONFile
				.loadJSONData("../API_Project/src/test/java/org/testing/payload/updatePayload.json");

		requestBody = ReplaceJSONData.replaceData("id", TC1_PostRequest.returnidvalue, requestBody);

		HTTPmethods http = new HTTPmethods(prObj);
		http.updateRequest(requestBody, "QA_URI", TC1_PostRequest.returnidvalue);
	}
}
