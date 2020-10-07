package com.kroger.b2b.exampleservice.service;

import com.kroger.b2b.exampleservice.service.model.ResponseObject;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
  public ResponseObject getResponse(String arg) {
    boolean flag;
    if (arg.equalsIgnoreCase("hello world")) {
      flag = true;
    } else {
      flag = false;
    }
    ResponseObject res = new ResponseObject();
    res.setFlag(flag);
    res.setMessage("Response is successfully retrived");
    return res;
  }
}
