
package com.web.BacktoSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String showIndex() {
        System.out.println("GEt Mapping '/' called :");
        return "index";
    }

}

//       import org.springframework.stereotype.Controller;
//        import org.springframework.ui.Model;
//        import org.springframework.web.bind.annotation.GetMapping;
//
//        import java.util.Date;
//
//@Controller
//public class IndexController {
//
//    @GetMapping("/")
//    public String showIndex(Model model) {
//        model.addAttribute("message", "Hello everyone, we are go to back to Spring with together");
//        model.addAttribute("date", new Date());
//
//        return "index";
//    }
//}