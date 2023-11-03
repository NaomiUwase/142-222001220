public class SimpleInterestCalculator {
    
        public static void main(String[] args) {
            double principal = 100000.0; // Initial deposit in Rwandan Francs (RWF)
            double rate = 5.0; // Annual interest rate in percentage
            int years = 5; // Number of years
    
            BankAccount bobAccount = new BankAccount(principal, rate, years);
    
            double simpleInterest = bobAccount.calculateSimpleInterest();
    
            System.out.println("Mr. Bob's simple interest after " + years + " years is: " + simpleInterest + " RWF");
        }
    }
    
    
