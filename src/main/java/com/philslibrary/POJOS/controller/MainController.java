package com.philslibrary.POJOS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //This means that this class is a Controller
@RequestMapping(path = RESTNouns.VERSION_1) //This means URL's start with /v1 (after Application path)

public class MainController {
}
