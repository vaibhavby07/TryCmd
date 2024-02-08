package crudOperation;


import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class Hashmap
{
@Test
public void createUser()
{
    baseURI="https://Reqres.in";    //import -RestAssured.baseUri or import declare globaly by using "static" and ".* "
	
	//create data
	HashMap map=new HashMap();
    
	map.put("name","vaibhav");
	map.put("job","tester");
	
	//send the request and validate the data
	given().body(map);
	when().post("/api/users").then().assertThat().statusCode(201).contentType(ContentType.JSON)
	.log().all();
}
}
