package com.web_dev.wiki_project.templates;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.web_dev.wiki_project.services.EndpointsService;
import com.web_dev.wiki_project.services.UserStoriesService;

@Controller
@RequestMapping("/wiki")
public class WikiTemplates {

    @Autowired
    private UserStoriesService storiesService;
    @Autowired
    private EndpointsService endpointsService;

    @GetMapping("/")
    public ModelAndView defaultMode() {
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
        ModelAndView model = new ModelAndView("requirements-model-view");

        final var arrendadorStories = storiesService.getArrendStories();
        final var adminStories = storiesService.getAdminStories();
        model.addObject("arrendadorStories", arrendadorStories);
        model.addObject("adminStories", adminStories);
        return model;
    }


    @GetMapping("/architecture")
    public ModelAndView architectureModelView() {
        return new ModelAndView("architecture-model-view");
    }

    @GetMapping("/development")
    public ModelAndView developmentModelView() {
        ModelAndView model =  new ModelAndView("development-model-view");
        final var endpoints = endpointsService.getEndpoints();
        System.out.println(endpoints.size());
        model.addObject("endpoints", endpoints);
        return model;
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
