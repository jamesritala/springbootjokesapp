package guru.springboot.jokes.controller;

import guru.springboot.jokes.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    @Autowired
    private JokeService jokeService;

    @RequestMapping("/")
    public String getJoke(Model model){

        model.addAttribute("joke",jokeService.getJoke());

        return "chucknorris";
    }
}
