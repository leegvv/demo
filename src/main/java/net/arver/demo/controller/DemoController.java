package net.arver.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

/**
 * DemoController.
 *
 * @author leegvv
 * @version 1.0.0.0
 * Description:
 **/
@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping("/hello")
    public Object hello() {
        String ip = null;
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            ip = "Unknown Ip";
        }
        System.out.println("接口访问时间：" + LocalDateTime.now());
        return "Hello world! \r\n Your IP: " + ip;
    }
}
