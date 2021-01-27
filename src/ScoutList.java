import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * This class creates methods that are used in ScoutSystem and makes the functionality of the program.
 */
public class ScoutList {

    //Declaring Scout Arraylist as private
    private ArrayList<Scout> scouts;

    /**
     * Creates a constructor for the Scout arraylist
     * creates the arraylist and makes it public
     */
    public ScoutList() {
        scouts = new ArrayList<Scout>();
    }

    /**
     * Creates a method to add a Scout. "Scout" is the Index and "scout" is a paramater. The "scout" is set as a parameter
     * where it will be changed in ScoutSystem in a specfic manner to add a Scout and its details.
     * @param scout
     */
    public void addScout(Scout scout) {
        scouts.add(scout);

    }



    /**
     * This method gets a specific Scout from the Arraylist, First this method checks if the "Index" which is the
     * parameter exists in the arraylist, and if it does it returns the specific Scout, OtherWise will return Null.
     * @param Index
     * @return null
     */
    public Scout getScout(int Index) {
        for (int check = 0; check <= scouts.size(); check++) {
            if (scouts.get(Index) == scouts.get(check)) {

                return scouts.get(Index);
            }

        }

        return null;
    }


    /**
     * Checks if there are any scouts, if not returns an error saying there isn't, otherwise it will run a loop and
     * counts the amount of specific scouts that belong to a group by comparing the name, once it compares the name it
     * will loop around that many times as there is in that group and puts it in a variable above the loop, once the
     * loop is done the 3 variables above the loop will contain the number of specific scouts, then at the really bottom
     * will print the GUI with the result of each group.
     * @return Scout
     */
        public String ListTotalNumberOfScouts() {

            if (scouts.size() <= 0) {
                return "There are no scouts stored in the list";


            } else {

                String Scout = "";
int BeaverCounter = 0;
int CubCounter = 0;
int ScouterCounter = 0;
                for (int counter = 0; counter < scouts.size(); counter++) {

                    String Name = scouts.get(counter).getClass().getName();
if(Name.contentEquals("BeaverScout")){
    BeaverCounter++;
}else if(Name.contentEquals("CubScout")){
    CubCounter++;
}else if(Name.contentEquals("Scouter")){
    ScouterCounter++;
}
                }
                Scout = Scout + "====================================\n";
                Scout = Scout + "    Total Number of Scouts: " + scouts.size() + "\n";
                Scout = Scout + "------------------------------------\n";
                Scout = Scout +": Total Number of Beaver Scouts: " + BeaverCounter + "\n";
                Scout = Scout  + ": Total Number of Cub Scouts: " + CubCounter + "\n";
                Scout = Scout + ": Total Number of Scouter Scouts: " + ScouterCounter + "\n";
                Scout = Scout + "===================================\n";
                return Scout;
            }

        }

    /**
     * This method checks if the array is empty or not and if it's not then it will use a parameter to count how many
     * scouts are in a particular group. Checks what group the user wants to be checked and then has a variable to check
     * how many there is in the array, when it's done it puts the result in the outside variable above the loop with the
     * final result. Then at the bottom the GUI is created with the result.
     *
     * @param Group
     * @return Scout
     */
    public String ListNumberOfScoutsByGroup(String Group) {

        if (scouts.size() <= 0) {
            return "There are no scouts stored in the list";


        } else {

            String Scout = "";
            int ScoutCounter = 0;
            String Name = "";
            for (int counter = 0; counter < scouts.size(); counter++) {

            Name = scouts.get(counter).getClass().getName();

                if(Group.contentEquals(Name)){
ScoutCounter++;

                }
            }

            Scout = Scout + "===========================\n";
            Scout = Scout + "Total Number of "+Group+"s: "+ ScoutCounter;
            Scout = Scout + "\n===========================";


            return Scout;
        }

    }


    /**
     * This method checks if the arraylist isnt empty and then creates an empty Variable called 'Scout' then
     * uses a for loop which goes through every element of the arraylist and adds each number to a variable "Scout"
     * inside the loop and uses a .get method to display every scout on a new line, this is updated into the variable
     * "scout" which is then returned at the end.
     * @return Scout
     */
    public String listOfScouts() {

        if (scouts.size() <= 0) {
            return "There are no scouts in the list";


        } else {
            String Scout = "";
            for (int counter = 0; counter < scouts.size(); counter++) {
                Scout = Scout + counter + ": " + scouts.get(counter) + "\n";

            }
            return Scout;
        }


    }

    /**
     * Checks if the array is empty or not, if it isn't then it uses a parameter called Group and compares it the the
     * group of scouts, once compared it loops around the arraylist to find the scouts by specified group, once it's done
     * it returns the result to an outside variable called scout and then the scout variable is returned at the end
     * displaying the scouts that are found by a group.
     *
     * @param Group
     * @return Scout
     */
    public String ListAllScoutsByGroup(String Group){
        if (scouts.size() <= 0) {
            return "There are no scouts stored in the list";


        } else {
            String Scout = "";

            for (int counter = 0; counter < scouts.size(); counter++) {
                String Name = scouts.get(counter).getClass().getName();

                if (Group.contentEquals(Name)) {

                    Scout = Scout + counter +": Scout Details ===> " + scouts.get(counter) + "\n";
                }else if(Group.contentEquals(Name)){
                    Scout = Scout + counter+ ": Scout Details ===> " + scouts.get(counter)+ "\n";
                }else if(Group.contentEquals(Name)){
                    Scout = Scout + counter +": Scout Details ===> " + scouts.get(counter) + "\n";
                }
            }

            return Scout;
        }

    }
    /**
     * Checks if the array is empty or not, if it isn't then it uses a parameter called Name and compares it to the names
     * of scouts in the arraylist, once it successfuly compares them to the parameter it loops around the arraylist
     * filling an outside loop variable with output, once done it returns the result.
     *
     * @param Name
     * @return Scout
     */
    public String ListScoutsByName(String Name) {

        if (scouts.size() <= 0) {
            return "There are no scouts stored in the list";


        } else {
            String Scout = "";
            for (int counter = 0; counter < scouts.size(); counter++) {

                //Gets the Name from the array list.
                String getName = scouts.get(counter).getName();
                //Converts the Name to String
                String ToString = getName.toString();
                //Trims the String so that there is no incidental spaces
                String Trimmed = ToString.trim();
                Boolean isFound = Trimmed.contentEquals(Name);

                if (isFound) {

                    Scout = Scout + counter + ": Scout Details ====> " + scouts.get(counter) + "\n";

                }

            }
            return Scout;
        }

    }

    /**
     * This method uses 7 parameters to update BeaverScout details, this gives the choice in ScoutSystem to choose which
     * group of scouts to update, It uses uses scouts.get(Index) to get specific beaverScout and uses the class BeaverScout
     * for the information about that beaver. In ScoutSystem user uses the scanner utility to choose what the parameters
     * are. The parameter is the new information that is going to be replaced for the current one that is found in the specific
     * beaverScout.
     *
     * @param Index
     * @param Name
     * @param County
     * @param Date
     * @param address
     * @param Phone1
     * @param Phone2
     */
    public void updateBeaverScout(int Index,String Name, String County,String Date,String address,String Phone1,String Phone2){

BeaverScout A = (BeaverScout) scouts.get(Index);
A.setName(Name);
A.setCounty(County);
A.setDateOfBirth(Date);
A.setAddress(address);
A.setPhoneNumber(Phone1);
A.setParentPhone(Phone2);

    }

    /**
     * * This method uses 7 parameters to update CubScout AND scouter details, this gives the choice in ScoutSystem to choose which
     *      * group of scouts to update, It uses uses scouts.get(Index) to get specific cub or scouter and uses the class CubScout
     *      * for the information about that CubScout, since CubScout and Scouter share the same information. In ScoutSystem user
     *      uses the scanner utility to choose what the parameters are.The parameter is the new information that is going to be replaced
     *      for the current one that is found in the specific CubScout OR scouter.
     *
     *
     * @param Index
     * @param Name
     * @param County
     * @param Date
     * @param address
     * @param Phone1
     * @param Phone2
     */
    public void updateCubOrScouter(int Index,String Name, String County,String Date,String address,String Phone1,String Phone2){

        CubScout B = (CubScout) scouts.get(Index);
        B.setName(Name);
        B.setCounty(County);
        B.setDateOfBirth(Date);
        B.setAddress(address);
        B.setPhoneNumber(Phone1);
        B.setCubPhoneNumber(Phone2);
    }



    /**
     * This Method removes a Scout selected by the parameter "Index", The method checks if the Index exists in the arraylist
     * and if it does it allows to remove the Scout, Otherwise returns "False"
     * @param Index
     * @return false
     */
    public boolean removeScout(int Index) {

        for (int check = 0; check < scouts.size(); check++) {
            if (scouts.get(Index) == scouts.get(check)) {

                scouts.remove(Index);
            }


        }
        return false;

    }
    /**
     * This methods uses another method " .size() " to get the number of elements inside the Arraylist and returns the
     * number.
     * @return Number of Scouts
     */
    public int numberOfScouts() {

        return scouts.size();
    }

    /**
     * uses a loop to go around the amount of times there is scouts in an arraylist, then gets an abstract class
     * from each Scout class to get the amount of Membership fee, each class has different return value of membership fee.
     * The for loop uses an outside variable Total to add to the "getFee" double variable inside the for loop each times
     * it loops around. Once it's done the "Total" variable contains the result of total membership, then has another
     * outside variable called "Fee" which is used at the bottom to display the GUI for the Total membership.
     * @return Fee
     */
    public String MembershipFee(){
        String Fee = "";
        double Total = 0;
        for(int counter = 0; counter < scouts.size(); counter++){

            double getFee = scouts.get(counter).calcMembership();
            Total = Total + getFee;

        }
        Fee = Fee + "=====================\n";
        Fee = Fee + "The Total Fees " + Total;
        Fee = Fee + "\n=====================";
return Fee;
    }




    /**
     *  Method to load the Scout Arraylist from an XML file "scouts.xml" back to the program.
     * @throws Exception
     */
    public void load() throws Exception
    {
        XStream xstream = new XStream(new DomDriver());
        ObjectInputStream is = xstream.createObjectInputStream(new FileReader("scouts.xml"));
        scouts = (ArrayList<Scout>) is.readObject();
        is.close();
    }

    /**
     * Method to Save all the data saved in the Scout Arraylist to an XML file, "scouts.xml"
     * @throws Exception
     */
    public void save() throws Exception {
        XStream xstream = new XStream(new DomDriver());
        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("scouts.xml"));
        out.writeObject(scouts);
        out.close();
    }



}