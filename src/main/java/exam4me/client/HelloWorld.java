package exam4me.client;

import exam4me.services.StudentAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hashcode on 2016/07/25.
 */

@RestController
public class HelloWorld {
    @Autowired
    private StudentAccountService service;

    @RequestMapping("/")
    public String getValue(){
        return "<!DOCTYPE html>" +
                "<html>" +
                "<head><title>My Server</title></head>" +
                "<body>" +
                "   <h1>My Server</h1>" +
                "</body>" +
                "</html>";
    }
}
