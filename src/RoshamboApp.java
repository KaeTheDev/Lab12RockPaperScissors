import java.util.Scanner;

public class RoshamboApp
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        TheJets jets = new TheJets();
        TheSharks sharks = new TheSharks();



        System.out.print("Enter your name: ");
        String userName = scan.nextLine();
        System.out.println();


        System.out.print("Would you like to play against TheJets or TheSharks(J/S): ");
        String opponent = scan.nextLine();
        System.out.println();

       if(opponent.equalsIgnoreCase("J"))
       {
            System.out.println("Your opponent is " + jets.getName());
        }
       else if(opponent.equalsIgnoreCase("S"))
       {
           System.out.println("Your opponent is " + sharks.getName());
        }

        System.out.println();
        System.out.print("Rock, Paper, or Scissors?: ");
        String userResponse = scan.nextLine();

        System.out.println(userName + ": " + userResponse);

       if(opponent.equalsIgnoreCase("J"))
       {
           System.out.println(jets.getName()+ ": " + jets.generateRoshambo());

           String theJetsAns = jets.generateRoshambo();

           if(userResponse.equalsIgnoreCase("Rock") && theJetsAns == "Rock")
           {
               System.out.println("Draw!");
           }

           else if(userResponse.equalsIgnoreCase("Paper") && theJetsAns == "Rock" )
           {
               System.out.println(userName + " wins!");
           }
           else if(userResponse.equalsIgnoreCase("Scissors") && theJetsAns == "Rock")
           {
               System.out.println(userName + " wins!");
           }

       }

       if(opponent.equalsIgnoreCase("S"))
       {
           System.out.println(sharks.getName() + ": " + sharks.generateRoshambo());

           String theSharksAns = sharks.generateRoshambo();

           if(userResponse.equalsIgnoreCase("Paper") && opponent.equalsIgnoreCase("Rock"))
           {
               System.out.println(userName + " wins!");
           }
           else if(userResponse.equalsIgnoreCase("Scissors") && opponent.equalsIgnoreCase("Paper"))
           {
               System.out.println(userName + " wins!");
           }
           else if(userResponse.equalsIgnoreCase("Rock") && opponent.equalsIgnoreCase("Scissors"))
           {
               System.out.println(userName + " wins!");
           }
          else
              {

               System.out.println(sharks.getName() + " wins!");

           }



       }

    



    }


}
