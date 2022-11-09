package com.rbk.helloworld.controller;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


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

}