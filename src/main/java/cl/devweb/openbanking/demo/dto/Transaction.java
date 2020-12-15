package cl.devweb.openbanking.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Transaction {

	private int type;
    private int accountNumber;
    private int currency;
    private int amount;
    private String merchantName;
    private String merchantLogo;


    public Transaction(int type, int accountNumber, int currency, int amount, String merchantName, String merchantLogo) {
        this.type = type;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.amount = amount;
        this.merchantName = merchantName;
        this.merchantLogo = merchantLogo;
    }

}
