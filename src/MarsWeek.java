import java.util.Scanner;

public class MarsWeek {

    public static void main (String[]args) throws InterruptedException {

        String colonyName= "Mirceem";
        int shipPopulation=300;
        double meals= 4000.0;
        boolean landing=true;
        double mealsADay=0.75;

        meals-=(2*0.75)*shipPopulation;
        System.out.println("Meals left after landing "+meals);

        meals*=1.5;
        System.out.println("Meals after finding extra crate "+ meals);

        shipPopulation+=5;
        System.out.println("After births of babies ship population is "+shipPopulation);


        String landingLocation="The Plain";
        if(landingLocation.equalsIgnoreCase("The Plain")){
            System.out.println("Bbzzz Landing on the Plain");
        }else{
            System.out.println("ERROR Flight plan already set. Landing on the Plain");
        }

        landing=landingCheck(10);

        GuessingGame game= new GuessingGame();
        MarsExpedition expedition= new MarsExpedition();
        Scanner scanner= new Scanner(System.in);
        FindingsList findings= new FindingsList(scanner);
        scanner.close();


    }

    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
    for(int minute=0; minute < minutesLeft; minute++){

        if(minute%2==0 && minute%3==0){
            System.out.println("Keep Center "+minute);
        }else if(minute%2==0){
            System.out.println("Right "+ minute);
        }else if(minute%3==0){
            System.out.println("Left "+minute);
        }else{
            System.out.println("Calculating "+minute);
        }
        Thread.sleep(250);

    }
        System.out.println("Landed!");
          return false;


    }

}
