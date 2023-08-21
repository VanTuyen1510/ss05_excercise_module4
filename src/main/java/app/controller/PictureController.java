package app.controller;

import app.entity.MyFeedback;
import app.service.IPictureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/picture")
public class PictureController {
    @Autowired
    private IPictureService pictureService;

    @GetMapping("")
    public String show(Model model) {
        model.addAttribute("feedback", new MyFeedback());
        model.addAttribute("list", pictureService.findAll());
        return "/index";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute("feedback") MyFeedback myFeedback) {
        pictureService.save(myFeedback);
        return "redirect:/picture";
    }


    @GetMapping("/like")
    public String like(@RequestParam("id") int id){
        pictureService.updateLike(id);
        return "redirect:/picture";
    }
}
