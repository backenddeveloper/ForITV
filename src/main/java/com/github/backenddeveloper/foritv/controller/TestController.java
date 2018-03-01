package com.github.backenddeveloper.foritv.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController
{
   
    @ResponseBody
    @RequestMapping(path={"/test"},method=RequestMethod.POST)
    public Test sayHello(@RequestBody Test test) {
        return test ;
    }
}
