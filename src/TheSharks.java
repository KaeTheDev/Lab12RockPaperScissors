import java.util.Random;

 public class TheSharks extends Player
 {
  String name = "The Sharks";
  private int RoshamboNumber;

     public String getName()
   {
      return name;
    }

   public void setName(String name)
  {
       this.name = name;
  }




     @Override
     public String generateRoshambo()
     {
         Random r = new Random();
         String answer = "";

         int rand = r.nextInt(3) + 1;
         if (rand == 1) {
             answer = Roshambo.ROCK.toString();

         } else if (rand == 2) {
             answer = Roshambo.PAPER.toString();

         } else if (rand == 3) {
             answer = Roshambo.SCISSORS.toString();

         }
         return answer;
     }
 }

