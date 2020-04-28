package soap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import soap.service.ConsumerService;

import java.math.BigDecimal;

@RestController
public class OrderController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value = "/doPay")
    public String doPay() {
        String account = "soap9299";
        BigDecimal money = new BigDecimal(100000);
        return consumerService.doPay(account , money);
    }
}
