package soap.service;


import java.math.BigDecimal;

public interface PaymentService {

    /**
     * 支付
     * @param account 账号
     * @param money 支付金额
     * @return
     */
    String doPay(String account, BigDecimal money);
}
