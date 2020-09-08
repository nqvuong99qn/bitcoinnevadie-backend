package com.BitcoinNevaDie.BND.Service;


import com.BitcoinNevaDie.BND.DTO.PricesCryptoDTO;
import com.BitcoinNevaDie.BND.client.PricesRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PriceService {

    @Autowired
    private PricesRestClient pricesRestClient;


    public ResponseEntity<PricesCryptoDTO[]> getInformation(int id){
        return pricesRestClient.getCryptoInformation(id);
    }

}
