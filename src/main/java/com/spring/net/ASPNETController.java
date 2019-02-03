package com.spring.net;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ASPNETController {

  
  @RequestMapping("aspnet")
  public String aspnetTest() {
    return "aspnet";
  }
  
  
}
