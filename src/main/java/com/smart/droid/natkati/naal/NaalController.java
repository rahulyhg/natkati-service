package com.smart.droid.natkati.naal;

import com.sun.media.jfxmedia.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/natkal")
public class NaalController {

    @Autowired
    private NaalRepository naalRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Naal> getAllNatkal() {
        return naalRepository.findAll();
    }

    @GetMapping(path = "/naal/{id}")
    public @ResponseBody Naal naal(@PathVariable Integer id) {
        Logger.logMsg(Logger.INFO, "Path Variable : " + id);
        return naalRepository.findById(id)
                .orElseThrow(() -> new NaalNotFoundException(id));
    }

    /*
    @GetMapping(path = "/{year}/{month}")
    public @ResponseBody
    Iterable<Naal> getMonthNatkal() {
        return naalRepository.findAll();
    }
    */

}
