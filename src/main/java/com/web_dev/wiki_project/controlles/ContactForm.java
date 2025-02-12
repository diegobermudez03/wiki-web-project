package com.web_dev.wiki_project.controlles;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/contact")
public class ContactForm {

    @PostMapping("/")
    public ModelAndView losPipolTemplateModelAndView() {
        return new ModelAndView("wiki-model-view");
    }
}
