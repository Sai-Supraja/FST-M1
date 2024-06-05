package activities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.CoreMatchers;
import org.testng.annotations.Test;

import java.io.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Activity2 {
    final static String rootURI= "https://petstore.swagger.io/v2/user";
    @Test(priority=1)
    public void addUserFromJSONFile() throws IOException {
        FileInputStream fis= new FileInputStream("src/test/java/activities/userInfo.json");
        String requestBody= new String(fis.readAllBytes());

        Response response= given().contentType(ContentType.JSON)
                            .body(requestBody)
                            .when().post(rootURI);
        fis.close();

        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("1118927"));
    }
    @Test(priority=2)
    public void getUser() throws IOException {
        File outputJSON= new File("src/test/java/activities/userGetResponse.json");
        Response response= given().contentType(ContentType.JSON)
                .pathParam("username", "Sai")
                .when().get(rootURI+"/{username}");
        String responseBody= response.getBody().asPrettyString();
        try{
            outputJSON.createNewFile();
            FileWriter writer= new FileWriter(outputJSON.getPath());
            writer.write(responseBody);
            writer.close();
        }
        catch(IOException ex){
        ex.printStackTrace();
        }
        response.then().body("id", equalTo(1118927));
        response.then().body("username", equalTo("Sai"));
        response.then().body("firstName", equalTo("Justin"));
        response.then().body("lastName", equalTo("Case"));
        response.then().body("email", equalTo("justincase@mail.com"));
        response.then().body("password", equalTo("password123"));
        response.then().body("phone", equalTo("9812763450"));
    }
    @Test(priority=3)
    public void deleteUser(){
        Response response= given().contentType(ContentType.JSON)
                .pathParam("username", "Sai")
                .when().delete(rootURI+"/{username}");
        response.then().body("code", CoreMatchers.equalTo(200));
        response.then().body("message", CoreMatchers.equalTo("Sai"));
    }
}
