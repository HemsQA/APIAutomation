Feature: Test Customer API

  Scenario: Create a new customer using POST Request
    Given User configure Base URI
    And user get requestSpecification Interface object
    And user add Request Header
    And user create request body using serialization and deserialization
    And user add request body for POST request
    And user select HTTP POST request
    And user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers
    And user capture id from response body

  Scenario: Get customer details using GET Request
    Given User configure Base URI
    And user get requestSpecification Interface object
    And user select HTTP GET request
    And user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers
    And user capture id from response body

  Scenario: Update customer details using P Request
    Given User configure Base URI
    And user get requestSpecification Interface object
    And user add Request Header
    And user create request body using put request using serialization and deserialization
    And user add request body for PUT request
    And user select HTTP PUT request
    And user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers
    And user capture id from response body
