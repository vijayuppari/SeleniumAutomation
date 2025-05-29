package restassured;

import io.restassured.RestAssured;

public class digestive {

    public static void main(String[] args) {

        RestAssured.given()
                .auth()
                .digest("postman", "password")
                .when()
                .get("https://postman-echo.com/digest-auth")
                .then().log().all()
                .statusCode(200);

    }
}
