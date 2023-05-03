public class CashDeposit {

    public static void main(String[] args) {
    double sumDeposit;
    double sumPersent;
    double persentDeposit;
    int termDepositYear;

        sumDeposit = Double.parseDouble(args[0]);
        persentDeposit =Double.parseDouble(args[1]);
        termDepositYear = Integer.valueOf(args[2]);
        double sumTotal;
        for (int i = 1; i <=  termDepositYear; i++) {
            sumTotal = sumDeposit*Math.pow(1+(persentDeposit/100)/12, 12);
            sumPersent = sumTotal - sumDeposit;
            System.out.printf("On the %d year sum persent %.2f UAH sum total %.2f UAH\n", i, sumPersent, sumTotal);
            sumDeposit = sumTotal;
        }
    }
}
