package com.moviebooking.multiplexService.multiplexScreen;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MultiplexScreenService {

    @Autowired
    private MultiplexScreenRepository multiplexScreenRepository;


    @Transactional(Transactional.TxType.REQUIRED)
    public MultiplexScreen addMultiplexScreen(MultiplexScreen multiplexScreen){
        return multiplexScreenRepository.save(multiplexScreen);
    }
}
