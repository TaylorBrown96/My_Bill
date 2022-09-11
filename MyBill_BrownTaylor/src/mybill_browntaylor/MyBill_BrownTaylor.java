package mybill_browntaylor;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brownt7272
 */
public class MyBill_BrownTaylor
{
    // Set constant fees for school year
    public static double Activity_Fee = 35.00;
    public static double Technology_Fee = 16.00;
    public static double CAPS = 15.00;
    public static double In_State = 76.00;
    public static double Out_State = 268.00;
    
    // Global variables for the form data collection
    public static double Student_Total;
    public static double Student_CreditHours = 0.0;
    public static String Student_Name;
    public static boolean Student_Residency;
    public static List<Class> Classes = new ArrayList<Class>();
    
    
    // Displays the doubles to the houndreth decimal place for USD
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    // Launches the first form
    public static void main(String[] args)
    { 
        new MyBill_JF_User().setVisible(true);
        
        // Uncomment to run a unit test
        //unitTest();
    }
    
    // *@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@* UNIT TESTING *@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*
    public static void unitTest(){
        Student_Name = "Unit Test";
        Student_Residency = true;
        
        // Creates dummy objects 
        Class test1 = new Class("ENG-110-1B02 - Freshman Composition", "15AUG22-10OCT22", "T", "3pm-4:50PM", "VCC-219", "Kevin Barham", 3);
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
        
        // Prints the test object
        PrintObjects();
        
        // Allows pop-up and save prompt to show
        calculateTotal();
    }
    // *@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@* END *@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*@*
    
    // Takes in Full_Name argument and sets the value to the global variable
    public static void getUserName(String fullName)
    {
        Student_Name = fullName;
    }
    
    // Takes in CreditHours argument and sets the value to the global variable
    public static void getCreditHours(double creditHours)
    {
        Student_CreditHours += creditHours;
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
        double subTotal;
        if (Student_Residency == true){
            // In state
            subTotal = Student_CreditHours * In_State;
        } 
        else{
            // out state
            subTotal = Student_CreditHours * Out_State;
        }
        
        // Adds all fees and subtotal together
        Student_Total = Activity_Fee + Technology_Fee + CAPS + subTotal;
        
        // Displays the students total with fees and subtotal
        JOptionPane.showMessageDialog(null, // No parent class
                                        "Hey " + Student_Name + "!\n"
                                        + "\n------------------------------------------"
                                        + "\nYour Subtotal:         $" + df.format(subTotal) 
                                        + "\nActivity Fee:             $" + df.format(Activity_Fee) 
                                        + "\nTechnology Fee:     $" + df.format(Technology_Fee)
                                        + "\nCAPS Fee:                $" + df.format(CAPS)
                                        + "\n------------------------------------------"
                                        + "\nTotal:                         $" + df.format(Student_Total)
                                        ,"Semester Summary" // Title
                                        , 1); // Message type
        
        // Displays an option to the user to save the output
        int save = JOptionPane.showConfirmDialog(null,
                "Would you like to save your price breakdown to a file?",
                "Save to a file",
                0);
        
        // Checks user's response 
        if (save == 0){
            printToFile(subTotal);
        }  
    }
    
    public static void printToFile(double subTotal)
    {
        // Replaces the space with an underscore for use in the file name
        String fileName = Student_Name.replace(" ","_");
        
        // Creates a new file and then opens the file to write the students price breakdown
        try (FileWriter myWriter = new FileWriter(fileName + ".txt")) {
            myWriter.write("Hey " + Student_Name + "!\n"
                         + "\n---------------------------------"
                         + "\nYour Subtotal:           $" + df.format(subTotal) 
                         + "\nActivity Fee:            $" + df.format(Activity_Fee) 
                         + "\nTechnology Fee:          $" + df.format(Technology_Fee)
                         + "\nCAPS Fee:                $" + df.format(CAPS)
                         + "\n---------------------------------"
                         + "\nTotal:                   $" + df.format(Student_Total));
            myWriter.close();
        } 
        catch (IOException e) {
            System.out.println("An error occurred.\n");
            System.out.println(e);
        }
    }
    
    public static void addToList(Class section){
        // Adds to array
        Classes.add(section);
        
        // Sends credit hours to be saved in the global variable
        getCreditHours(section.creditHours);
    }
    
    public static void PrintObjects(){
        // Iterates through each object in the global array
        for (Class section : Classes){
            System.out.print(section.className + " ");
            System.out.print(section.dateRange + " ");
            System.out.print(section.meetingDays + " ");
            System.out.print(section.meetingTimes + " ");
            System.out.print(section.meetingLocation + " ");
            System.out.print(section.instructor + " ");
            System.out.println(section.creditHours);
        }
    }
}
