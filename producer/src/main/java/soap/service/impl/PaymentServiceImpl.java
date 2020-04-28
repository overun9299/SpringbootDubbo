package soap.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import soap.service.PaymentService;

import java.math.BigDecimal;


@Service
@Component
public class PaymentServiceImpl implements PaymentService {


    @Override
    public String doPay(String account, BigDecimal money) {

        if (account == null) {
            return "支付失败";
        }
        return "支付成功: 帐号==> "+account+"\t 消费:\t"+money.toString();
    }
}
