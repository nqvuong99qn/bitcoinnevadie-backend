package com.BitcoinNevaDie.BND.client;


import com.BitcoinNevaDie.BND.DTO.PricesCryptoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PricesRestClient {


    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<PricesCryptoDTO[]> getCryptoInformation(int id) {
        System.out.println("API CoinmarKet CAP");
        return restTemplate.getForEntity("https://api.coinmarket.com/v1/ticker/"+"oid", PricesCryptoDTO[].class);
    }
}
