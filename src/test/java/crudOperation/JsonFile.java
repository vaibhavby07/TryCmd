package crudOperation;

import java.io.FileInputStream;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class JsonFile
{
  @Test
  public void createUser(Object contentType) throws Throwable
  {
	//1. Make a Request
	baseURI="https://Reqres.in";
	
	//Step 1-create data by using FileInputStream
	FileInputStream fis=new FileInputStream("D:\\epavilion\\RestAssured\\src\\test\\resources\\data.json");
    
	// Step2-Send the request and validate
	given().body(fis)
	.contentType(ContentType.JSON)
	.when()
	.post("/api/users")
	.then().log().all();
  }
}
