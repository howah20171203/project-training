package com.hosir.controller;

@Controller
@RequestMapping("/base")
public class BaseController {

  @RequestMapping("/list")
  @ResponseBody
  public string getList(){
    Map<String,Object> result = new HashMap<>();
    result.put("status", true);
    result.put("state", false);
	Map<String,Object> data = new HashMap<>();
	data.put("01002001","1");
	data.put("01002002","2");
	data.put("01002003","3");
	result.put("data", data);
    return "";
  }

}
