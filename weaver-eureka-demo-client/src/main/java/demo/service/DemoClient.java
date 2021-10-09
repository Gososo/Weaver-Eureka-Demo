
package demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@FeignClient("${weaver.provider.name}")
public interface DemoClient {
    @RequestMapping(value = "/", method = GET)
    String hello();

    @RequestMapping(value = "/api/health/check", method = GET)
    String check(@RequestParam(name = "key1") String par1, @RequestParam(name = "key2") String par2);

    @RequestMapping(value = "/api/demo/provider/post", method = POST)
    String post();

    @RequestMapping(value = "/api/system/appmanage/route", method = GET)
    String route();
}
