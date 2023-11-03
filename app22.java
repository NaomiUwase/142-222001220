class BankAccount {
    private double principal;
    private double rate;
    private int years;

    public BankAccount(double principal, double rate, int years) {
        this.principal = principal;
        this.rate = rate;
        this.years = years;
    }

    public double calculateSimpleInterest() {
        return (principal * rate * years) / 100;
    }
}

class SimpleInterestCalculator {
    public static void main(String[] args) {
        double principal = 100000.0; 
        double rate = 5.0; 
        int years = 5; 

        BankAccount bobAccount = new BankAccount(principal, rate, years);

        double simpleInterest = bobAccount.calculateSimpleInterest();

        System.out.println("Mr. Bob's simple interest after " + years + " years is: " + simpleInterest + " RWF");
    }
}
