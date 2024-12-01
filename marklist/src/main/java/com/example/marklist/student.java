package com.example.marklist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"cls","name","rollNo"})
public class student{
	@GetMapping("/")
	public String st() {
		
		return "student" ;
	}
	@PostMapping("/std")
	public String stt(@RequestParam("name") String name,
                      @RequestParam("rollNo") String rollNo,
                      @RequestParam("cls") String cls,
                      Model model) {
		
       model.addAttribute("name", name);
       model.addAttribute("rollNo", rollNo);
       model.addAttribute("cls",cls);
       
       return "marks" ;
    }
}