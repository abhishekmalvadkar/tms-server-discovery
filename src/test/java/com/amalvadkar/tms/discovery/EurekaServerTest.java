package com.amalvadkar.tms.discovery;

import common.AbstractIT;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class EurekaServerTest extends AbstractIT {

    @Test
    void should_send_ok_from_eureka_server(){
        given()
                .when()
                .get("/eureka/apps")
                .then()
                .statusCode(200);
    }

}
