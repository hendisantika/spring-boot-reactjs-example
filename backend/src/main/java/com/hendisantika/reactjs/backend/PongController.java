package com.hendisantika.reactjs.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : backend
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-19
 * Time: 06:46
 */
@RestController
public class PongController {

    @GetMapping("/pong")
    @CrossOrigin(origins = "*")
    public String pong() {
        return "pong";
    }
}