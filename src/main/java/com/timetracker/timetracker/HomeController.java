/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.timetracker.timetracker;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
public class HomeController {
  @ResponseBody
  @RequestMapping("")
  public Map<String, Object> test(){
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("result", "Aloha");    
    return map;
  }
}
