package Pmt;

import java.math.BigDecimal;

public class Pmt {


    /**
     * A = (Sr(r+1)^N)/(((r+1)^N)-1)
     * gdzie
     * A - rata równa kredytu
     * S - wysokość kredytu
     * r - stopa dostosowana (czyli np dla 3,5% 0,035/12)
     * N - liczba rat
     *
     * dla rat malejących:
     * A(n) = S(1+(N-n+1)*r)/N
     * gdzie
     * A(n) - n-ta rata
     * n - n-ty miesiąc spłaty
     */

    public BigDecimal calculateInstallment(String ammount){

        BigDecimal installment = BigDecimal.ZERO;
        BigDecimal interestRate = new BigDecimal("0.00172");
        int numberOfinstallments = 36;



        return installment;
    }

}
