package feignservice.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private  FeignService feignService;
    @RequestMapping("/hello")
    public String hello(){
        return feignService.hello();
    }
}
