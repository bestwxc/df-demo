package net.df.demo.controller;

import net.df.base.server.Result;
import net.df.base.utils.ResultUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/hello")
    public Result hello(){
        return ResultUtils.success(null);
    }
}
