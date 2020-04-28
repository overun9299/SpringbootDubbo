package soap.service.impl;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import soap.service.ConsumerService;
import soap.service.PaymentService;

import java.math.BigDecimal;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Reference
    PaymentService paymentService;


    @Override
    public String doPay(String account, BigDecimal money) {

        return paymentService.doPay(account , money);
    }
}
