public class breakstatementex1 {


        public static void main(String[] args) {
            int minutesPlayed = 0;
    
            while (minutesPlayed < 90) {
                System.out.println("Minutes played: " + minutesPlayed);
                
                if (minutesPlayed == 45) {
                    System.out.println("It's halftime!");
                    break; // Exiting the loop at halftime
                }
    
                minutesPlayed++;
            }
    
            System.out.println("The match is over.");
        }
    }
    
    

