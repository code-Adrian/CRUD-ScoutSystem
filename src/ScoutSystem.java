import java.util.Scanner;

public class ScoutSystem {

    private ScoutList scouts = new ScoutList();
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        new ScoutSystem();
    }

    public ScoutSystem() {
        runMenu();
    }


    public int mainMenu() {

        System.out.println("Scouting Ireland Menu");
        System.out.println("__________________________");
        System.out.println("Please Select one of the following options: ");
        System.out.println("1 - Register a new Scout");
        System.out.println("2 - List all Scouts");
        System.out.println("3 - Delete a Scout");
        System.out.println("4 - Update a Scout");
        System.out.println("-------------------------");
        System.out.println("5 - List Scouts by Group Name (Beaver/Cub/Scouter)");
        System.out.println("6 - Calculate Total Annual Fees Recieved from Scouts");
        System.out.println("7 - View Total number of Scouts by Group");
        System.out.println("8 - Summary Report of all Scout Membership numbers");
        System.out.println("9 - Search Scouts by Name");
        System.out.println("-------------------------");
        System.out.println("(10 - Save data to XML");
        System.out.println("(11 - Load from XML");
        System.out.println("-------------------------");
        System.out.println("0 - To Exit");
        System.out.println("===:");
        int choice = input.nextInt();
        return choice;

    }

    public void runMenu() {
        int option = mainMenu();
        while (option != 0) {
            switch (option) {
                case 1:
                    addScout();
                    break;
                case 2:
                     listAllScouts();
                    break;
                case 3:
                    removeScout();
                    break;
                case 4:
updateScout();
                    break;
                case 5:
                    listScoutsByGroup();
                    break;
                case 6:
                   TotalFee();
                    break;
                case 7:
                    listNumberOfScoutsByGroup();
                    break;
                case 8:
                    listTotalNumberOfScouts();
                    break;
                case 9:
                    ListScoutsByName();
                    break;
                case 10:
                    try {
                    scouts.save();
                    } catch (Exception e) {
                        System.out.println("Error saving to file" + e);
                    }
                    break;
                case 11:
                    try {
                        scouts.load();
                    } catch (Exception e) {
                        System.out.println("Error loading to file" + e);
                    }
                    break;
                default:
                    System.out.println("Invalid option entered: " + option);


            }
            System.out.println("\nPress any key to continue...");
            input.nextLine();
            input.nextLine();


            option = mainMenu();
        }
        System.out.println("Exiting...Bye");
        System.exit(0);


    }

    private void addScout() {
int ScoutChoice;
System.out.println("Which Scout would you like to add?");
System.out.println("\t 1. Beaver Scout");
System.out.println("\t 2. Cub Scout");
System.out.println("\t 3. Scouter ");

ScoutChoice = input.nextInt();
if(ScoutChoice == 1) {
    System.out.println("Scout name:");
    String Name = input.next();
    System.out.print("County:");
    String County = input.next();
    System.out.println("Date of Birth:");
    String Date = input.next();
    System.out.println("Address:");
    String Address = input.next();
    System.out.println("Phone number:");
    String Phone = input.next();

         ///////////////////////////////

System.out.println("==Enter Special Interest Details==");
System.out.println("Enter Special Interest category:");
String category = input.next();
System.out.println("Enter Details:");
String Details = input.next();
System.out.println("Enter Date of Badge Received");
String Badge = input.next();

    System.out.println("Parent Phone number:");
    String ParentPhone = input.next();

    SpecialInterest specialInterest = new SpecialInterest(category,Details,Badge);
BeaverScout b1 = new BeaverScout(Name, County, Date,Address,Phone,specialInterest,ParentPhone);
scouts.addScout(b1);




}else if(ScoutChoice == 2){

    System.out.println("Scout name:");
    String Name = input.next();
    System.out.print("County:");
    String County = input.next();
    System.out.println("Date of Birth:");
    String Date = input.next();
    System.out.println("Address");
    String Address = input.next();
    System.out.println("Phone number:");
    String Phone = input.next();

    ///////////////////////////////

    System.out.println("==Enter Special Interest Details==");
    System.out.println("Enter Special Interest category:");
    String category = input.next();
    System.out.println("Enter Details:");
    String Details = input.next();
    System.out.println("Enter Date of Badge Received");
    String Badge = input.next();

    System.out.println("Parent Phone number:");
    String CubPhone = input.next();

    SpecialInterest specialInterest = new SpecialInterest(category,Details,Badge);
    CubScout b1 = new CubScout(Name, County, Date,Address,Phone,specialInterest,CubPhone);
    scouts.addScout(b1);


}else if(ScoutChoice == 3){
    System.out.println("Scout name:");
    String Name = input.next();
    System.out.print("County:");
    String County = input.next();
    System.out.println("Date of Birth:");
    String Date = input.next();
    System.out.println("Address");
    String Address = input.next();
    System.out.println("Phone number:");
    String Phone = input.next();

    ///////////////////////////////

    System.out.println("==Enter Special Interest Details==");
    System.out.println("Enter Special Interest category:");
    String category = input.next();
    System.out.println("Enter Details:");
    String Details = input.next();
    System.out.println("Enter Date of Badge Received");
    String Badge = input.next();

    System.out.println("Parent Phone number:");
    String ScouterPhone = input.next();

    SpecialInterest specialInterest = new SpecialInterest(category,Details,Badge);
    Scouter b1 = new Scouter(Name, County, Date,Address,Phone,specialInterest,ScouterPhone);
    scouts.addScout(b1);


}
    }

    public void removeScout(){
        if (scouts.numberOfScouts() > 0) {

            System.out.println(scouts.listOfScouts());
            System.out.println("Please enter the Index of the Scout you would like to remove/delete:");
            int removeScout = input.nextInt();
            scouts.removeScout(removeScout);


            System.out.println("Scout index: " + removeScout + " was successfully removed.");
        } else {
            System.out.println("There is no scouts to remove.");
        }
    }



public void listAllScouts(){
        System.out.println(scouts.listOfScouts()+"\n");
}

    private void ListScoutsByName() {
        System.out.println("Enter Scout name to search for:");
        String ScoutsByName = input.next();
        System.out.println(scouts.ListScoutsByName(ScoutsByName));

    }



    private void listScoutsByGroup() {
        System.out.println("1.)Beaver Scout");
        System.out.println("2.)Cub Scout");
        System.out.println("3.)Scouter");
        System.out.println("Enter Choice [1-3]:");
        String ScoutsByName = input.next();
if(ScoutsByName.contentEquals("1")){
    System.out.println(scouts.ListAllScoutsByGroup("BeaverScout"));
}else if(ScoutsByName.contentEquals("2")){
    System.out.println(scouts.ListAllScoutsByGroup("CubScout"));
}else if(ScoutsByName.contentEquals("3")){
    System.out.println(scouts.ListAllScoutsByGroup("Scouter"));
}else{
    System.out.println("Wrong Input Entered...");
}

    }

public void listTotalNumberOfScouts(){
        System.out.println(scouts.ListTotalNumberOfScouts());
}


    public void listNumberOfScoutsByGroup(){
        if(scouts.numberOfScouts() <= 0){
            System.out.println("There are no Scouts to list");
        }else {
            System.out.println("1.)Beaver Scout");
            System.out.println("2.)Cub Scout");
            System.out.println("3.)Scouter");
            System.out.println("Enter Choice [1-3]:");
            String ScoutsByName = input.next();
            if (ScoutsByName.contentEquals("1")) {
                System.out.println(scouts.ListNumberOfScoutsByGroup("BeaverScout"));
            } else if (ScoutsByName.contentEquals("2")) {
                System.out.println(scouts.ListNumberOfScoutsByGroup("CubScout"));
            } else if (ScoutsByName.contentEquals("3")) {
                System.out.println(scouts.ListNumberOfScoutsByGroup("Scouter"));
            } else {
                System.out.println("Wrong Input Entered...");
            }
        }
    }

public void TotalFee(){
        System.out.println(scouts.MembershipFee());
}

public void updateScout(){
        if(scouts.numberOfScouts() <= 0){
            System.out.println("There are no Scouts to update");
        }else {
            System.out.println("\n======================================================================");
            System.out.println("Please select which group of Scouts youd like to find and then update:");
            System.out.println("======================================================================");

            System.out.println("1.)Beaver Scout");
            System.out.println("2.)Cub Scout");
            System.out.println("3.)Scouter");
            System.out.println("Enter Choice [1-3]:");
            String ScoutsByName = input.next();
            if (ScoutsByName.contentEquals("1")) {
                System.out.println(scouts.ListAllScoutsByGroup("BeaverScout"));
                System.out.println("Please select an Index of which Beaver Scout You would like to update:");
                int Index = input.nextInt();
                if (Index >= 0 && Index < scouts.numberOfScouts()) {
                    System.out.println("update Scout name:");
                    String Name = input.next();
                    System.out.print("update County:");
                    String County = input.next();
                    System.out.println("update Date of Birth:");
                    String Date = input.next();
                    System.out.println("update Address");
                    String Address = input.next();
                    System.out.println("update Phone number:");
                    String Phone = input.next();
                    System.out.println("update Parents phone number:");
                    String Phone2 = input.next();
                    scouts.updateBeaverScout(Index, Name, County, Date, Address, Phone, Phone2);
                    System.out.println("Updated BeaverScout Successfully!");
                }

            } else if (ScoutsByName.contentEquals("2")) {
                System.out.println(scouts.ListAllScoutsByGroup("CubScout"));
                System.out.println("Please select an Index of which Cub Scout You would like to update:");
                int Index = input.nextInt();
                if (Index >= 0 && Index < scouts.numberOfScouts()) {
                    System.out.println("Update Scout name:");
                    String Name = input.next();
                    System.out.print("update County:");
                    String County = input.next();
                    System.out.println("Update Date of Birth:");
                    String Date = input.next();
                    System.out.println("Update Address");
                    String Address = input.next();
                    System.out.println("Update Phone number:");
                    String Phone = input.next();
                    System.out.println("Update Cub phone number:");
                    String Phone2 = input.next();
                    scouts.updateCubOrScouter(Index, Name, County, Date, Address, Phone, Phone2);
                    System.out.println("Updated CubScout Successfully!");



                }
            } else if (ScoutsByName.contentEquals("3")) {
                System.out.println(scouts.ListAllScoutsByGroup("Scouter"));
                System.out.println("Please select an Index of which Scouter You would like to update:");
                int Index = input.nextInt();
                if (Index >= 0 && Index < scouts.numberOfScouts()) {
                    System.out.println("Update Scout name:");
                    String Name = input.next();
                    System.out.print("update County:");
                    String County = input.next();
                    System.out.println("Update Date of Birth:");
                    String Date = input.next();
                    System.out.println("Update Address");
                    String Address = input.next();
                    System.out.println("Update Phone number:");
                    String Phone = input.next();
                    System.out.println("Update Parents phone number:");
                    String Phone2 = input.next();
                    scouts.updateCubOrScouter(Index, Name, County, Date, Address, Phone, Phone2);
                    System.out.println("Updated Scouter Successfully!");
                }

            } else {
                System.out.println("Wrong Input Entered...");
            }
        }
}

}