package feignservice.demo;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystric implements  FeignService{
    @Override
    public String hello() {
        return "Error";
    }
}
