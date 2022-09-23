package mybill_taylor_and_lester;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brownt7272
 */
public class MyBill_Taylor_and_Lester
{
    // Set constant fees for school year
    public static double Activity_Fee = 35.00;
    public static double Technology_Fee = 16.00;
    public static double CAPS = 15.00;
    public static double In_State = 76.00;
    public static double Out_State = 268.00;
    
    // Global variables for the form data collection
    public static double Student_Total;
    public static double Student_Subtotal;
    public static double Student_CreditHours = 0.0;
    public static String Student_Name;
    public static boolean Student_Residency;
    public static List<Class> Classes = new ArrayList<>();
    
    // Displays the doubles to the houndreth decimal place for USD
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    
    
    // Launches the first form
    public static void main(String[] args)
    { 
        new MyBill_JF_User().setVisible(true);
        
        // Uncomment to run a unit test
        //unitTest();
    }
    
    // Takes in Full_Name argument and sets the value to the global variable
    public static void getUserName(String fullName)
    {
        Student_Name = fullName;
    }
    
    // Takes in Rate argument and sets the value to the global variable
    public static void getResidency(boolean rate)
    {
        Student_Residency = rate;
    }
    
    // Calculates the total for the information entered
    public static void calculateTotal()
    {
        // Sets the credit hours to the max of 16
        if (Student_CreditHours > 16){
            Student_CreditHours = 16;
        }
        
        // Determine if the student is in or out of state and calculates accordingly
        if (Student_Residency == true){
            // In state
            Student_Subtotal = Student_CreditHours * In_State;
        } 
        else{
            // out state
            Student_Subtotal = Student_CreditHours * Out_State;
        }
        
        // Adds all fees and subtotal together
        Student_Total = Activity_Fee + Technology_Fee + CAPS + Student_Subtotal;
        
        new MyBill_JF_Schedule().setVisible(true);
    }
    
    // Adds each class to the global list 
    public static void addToList(Class section){
        // Adds to array
        Classes.add(section);
        
        // adds credit hours to the global variable
        Student_CreditHours += section.creditHours;
    }
    
    
    
    // *@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@* UNIT TESTING *@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*
    public static void unitTest(){
        Student_Name = "Unit Test";
        Student_Residency = false;
        
        // Creates dummy objects 
        Class test1 = new Class("ENG-110-1B02 - Freshman Composition", "15AUG22-10OCT22", "T", "3pm-4:50PM", "VCC-219", "Kevin Barham", 8);
        Class test2 = new Class("CSC-253-0001 - Advanced C# Programming", "15AUG22-10DEC22", "M/W", "8AM-9:50AM", "ATC-156","William Buckwell", 3);
        Class test3 = new Class("COM-231-0007 - Public Speaking", "15AUG22-10DEC22", "M/W", "12PM-12:50PM", "CUH-337","Leslie Corpening", 3);
        Class test4 = new Class("MAT-143-0005 - Quantitative Literacy", "15AUG22-10DEC22", "T/TH", "9:30AM-10:55AM", "HOS-605","Jessica West", 3);
        Class test5 = new Class("CSC-251-0901 - Advanced JAVA Programming", "15AUG22-10DEC22", "M/W", "10AM-11:50AM", "ATC-156","David Teter", 3);
        
        // Adds all object to the global list
        addToList(test1);
        addToList(test2);
        addToList(test3);
        addToList(test4);
        addToList(test5);
        
        // Allows pop-up and save prompt to show
        calculateTotal();
    }
    // *@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@* END *@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*
}
