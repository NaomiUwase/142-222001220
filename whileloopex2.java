public class whileloopex2 {
    

        public static void main(String[] args) {
            int goalsScored = 0;
    
            while (goalsScored < 5) {
                goalsScored++;
                System.out.println("Goal! Total goals: " + goalsScored);
            }
    
            System.out.println("The match is over. Final score: " + goalsScored + " - " + (goalsScored - 1));
        }
    }
    

