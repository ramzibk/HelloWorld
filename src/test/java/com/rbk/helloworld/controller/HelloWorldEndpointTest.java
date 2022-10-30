package com.rbk.helloworld.controller;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


class HelloWorldEndpointTest {

    @BeforeAll
    static public void setup() {
        basePath = "/api";
    }

    @Test
    void getMessage() {
        given().contentType(ContentType.TEXT)
                .queryParam("name","ramzi")
                .queryParam("age","20")
                .when()
                .get("/hello")
                .then()
                .statusCode(200)
                .body(equalTo("Hello ramzi 20"));
    }

}