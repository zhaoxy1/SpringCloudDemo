package feignservice.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-hello",fallback = FeignServiceHystric.class)
public interface FeignService {
    @RequestMapping("/index")
    public String hello();
}
