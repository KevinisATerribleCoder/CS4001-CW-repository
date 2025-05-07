/**
 * description here.
 *
 * @author (Kevin)
 * @version (1.4)
 */

 public class FullTimeStaff extends StaffHire
 {
     private double salary;
     private int weeklyFractionalHours;
 
     public FullTimeStaff(int vacancyNumber, String designation, String jobType, String staffName, String joinDate, String qualification, String appointedBy, boolean joined, int weeklyFractionalHours) {
         super(vacancyNumber, designation, jobType, staffName, joinDate, qualification, appointedBy, joined);
         this.weeklyFractionalHours = weeklyFractionalHours;
     }
 
     public void setSalary(double salary)
     {
         if (isJoined())
         {
             this.salary = salary;
         }
         else{
             System.out.println("There is no staff appointed to set the salary.");
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
             System.out.println("Salary: £ " + salary);
             System.out.println("Weekly Fractional Hours: " + weeklyFractionalHours);
         }
     }
 }
