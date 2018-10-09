package com.cszt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lilin
 * @create 2018/10/9 16:28
 * description:  设置请求头  或  cors处理跨域访问
 */
@SpringBootApplication
@RestController
@ComponentScan("com.cszt")
public class ConsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(ConsumerApplication.class,args);
    }
    @GetMapping("/getData")
    public Map<String,Object> getData(HttpServletResponse response){
        System.out.print("***********************");
        //设置跨域
        //response.setHeader("Access-Control-Allow-Origin", "*");
        HashMap<String, Object> result = new HashMap<String, Object>();
        result.put("code",200);
        result.put("message","success");
        return result;
    }
}