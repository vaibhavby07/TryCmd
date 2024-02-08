package pojo;                    //Pojo class Creation-

public class UserLibrary         //for - src/test/java under package name- Pojo running  
{                               
	// class name- PojoClass
  //Declare variable globally
	String name;
	String job;
	
 // Use Constructor to initialize
	public UserLibrary(String name, String job)  //
	{
		this.name = name;
		this.job = job;
	}
	//generate getters 
	public String getName()   //used getters to initilize the methods,and getters as return value
	{
		return name;
	}
	public String getJob() 
	{
		return job;
	}
}
