package com.moviebooking.multiplexService.multiplexScreen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/multiplexScreen")
public class MultiplexScreenController {

    @Autowired
    private MultiplexScreenService multiplexScreenService;

    @PutMapping
    public MultiplexScreen addMultiplexScreen(@RequestBody MultiplexScreen multiplexScreen) {
        System.out.println("Adding multiplex screen : " + multiplexScreen);
        return multiplexScreenService.addMultiplexScreen(multiplexScreen);
    }

}
