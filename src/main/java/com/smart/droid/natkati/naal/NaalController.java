package com.smart.droid.natkati.naal;

import com.smart.droid.natkati.util.TypeUtil;
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
    public @ResponseBody
    Iterable<Naal> getAllNatkal() {
        return naalRepository.findAll();
    }

    @GetMapping(path = "/{year}")
    public @ResponseBody
    Iterable<Naal> getNatkalByYear() {
        //return naalRepository.findAll();
        return null;
    }

    @GetMapping(path = "/{month}")
    public @ResponseBody
    Iterable<Naal> getNatkalByYearMonth() {
        //return naalRepository.findAll();
        return null;
    }


    @GetMapping(path = "/naal/{queryDate}")
    public @ResponseBody
    Naal naal(@PathVariable String queryDate) {
        return naalRepository.findByCalDate(TypeUtil.toISOLocalDate(queryDate))
                .orElseThrow(() -> new NaalNotFoundException(queryDate));
    }


}
