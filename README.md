# RestAssured
test API for Json and xml data


RestAssured used in api testing so in this project we have 2 file rest_assured file this for test xml data .
in this project we will use a dummy api url .
before ant test case we sould use the anotation @Test to make sure the compiler will compile this function as a test case .
in this project the first test case to sure that the status code equal 200 . in api respose we have different types of status codes , 
200 mean that the respones code is correct .
in the second test case we will test the containt of this xml data we use gherkin language (given then and) and we use assertThat and equalTo 
to compare the respone data from the api url with the expected value we have 2 scenarios positive scenario --> id in the api url will be valid so 
in the second test case we send valid id in the url of the api .
in the third test case we will test the negative scenario so we pass invalid id in the url of the api and check if the response equal this message
"Could not find customer #<the id which we pass in the url>" but in this case we compare String value so we should first convert the response data to String.
  the code of RestAssured for xml data in this path --> rest_assured\src\test\java\rest_assured\RestAssuredTeatCase.java
  
the second file in this project RestAssuredJson for json data 
  in this file we did the same three test cases but for json data .
  in the third test case we check if the response data contain this message "server costs are appreciated!"
  the code of RestAssured for json data in this path --> RestAssuredJson\src\test\java\RestAssuredJson\JsonRestAssured.java
  
  
 there is a helpful link to learn RestAssured "https://www.youtube.com/playlist?list=PLQUxWr2rTswkKPINUk34Ilvm__x2YZfot" .
