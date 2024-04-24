package com.pandaer.project.server.modules.user.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Tag(name = "")
@RestController
public class HelloController {

    @GetMapping("/hello")
    @Operation(summary = "测试 hello")
    public String hello() {
        return "hello,world";
    }
}
