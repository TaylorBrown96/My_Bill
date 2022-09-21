package mybill_taylor_and_lester;

/**
 *
 * @author Taylor
 */
public class Class {
    // Object backing field properties
    String className;
    String dateRange;
    String meetingDays;
    String meetingTimes;
    String meetingLocation;
    String instructor;
    int creditHours;
    
    // Constructor for the Class object
    public Class(String className, String dateRange, String meetingDays, String meetingTimes, String meetingLocation, String instructor, int creditHours){
        this.className = className;
        this.dateRange = dateRange;
        this.meetingDays = meetingDays;
        this.meetingTimes = meetingTimes;
        this.meetingLocation = meetingLocation;
        this.instructor = instructor;
        this.creditHours = creditHours;
    }
}
