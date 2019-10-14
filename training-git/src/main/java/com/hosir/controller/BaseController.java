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
	data.put("01002004","6");
	data.put("01002005","5");
	data.put("01002006","4");
	data.put("01002007","8");
	data.put("01002008","7");
	data.put("01002009","9");
	data.put("01002010","10");
	data.put("01002011","11");
	data.put("01002012","12");
	data.put("01002013","13");
	data.put("01002014","14");
	result.put("data", data);
    return "";
  }

}
