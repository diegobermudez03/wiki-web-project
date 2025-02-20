package com.web_dev.wiki_project.templates;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/wiki")
public class WikiTemplates {

    @GetMapping("/")
    public ModelAndView defaultModelAndView() {
        return new ModelAndView("description-model-view");
    }

    @GetMapping("/description")
    public ModelAndView descriptionModelView() {
        return new ModelAndView("description-model-view");
    }

    @GetMapping("/presentation")
    public ModelAndView presentationModelView() {
        return new ModelAndView("presentation-model-view");
    }

    @GetMapping("/requirements")
    public ModelAndView requirementsModelView() {
        return new ModelAndView("requirements-model-view");
    }

    @GetMapping("/architecture")
    public ModelAndView architectureModelView() {
        return new ModelAndView("architecture-model-view");
    }

    @GetMapping("/development")
    public ModelAndView developmentModelView() {
        return new ModelAndView("development-model-view");
    }

    @GetMapping("/testing")
    public ModelAndView testingModelView() {
        return new ModelAndView("testing-model-view");
    }

    @GetMapping("/deployment")
    public ModelAndView deploymentModelView() {
        return new ModelAndView("deployment-model-view");
    }

    @GetMapping("/contact-us")
    public ModelAndView contactUsModelView() {
        return new ModelAndView("contact-us-model-view");
    }


}
