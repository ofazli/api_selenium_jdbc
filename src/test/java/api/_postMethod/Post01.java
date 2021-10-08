package api._postMethod;

import api.baseurl.BaseUrl_HerOkuApp;
import api.myPojo.InnerPojo;
import api.myPojo.OuterPojo;
import api.myPojo.OuterPojo_1;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Post01 extends BaseUrl_HerOkuApp {

    /**

     Given
     https://re
     {
     "firstname": "Orcun",
     "lastname": "Fazli",
     "totalprice": 3500,
     "depositpaid": true,
     "bookingdates": {
     "checkin": "2021-10-01",
     "checkout": "2021-10-20"
     },
     "additionalneeds": "Dinner, coke, openbar"
     }

     When
        I send POST Request to the Url
     Then
         Status code is 200
     And
        response body should be like;
             {
     "firstname": "Orcun",
     "lastname": "Fazli",
     "totalprice": 3500,
     "depositpaid": true,
     "bookingdates": {
     "checkin": "2021-10-01",
     "checkout": "2021-10-20"
     },
     "additionalneeds": "Dinner, coke, openbar"
             }
     */
@Test
    public void post01(){
    //1. Set the URL
    spec.pathParam("first", "booking");

    //2. Expected Data
    InnerPojo bookingdates = new InnerPojo("2021-10-01","2021-10-05");
    OuterPojo requestBody = new OuterPojo("Orcun", "Fazli", 3500, true, bookingdates, "Dinner, coke, openbar");
    System.out.println(requestBody);
}


}
