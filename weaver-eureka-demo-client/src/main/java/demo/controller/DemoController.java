
package demo.controller;

import demo.service.DemoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    DemoClient client;

    @RequestMapping("/check")
    public String check() {
        return client.check("abc", "def");
    }

    @RequestMapping("/post")
    public String post() {
        return client.post();
    }

    @RequestMapping("/route")
    public String route() {
        return client.route();
    }

}
