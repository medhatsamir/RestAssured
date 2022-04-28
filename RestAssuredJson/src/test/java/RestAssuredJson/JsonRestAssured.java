package RestAssuredJson;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import junit.framework.Assert;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;

public class JsonRestAssured {
  @Test
 public void validate_response_code() {
	  
	  given().get("https://reqres.in/api/users?page=2").
	  then().assertThat().statusCode(200);
	  
  }
  @Test
  
  //positive test case 
  public void validate_response_data() {
	  given().get("https://reqres.in/api/users?page=2").
	  then().assertThat().body("data[0].'email'",equalTo("michael.lawson@reqres.in")).and().
	  assertThat().body("data[0].'first_name'",equalTo("Michael")).and().
	  assertThat().body("data[0].'last_name'",equalTo("Lawson")).and().
	  assertThat().body("data[0].'avatar'",equalTo("https://reqres.in/img/faces/7-image.jpg"));
  }
   
  //negative test case 
  @Test
  public void validate_invalid_response_data() {
	 String response =RestAssured.get("https://reqres.in/api/users?page=10000000").andReturn().asString();
	 Assert.assertTrue(response.contains("server costs are appreciated!"));
  }
  
  
  
  
}
