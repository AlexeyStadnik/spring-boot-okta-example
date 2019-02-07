package github.example.oktaoauth;

import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/api/public", produces = MediaType.APPLICATION_JSON_VALUE)
    public String publicEndpoint() {
        return new JSONObject()
                .put("message", "Public response.")
                .toString();
    }

    @GetMapping(value = "/api/private", produces = MediaType.APPLICATION_JSON_VALUE)
    public String privateEndpoint() {
        return new JSONObject()
                .put("message", "Private response.")
                .toString();
    }

    @GetMapping(value = "/api/private-admin", produces = MediaType.APPLICATION_JSON_VALUE)
    public String privateAdminEndpoint() {
        return new JSONObject()
                .put("message", "Private response available only for admin.")
                .toString();
    }
}
