package Pmt;

import java.math.BigDecimal;


public class Pmt {


    /**
     * (D7*D9/12)/(1-(1+D9/12)^(-(D11/12)*12))
     *
     * where:
     *
     * D7 = Finance Amount
     * D9 = Rate
     * D11 = Term
     *
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
        BigDecimal interestRate = BigDecimal.valueOf(0.00172/12);
        int  numberOfinstallments =  36;

        BigDecimal a = (new BigDecimal(ammount)).multiply(interestRate);
        BigDecimal b = (interestRate.add(new BigDecimal("1"))).pow(numberOfinstallments);;
        BigDecimal c = a.multiply(b);
        BigDecimal d = b.subtract(new BigDecimal("1"));
        installment = c.divide(d, BigDecimal.ROUND_HALF_EVEN);
        installment = installment.setScale(2, BigDecimal.ROUND_HALF_EVEN);

        return installment;

    }

}
