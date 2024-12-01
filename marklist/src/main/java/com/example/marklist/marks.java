package com.example.marklist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class marks {

    @PostMapping("/ma")
    public String submitMarks(@SessionAttribute("name") String name,
    		                  @SessionAttribute("rollNo") String rollNo,
    		                  @SessionAttribute("cls") String cls,
    		                  @RequestParam("subject1") int subject1,
                              @RequestParam("subject2") int subject2,
                              @RequestParam("subject3") int subject3,
                              Model model) {
        int total = subject1 + subject2 + subject3;
        float average = total / 3.0f;
       
        model.addAttribute("name", name);
        model.addAttribute("rollNo", rollNo);
        model.addAttribute("cls", cls);
        model.addAttribute("subject1", subject1);
        model.addAttribute("subject2", subject2);
        model.addAttribute("subject3", subject3);
        model.addAttribute("total", total);
        model.addAttribute("average", average);
       

        return "result";
    }
}
