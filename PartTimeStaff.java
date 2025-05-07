/**
 * description here.
 *
 * @author (Kevin)
 * @version (1.3)
 */

 public class PartTimeStaff extends StaffHire
 {
     public int workingHour;
     public double wagesPerHour;
     public String shifts;
     public boolean terminated;
 
     public PartTimeStaff(int vacancyNumber, String designation, String jobType, String staffName, String joinDate, String qualification, String appointedBy, boolean joined, int workingHour, double wagesPerHour, String shifts) {
         super(vacancyNumber, designation, jobType, staffName, joinDate, qualification, appointedBy, joined);
         this.workingHour = workingHour;
         this.wagesPerHour = wagesPerHour;
         this.shifts = shifts;
         this.terminated = false;
     }
 
     public void setWorkingHour(int workingHour)
     {
         this.workingHour = workingHour;
     }
 
     public void setWagesPerHour(double wagesPerHour)
     {
         this.wagesPerHour = wagesPerHour;
     }
 
     public void setShifts(String shifts)
     {
         if (isJoined())
         {
             this.shifts = shifts;
         }
     }

     public void display()
     {
         System.out.println("Vacancy Number: " + vacancyNumber);
         System.out.println("Designation: " + designation);
         System.out.println("Job type: " + jobType);
         System.out.println("Staff Name: " + staffName);
         System.out.println("Joining Date: " + joinDate);
         System.out.println("Qualification: " + qualification);
         System.out.println("Appointed by: " + appointedBy);
         System.out.println("Has person joined?: " + joined);
         if (isJoined())
         {
             System.out.println("Shifts:" +shifts);
             System.out.println("Working Hours: " + workingHour);
             System.out.println("Wages per hour: " +wagesPerHour);
         }
     }

     public void terminate()
     {
     if (terminated)
     {
         System.out.println("Staff is already terminated.");
     }
     else
     {
         setStaffName("");
         setJoinDate("");
         setQualification("");
         setAppointedBy("");
         setJoined(false);
         terminated = true;
     }
     }
 
 }
