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
