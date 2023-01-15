import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsList {

    public FindingsList(Scanner scan) throws InterruptedException{
    Thread.sleep(500);

        //welcome message
        System.out.println("Welcome back from your expedition. Time to catalog everything you found.");

        //storing samples
        ArrayList<String> rockList=new ArrayList<String>();

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        //removing nonrock
        System.out.println("Everything downloaded and see the list of rocks available:  "+"\n"+rockList);
        rockList.remove("not rock");

        System.out.println("\tRock List after Removal: "+rockList+": Perfect ");

        Thread.sleep(1000);

        //storing fossils
        HashMap<String, String > fossilDirectory=new HashMap<>();

        fossilDirectory.put("Bird Fossil", "Bird fossil has wings implying it was capable of flight");

        fossilDirectory.put("Fish fossil", "The fossil is vaguely fish shaped implies there was once water");

        fossilDirectory.put("Tooth fossil", "The tooth from an unknown fossil");

        System.out.println("Fossil data downloaded");

        //fossils information
        System.out.println("Which of the fossils would you like to learn more about? (Bird, fish, or tooth)");
        String fossilChoice = scan.next();

        boolean found = false;
        for (String key : fossilDirectory.keySet()) {
            if (key.equalsIgnoreCase(fossilChoice + " Fossil")) {
                found = true;
                System.out.println("Information about " + fossilChoice + " fossil:");
                System.out.println(fossilDirectory.get(key));
                break;
            }
        }
        if(!found) {
            System.out.println("Invalid choice. Please choose one of the following: Bird, fish, or tooth");
        }

//        if(fossilChoice.equalsIgnoreCase("Bird")){
//            System.out.println("The choice is: "+fossilChoice+ "\nDescription"+ fossilDirectory.get(fossilChoice));
//        }else if(fossilChoice.equalsIgnoreCase("Tooth")){
//            System.out.println("The choice is: "+fossilChoice+ "\nDescription"+ fossilDirectory.get(fossilChoice));
//
//        }else{
//            System.out.println("The choice is: "+fossilChoice+ "\nDescription : "+ fossilDirectory.get(fossilChoice));
//        }

        Thread.sleep(700);
        // supplies brought
        HashSet<String> supplies=new HashSet<>();
        supplies.add("GPS device");
        supplies.add("First aid kit");
        supplies.add("Satellite phone");

        System.out.println("\tSupplies Before Expedition");
        for (String item:supplies){
            System.out.println("Item: "+ item);
        }

        supplies.remove("First aid kit");
        System.out.println("\tSupplies after Expedition");
        for (String item:supplies){
            System.out.println("Item: "+item);
        }

    }


}
