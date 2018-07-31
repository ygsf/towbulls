package au.com.towbulls.stepdef;

import au.com.towbulls.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.http.*;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;


/**
 * Created by att.jacobg on 24/06/2018.
 */
public class TowBullsAPIStepdefs extends BaseTest {

    HttpResponse lastServerResponse = null;

    private static final int TIMEOUT = 3000;
    private static RequestConfig config;

    {
        config = RequestConfig.custom().setConnectTimeout(TIMEOUT).
                setConnectionRequestTimeout(TIMEOUT).
                setSocketTimeout(TIMEOUT).build();
    }

    @Given("^I test POST request to passwordutility$")
    public void iTestPOSTRequestToPasswordutility() throws Throwable {

        CloseableHttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
        HttpPost postRequest = new HttpPost("http://passwordutility.net:80/api/password/generate");
        StringEntity input = new StringEntity("{\"password\" ​: \"123456\", \"user_id\"​: \"70f3fc6beac4412b82db266b4796b\"}​");
        input.setContentType("application/json");
        postRequest.setEntity(input);

        lastServerResponse = httpClient.execute(postRequest);

    }

    @Then("^I receive  (\\d+) status$")
    public void iReceiveStatus(int arg0) throws Throwable {
        System.out.print("Server Response code is:" + lastServerResponse);
        if (lastServerResponse.getStatusLine().getStatusCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + lastServerResponse.getStatusLine().getStatusCode());
        }
    }


    @Given("^I test GET request to oxforddictionaries$")
    public void iTestGETRequestToOxforddictionaries() throws Throwable {

        CloseableHttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
        HttpGet getRequest = new HttpGet("https://od-api-demo.oxforddictionaries.com:443/api/v1/domains/es/es");
        getRequest.addHeader("app_id", "!no1me2digas!");
        getRequest.addHeader("app_key", "0clave42");

        lastServerResponse = httpClient.execute(getRequest);
    }
}


