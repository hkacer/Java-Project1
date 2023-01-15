import java.util.Scanner;

public class MarsExpedition {
    private String playerName;
    private int teamSize;
    private String snack;
    private String vehicle;
    public MarsExpedition(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Welcome to the Mars Expedition");
        System.out.println("Booting up....");
        System.out.print(".....");
        System.out.print("...");
        System.out.println("..");
        System.out.println("Ready!");


        //get player name
        System.out.println("Please enter your name");
        playerName= scan.nextLine();

        //welcome and ready check
        System.out.println("Hi, "+playerName+" \nWelcome to the Expedition prep program. Are you ready to head out into the new world? \nType Y or N");


        String userInput=scan.nextLine();
        if(userInput.toUpperCase().equalsIgnoreCase("Y")){
            System.out.println("I knew you would say that. You are team leader for a reason. ");
        }else{
            System.out.println("Too bad you are team leader. You have to go.");
        }

        //get team size
        System.out.println("How many people do you want in your team? ");
        teamSize= scan.nextInt();


        if(teamSize>2){
            System.out.println("That’s way to many people. We can only send 2 more members. ");
            teamSize=2;
        }else if(teamSize<2){
            System.out.println("Teams cannot be less than 2 people. Add more people to continue. ");
            teamSize=2;
        }else if(teamSize==2){
            System.out.println("That's a perfect sized team. Good job. ");

        } else{
            System.out.println("Please add the number only. ");
        }

       //het snack
        scan.nextLine();
        System.out.println("You are allowed to bring one snack with you. What do you want to bring? ");
        snack= scan.nextLine();
        System.out.println("Nice choice, you will be bringing a "+snack+" with you. Click the enter to continue!");

        //get vehicle
        System.out.println("Select one of these vehicles to continue. Your answer can be A,B, C,or D. ");
        System.out.println("A. Horse");
        System.out.println("B. Car ");
        System.out.println("C. Truck");
        System.out.println("D. Van");

        String selectVehicle=scan.nextLine();
        if (selectVehicle.equalsIgnoreCase("A")){
            vehicle= "horse";
        }else if(selectVehicle.equalsIgnoreCase("B")){
            vehicle= "car";

        }else if (selectVehicle.equalsIgnoreCase("C")){
            vehicle= "truck";
        }else if(selectVehicle.equalsIgnoreCase("D")){
            vehicle= "van";
        }else{
            vehicle="Invalid Selection";
        }

        //final message
        System.out.println("Preparing for expedition with team leader " + playerName + " and a team size of " + teamSize + ". Bringing snack " + snack + " and traveling in " + vehicle + ".");

        for(int i=5; i>0; i--) {
            System.out.println(i + " seconds");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Blast off!");

    }

}
