package com.cheling.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.io.PrintWriter;

/**
 * Created by sean on 15/8/30.
 */
@Controller
public class WebController {
//    private static final Logger logger = LoggerFactory.getLogger(WebController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
//        logger.debug("/");
        return "index";
    }

}
