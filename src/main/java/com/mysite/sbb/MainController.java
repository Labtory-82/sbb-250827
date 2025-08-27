package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("목록")
    @ResponseBody
    public String index () {
        return "sbb";
    }

    @ResponseBody
    @GetMapping("등록")
    public String hello () {
        return "hello";
    }

}
