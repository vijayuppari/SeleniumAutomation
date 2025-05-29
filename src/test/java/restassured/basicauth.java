package restassured;

import io.restassured.RestAssured;

public class basicauth {

    public static void main(String[] args) {

        String resp = RestAssured.given()
                .auth()
                .basic("postman", "password")
                .when()
                .get("https://postman-echo.com/basic-auth")
                .then().log().all()
                .statusCode(200).extract().body().asString();

        System.out.println("Response Body is " + resp);

    }
}
