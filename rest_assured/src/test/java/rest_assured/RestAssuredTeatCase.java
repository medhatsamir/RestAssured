package rest_assured;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

import junit.framework.Assert;

import static org.hamcrest.Matchers.equalTo;


@Test
public class RestAssuredTeatCase {
  public void validate_response_code() {
	  
	  given().get("http://parabank.parasoft.com/parabank/services/bank/customers/12212/").
	  then().assertThat().statusCode(200);
	  
  }
  
  
  public void validate_response_data(){
	  given().get("http://parabank.parasoft.com/parabank/services/bank/customers/12212/").
	  then().assertThat().body("customer.id", equalTo("12212")).and().
	  assertThat().body("customer.firstName", equalTo("john")).and().
	  assertThat().body("customer.lastName", equalTo("smith")).and().
	  assertThat().body("customer.address.street", equalTo("Koyambedu")).and().
	  assertThat().body("customer.address.city", equalTo("Chennai")).and().
	  assertThat().body("customer.address.state", equalTo("TamilNadu")).and().
	  assertThat().body("customer.address.zipCode", equalTo("600090")).and().
	  assertThat().body("customer.phoneNumber", equalTo("8013985475")).and().
	  assertThat().body("customer.ssn", equalTo("622-11-9999"));
	  
	  
	  
  }
  
  
  @Test
  public void validate_invalid_response() {
	  String response_data = given().get("https://parabank.parasoft.com/parabank/services/bank/customers/12214/")
			  .asString();
	  Assert.assertEquals(response_data, "Could not find customer #12214");
	  
	  
  }
  
  
  
}






