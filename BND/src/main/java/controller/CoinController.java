package controller;


import com.BitcoinNevaDie.BND.Service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoinController {

    @Autowired
    private PriceService priceService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getPrices(@PathVariable int id){
        return ResponseEntity.ok(priceService.getInformation(id).getBody());
    }
}
