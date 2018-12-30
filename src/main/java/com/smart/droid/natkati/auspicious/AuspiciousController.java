package com.smart.droid.natkati.auspicious;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/auspicious")
public class AuspiciousController {

    @Autowired
    private AuspiciousRepository auspiciousRepository;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Auspicious> getAllAuspicious() {
        return auspiciousRepository.findAll();
    }

    @GetMapping(path = "/{year}")
    public @ResponseBody
    Iterable<Auspicious> getAuspiciousByYear(@PathVariable Integer year) {
        return auspiciousRepository.findByYear(year);
    }

}
