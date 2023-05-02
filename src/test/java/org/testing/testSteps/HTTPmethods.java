package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPmethods {
	Properties pr;

	public HTTPmethods(Properties pr) {
		this.pr = pr;
	}

	public Response postrequest(String bodyData, String uriKeyName) {
		String uriValue = pr.getProperty(uriKeyName);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.post(uriValue);
		System.out.println(res.statusCode());
		return res;

	}
	
	public void updateRequest(String bodyData,String uriKey,String idValue) {
		String uriValue = pr.getProperty(uriKey)+"/"+idValue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.put(uriValue);
		System.out.println(res.statusCode());
		System.out.println("Response data is:"+res.asString());
	}
	
	public void getAllRequest(String uriKeyName) {
		String uriValue = pr.getProperty(uriKeyName);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		System.out.println(res.statusCode());
		System.out.println("Response data is:"+res.asString());
	

	}
	
	public void getParticularRequest(String uriKeyName,String idValue) {
		String uriValue = pr.getProperty(uriKeyName)+"/"+idValue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		System.out.println(res.statusCode());
		System.out.println("Response data is:"+res.asString());
	

	}
	
	public void deleteParticularRecord(String uriKeyName,String idValue) {
		String uriValue = pr.getProperty(uriKeyName)+"/"+idValue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(uriValue);
		System.out.println(res.statusCode());
		System.out.println("Response data is:"+res.asString());
	
	}

}
