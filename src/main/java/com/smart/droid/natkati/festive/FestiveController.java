package com.smart.droid.natkati.festive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/festive")
public class FestiveController {

    @Autowired
    private FestiveRepository festiveRepository;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Festive> getAllFestive() {
        return festiveRepository.findAll();
    }

    @GetMapping(path = "/{year}")
    public @ResponseBody
    Iterable<Festive> getFestiveByYear(@PathVariable Integer year) {
        return festiveRepository.findByYear(year);
    }

}
