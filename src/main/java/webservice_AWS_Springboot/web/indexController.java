package webservice_AWS_Springboot.web;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import webservice_AWS_Springboot.config.auth.LoginUser;
import webservice_AWS_Springboot.config.auth.dto.SessionUser;
import webservice_AWS_Springboot.service.posts.PostsService;


@RequiredArgsConstructor
@Controller
public class indexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user){
        model.addAttribute("posts", postsService.findAllDesc());

        if(user != null){
            model.addAttribute("userName", user.getName());
        }

        return "index";
    }
}