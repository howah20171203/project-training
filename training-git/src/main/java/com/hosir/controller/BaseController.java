package com.hosir.controller;

@Controller
@RequestMapping("/base")
public class BaseController {

  @RequestMapping("/list")
  @ResponseBody
  public string getList(){
    Map<String,Object> result = new HashMap<>();
    result.put("status", true);
    return "";
  }

}
