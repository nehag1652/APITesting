package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPmethods;
import org.testing.utilities.HandleJSONFile;
import org.testing.utilities.HandlePropertiesFile;
import org.testing.utilities.JSONParsingUsingJSONPath;
import org.testing.utilities.RandomData;
import org.testing.utilities.ReplaceJSONData;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_PostRequest {

	public static String returnidvalue;
@Test
	public void testcase1() throws IOException {
		Properties prObj = HandlePropertiesFile.loadProperties("../API_Project/URI.properties");
		String requestBody = HandleJSONFile
				.loadJSONData("../API_Project/src/test/java/org/testing/payload/inputPayload.json");

		String randomData = RandomData.generateRandom();
		requestBody = ReplaceJSONData.replaceData("id", randomData, requestBody);
		HTTPmethods http = new HTTPmethods(prObj);
		Response res = http.postrequest(requestBody, "QA_URI");
		returnidvalue = JSONParsingUsingJSONPath.parsingJSONPath(res, "id");
	}

}
