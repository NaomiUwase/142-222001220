public class compoundinterest {
    
        static double comp(double p, double r, double t, double n){
            return  p*(Math.pow(1+(r/(n*100)),n*t));
        }
        public static void main(String[] args) { 
            
            System.out.println("the amount he will have paid after 3 years period is equal to: " + comp(500000,18,3,12));
        }  
    }
    

