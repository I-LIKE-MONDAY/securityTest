package com.bitc.securitytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/sec")
@Controller
public class SecTestController {

  @RequestMapping("")
  public String index() {
    return "index";
  }

  @RequestMapping("/all")
  public String all() {
    return "sec/all";
  }

  @RequestMapping("member")
  public String member() {
    return "sec/member";
  }

  @RequestMapping("/admin")
  public String admin() {
    return "sec/admin.html";
  }
}
