package mybill_browntaylor;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 

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
    public static double Student_CreditHours;
    public static String Student_Name;
    public static boolean Student_Residency;
    
    // Displays the doubles to the houndreth decimal place for USD
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    // Launches the first form
    public static void main(String[] args)
    { 
        new MyBill_JF_User().setVisible(true);
    }
    
    // Takes in Full_Name argument and sets the value to the global variable
    public static void getUserName(String fullName)
    {
        Student_Name = fullName;
    }
    
    // Takes in CreditHours argument and sets the value to the global variable
    public static void getSemesterHours(double creditHours)
    {
        Student_CreditHours = creditHours;
    }
    
    // Takes in Rate argument and sets the value to the global variable
    public static void getResidency(boolean rate)
    {
        Student_Residency = rate;
    }
    
    public static void calculateTotal()
    {
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
        try {
            File receipt = new File(fileName + ".txt");
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
        } 
        catch (IOException e) {
            System.out.println("An error occurred.\n");
            System.out.println(e);
        }
    }
}
