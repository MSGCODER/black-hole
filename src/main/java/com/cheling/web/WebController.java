package com.cheling.web;

import com.cheling.dao.TestDriveInfoDao;
import com.cheling.dao.entities.TestDriveInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sean on 15/8/30.
 */
@Controller
public class WebController {
    @Autowired
    TestDriveInfoDao testDriveInfoDao;
    private static final Logger logger = LoggerFactory.getLogger(WebController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        logger.debug("/");
        return "index";
    }

    @RequestMapping(value = "/product/{page}", method = RequestMethod.GET)
    public String product(@PathVariable("page") String page) {
        logger.debug("/product/" + page);
        return "/product/" + page;
    }

    @RequestMapping(value = "/company/{page}", method = RequestMethod.GET)
    public String company(@PathVariable("page") String page) {
        logger.debug("/company/" + page);
        return "/company/" + page;
    }

    @RequestMapping(value = "/company/test_drive/new", method = RequestMethod.POST)
    public void newTestDrive(@ModelAttribute TestDriveInfo testDriveInfo, @RequestParam(required = false) String pushEmail, PrintWriter writer) {
        logger.debug("/company/test_drive/new");
        if(pushEmail != null){
            testDriveInfo.setIsPushEmail(1);
        }
        testDriveInfoDao.save(testDriveInfo);
//        System.out.println(testDriveInfo);
        writer.write("success");
    }

//    @RequestMapping(value = "/testDrive/addInfo")
//    public String addInfo(@ModelAttribute TestDriveInfo testDriveInfo){
//        testDriveInfoDao.save(testDriveInfo);
//        return "redirect:/testDrive/list";
//    }

    @RequestMapping(value = "/testDrive/addContact")
    public String addContact(@RequestParam String tel){
        testDriveInfoDao.updateIsContactedInfo(tel);
        return "redirect:/testDrive/list";
    }

    @RequestMapping(value = "/testDrive/list")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("testDriveInfoList", testDriveInfoDao.getTestDriveInfoList());
        mv.setViewName("admin/testDriveInfo");
        return mv;
    }

    @RequestMapping(value = "/testDrive/setDriveTime")
    @ResponseBody
    public Map<String, String> setDriveTime(@RequestParam String tel, @RequestParam String date){
        Map<String, String> map = new HashMap<String, String>();
        map.put("result", "failed");
        Date driveTime = null;
        try {
            driveTime = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return map;
        }

        TestDriveInfo testDriveInfo = testDriveInfoDao.getTestDriveInfoByTel(tel);
        if(testDriveInfo != null){
            testDriveInfo.setTestDriveTime(driveTime);
            testDriveInfoDao.update(testDriveInfo);
            map.put("result","success");
        }
        return map;
    }

}
