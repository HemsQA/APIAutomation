package Steps;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.CutomerAPI;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDefination {
	private RequestSpecification httpRequest;
	private String postRequestBody;
	private   Response response;

	
	@Given("User configure Base URI")
	public void user_configure_base_uri() {
	   RestAssured.baseURI="http://localhost:4000/customers";
	}

	@Given("user get requestSpecification Interface object")
	public void user_get_request_specification_interface_object() {
	   RequestSpecification httpRequest= RestAssured.given();
	}

	@Given("user add Request Header")
	public void user_add_request_header() {
	    httpRequest.header("Content-type", "application/json");
	}

	@Given("user create request body using serialization and deserialization")
	public void user_create_request_body_using_serialization_and_deserialization() throws IOException {
	    ObjectMapper mapper= new ObjectMapper();
	    File file =new File(System.getProperty("user.dir")+"src//test//resources//custumer.json");
	    
	   JsonNode jsonNode= mapper.readTree(file);
	    CutomerAPI cust=mapper.treeToValue(jsonNode.get("createCustomer"), CutomerAPI.class);
	   String postRequestBody=mapper.writeValueAsString(cust);
	}

	@Given("user add request body for POST request")
	public void user_add_request_body_for_post_request() {
	 response= httpRequest.body(postRequestBody);
	}

	@Given("user select HTTP POST request")
	public void user_select_http_post_request() {
	  response=httpRequest.post();
	}

	@Given("user capture status code")
	public void user_capture_status_code() {
		response.statusCode();	    
	}

	@Given("user capture status line")
	public void user_capture_status_line() {
		
		response.statusLine();
	   
	}

	@Given("user capture response time")
	public void user_capture_response_time() {
	  response.time();
	  
	}

	@Given("user capture response body")
	public void user_capture_response_body() {
	   response.body();
	}

	@Given("user capture response headers")
	public void user_capture_response_headers() {
	    
	}

	@Given("user capture id from response body")
	public void user_capture_id_from_response_body() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("user select HTTP GET request")
	public void user_select_http_get_request() {
	   response= httpRequest.get(id);
	}

	@Given("user create request body using put request using serialization and deserialization")
	public void user_create_request_body_using_put_request_using_serialization_and_deserialization() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("user add request body for PUT request")
	public void user_add_request_body_for_put_request() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("user select HTTP PUT request")
	public void user_select_http_put_request() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
