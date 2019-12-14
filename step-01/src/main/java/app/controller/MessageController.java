package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/msg")
public class MessageController {

  @GetMapping
  public String handleGet() {
    return "hello_msg_template";
  }

  @GetMapping("/{id}")
  public String handleGetOne(@PathVariable String id) {
    return "Not the point right now";
  }

//  @ResponseBody
//  @RequestMapping(method = RequestMethod.POST, path = "/new")
//  public String handlePutOne_2(HttpServletRequest req) {
//    String id = req.getParameter("id");
//    System.out.println(id);
//    return String.format("The parameter was %s", id);
//  }

  @RequestMapping(method = RequestMethod.POST, path = "/new")
  public String handlePost(PostFormMessage formData) {
    System.out.println(formData);
    return "hello_msg_template";
  }
}
