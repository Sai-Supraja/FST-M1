package activities;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static io.restassured.RestAssured.given;

public class Activity1 {
    final static String rootURI= "https://petstore.swagger.io/v2/pet";
    @Test(priority=1)
    public void addPet(){
        String requestBody= """
                {
                "id": 77232,
                "name": "Riley",
                "status": "alive"
        };
        """;
        Response response= given().contentType(ContentType.JSON)
                            .body(requestBody)
                            .when().post(rootURI);
        response.then().body("id",equalTo(77232));
        response.then().body("name",equalTo("Riley"));
        response.then().body("status",equalTo("alive"));
    }
    @Test(priority=2)
    public void getPet(){
        Response response= given().contentType(ContentType.JSON)
                .when().pathParam("petId","77232")
                .get(rootURI +"/{petId}");
        response.then().body("id",equalTo(77232));
        response.then().body("name",equalTo("Riley"));
        response.then().body("status",equalTo("alive"));
    }
    @Test(priority=3)
    public void deleteRequest(){
        Response response= given().contentType(ContentType.JSON)
                .when().pathParam("petId","77232")
                .delete(rootURI +"/{petId}");
        response.then().body("code",equalTo(200));
        response.then().body("message",equalTo("77232"));
    }
}
