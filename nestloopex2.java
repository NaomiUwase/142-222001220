public class nestloopex2 {
        public static void main(String[] args) {
            String[] scenarios = {"Working", "Eating", "Sleeping", "Studying", "Traveling"};
    
            for (int day = 1; day <= 7; day++) {
                System.out.println("Day " + day + ":");
                
                for (String scenario : scenarios) {
                    System.out.println("   " + scenario);
                }
                
                System.out.println();
            }
        }
    }
    

    

