package crudOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class JsonObject 
{
  @Test
  public void object()
  {
	  //request the uri
	  baseURI="https://reqres.in";
	  
	  //create json body to object creation
	  JSONObject jo=new JSONObject();
	  jo.put("name","vaibhav");
	  jo.put("job","testing");
	  
	  //send the request and validate the response
	  given().body(jo)
		.contentType(ContentType.JSON).when()
		.post("/api/users").then().log().all();
  }
}
