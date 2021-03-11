package controller;

import org.json.simple.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.tempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

@RestController
public class homeController {

    @Autowired
    private service.tempService tempService;

    @RequestMapping(method = RequestMethod.GET, value = "/gettemp/{str}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map temp(@PathVariable String str) {

//        ModelAndView mv = new ModelAndView();
//
//        JSONObject json =  new JSONObject();

        HashMap<String, String> json = new HashMap<>();

        json.put("id", str);
        json.put("pw", "sdasd");

//        mv.addObject("result", json);
//        mv.setViewName("/Ajax/jsonView");

        return json;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/posttemp/{userInfo}")
    public void tempPost(@PathVariable HashMap userInfo) {

//        ModelAndView mv = new ModelAndView();
//
//        JSONObject json =  new JSONObject();

//        mv.addObject("result", json);
//        mv.setViewName("/Ajax/jsonView");

        System.out.println(userInfo);

//        return true;
    }

}
