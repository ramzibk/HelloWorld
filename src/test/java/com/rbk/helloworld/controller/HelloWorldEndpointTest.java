package com.rbk.helloworld.controller;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


class HelloWorldEndpointTest {

    @BeforeAll
    static public void setup() {
        basePath = "/api";
    }

    @Test
    void getMessage() {
        given().contentType(ContentType.TEXT)
                .queryParam("name","John")
                .queryParam("age","20")
                .when()
                .get("/hello")
                .then()
                .statusCode(200)
                .body(equalTo("Hello John 20"));
    }

    @Test
    void postMessge() {
        String message = ".... . .-.. .-.. --- / .-- --- .-. .-.. -..";

        given()
                .contentType(ContentType.JSON)
                .body(message)
                .when()
                .post("/message")
                .then()
                .statusCode(200)
                .body(equalTo("Your message was .... . .-.. .-.. --- / .-- --- .-. .-.. -.."));
    }

}