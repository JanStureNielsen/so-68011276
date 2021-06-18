package so68011276;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoController {
    @PostMapping("/so/warning")
    public String warning(@RequestBody EntityModel<SoPojo> pojo) {
        return pojo.toString();
    }

    @PostMapping("/so/pojo")
    public String avoidEntityModel(@RequestBody SoPojo pojo) {
        return pojo.toString();
    }

}
