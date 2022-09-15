package uiConsole;

import Exeption.FamilyOverFlowException;
import Model.NonAbstarcts.Family;

public class MenuUtil {
    final static int sizeOfFamily = 3;
    public void showMenu(){
        String menu =
                "1. Fill with test data\n" +
                        "2. Display the entire list of families\n" +
                        "3. Display a list of families where the number of people is greater than the specified number\n" +
                        "4. Display a list of families where the number of people is less than the specified number\n" +
                        "5. Calculate the number of families where the number of members is\n" +
                        "6. Create a new family\n" +
                        "7. Delete a family by its index in the general list\n"+
                        "8. Edit a family by its index in the general list\n"+
                        "9. Remove all children over the age of majority";
        System.out.println(menu);


    }
    public void editMenu() {
        String editMenu= "1. Give birth to a baby\n"+
                "2. Adopt a child\n"+
                "3. Return to main menu";
        System.out.println(editMenu);
    }
    public void selectGender(){
        String selectGender = "1.boy\n"+
                "girl";
        System.out.println(selectGender);

    }
    public static void checkSizeOfFamily(Family family)throws FamilyOverFlowException {
        if(family.countFamily()>= sizeOfFamily){
            throw new FamilyOverFlowException();
        }
    }








}
