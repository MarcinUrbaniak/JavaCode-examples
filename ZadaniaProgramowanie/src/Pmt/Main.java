package Pmt;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BigDecimal installment = new Pmt().calculateInstallment("2000");
        System.out.println(installment);




    }
}
