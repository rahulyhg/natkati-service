package com.smart.droid.natkati.naal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/natkal")
public class NaalController {

    @Autowired
    private NaalRepository naalRepository;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Naal> getAllNatkal() {
        return naalRepository.findAll();
    }

}
