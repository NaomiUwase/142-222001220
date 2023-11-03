public class breakstatmentex2 {
        public static void main(String[] args) {
            int totalGoals = 0;
    
            while (true) {
               
                int goalsScored = (int) (Math.random() * 3); 
                totalGoals += goalsScored;
    
                System.out.println("Goals scored in this match: " + goalsScored);
                System.out.println("Total goals so far: " + totalGoals);
    
               
                if (totalGoals >= 10) {
                    System.out.println("We've reached the goal target!");
                    break; 
                }
            }
    
            System.out.println("The game is over.");
        }
    }
    
    

