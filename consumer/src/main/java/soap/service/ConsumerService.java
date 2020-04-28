package soap.service;

import java.math.BigDecimal;

public interface ConsumerService {


    String doPay(String account, BigDecimal money);
}
