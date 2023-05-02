package org.testing.utilities;

import io.restassured.response.Response;

public class JSONParsingUsingJSONPath {
	
	public static String parsingJSONPath(Response res,String jsonPath) {
		return res.jsonPath().get(jsonPath);
	}

}
