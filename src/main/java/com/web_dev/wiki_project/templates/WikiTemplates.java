package com.web_dev.wiki_project.templates;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.web_dev.wiki_project.entities.UserStoryEntity;
import com.web_dev.wiki_project.services.UserStoriesService;

@Controller
@RequestMapping("/wiki")
public class WikiTemplates {

    @Autowired
    private UserStoriesService storiesService;

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

        List<UserStoryEntity> arrendadorStories = storiesService.getArrendStories();
        List<UserStoryEntity> adminStories = storiesService.getAdminStories();
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
