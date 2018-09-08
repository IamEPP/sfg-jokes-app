package br.com.iamepp.sfgjokesapp.controllers

import br.com.iamepp.sfgjokesapp.services.JokeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller("/")
class JokeController(@Autowired
                     private val jokeService: JokeService) {

    @GetMapping
    fun showJoke(model: Model): String {
        model.addAttribute("joke", jokeService.getJoke())
        return "chucknorris"
    }
}