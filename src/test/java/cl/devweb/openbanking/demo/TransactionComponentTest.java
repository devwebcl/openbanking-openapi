package cl.devweb.openbanking.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class TransactionComponentTest {

	@LocalServerPort
	private int port;


    @Test
    void getTransactions() throws Exception {

        given().port(port).when().get("/transactions/1").then().assertThat().statusCode(200);
    }

}