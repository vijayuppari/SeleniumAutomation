package restassured;

import io.restassured.RestAssured;

public class bearertoken {
// Pass Bear token as Header and validate the response
    public static void main(String[] args) {

        String respbody = RestAssured.given()
                .baseUri("https://gorest.co.in/public/")
                .basePath("v2/users")
                .header("Authorization", "Bearer 8254c9891f954656078246f5871e519ede10e57f4d2fc9caa5651015134ef2c1")
                .header("Content-Type", "application/json")
                .log().all()
                .body("{\n" +
                        "    \"name\": \"Vijay3\",\n" +
                        "    \"email\": \"vijay.uppari4@gmail.com\",\n" +
                        "    \"gender\": \"male\",\n" +
                        "    \"status\": \"active\"\n" +
                        "}")
                .when()
                .post()
                .then()
                .extract().response().prettyPrint();
        System.out.println("Response Body as " + respbody);
    }
}
