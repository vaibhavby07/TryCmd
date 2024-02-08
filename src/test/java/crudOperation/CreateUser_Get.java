package crudOperation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateUser_Get
{
	public static void main(String[] args)
	{	
		Response res=RestAssured.get("https://Reqres.in/api/users/2");  //Get()- Sending request without body
		System.out.println(res.prettyPeek());	
		
		//res.then().log().all(); //To display whole response
		String z=res.getBody().asString();
		System.out.println(z);
	}
}
