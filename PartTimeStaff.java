
/**
 * The main class.
 *
 * @author (Kevin)
 * @version (1.2)
 */
public class StaffHire
{
    public int vacancyNumber;
    public String designation;
    public String jobType;
    public String staffName;
    public String joinDate;
    public String qualification;
    public String appointedBy;
    public boolean joined;

    public StaffHire(int vacancyNumber, String designation, String jobType, String staffName, String joinDate, String qualification, String appointedBy, boolean joined) {
        this.vacancyNumber = vacancyNumber;
        this.designation = designation;
        this.jobType = jobType;
        this.staffName = staffName;
        this.joinDate = joinDate;
        this.qualification = qualification;
        this.appointedBy = appointedBy;
        this.joined = joined;
    }

    public void setVacancyNumber(int vacancyNumber)
    {
        this.vacancyNumber = vacancyNumber;
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    public void setJobType(String jobType)
    {
        this.jobType = jobType;
    }

    public void setStaffName(String staffName)
    {
        this.staffName = staffName;
    }

    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate;
    }

    public void setQualification(String qualification)
    {
        this.qualification = qualification;
    }

    public void setAppointedBy(String appointedBy)
    {
        this.appointedBy = appointedBy;
    }

    public boolean isJoined() {
        return joined;
    }

    public void setJoined(boolean joined)
    {
        this.joined = joined;
    }

    public void display() {
        System.out.println("Vacancy Number: " + vacancyNumber);
        System.out.println("Designation: " + designation);
        System.out.println("Job type: " + jobType);
        System.out.println("Staff Name: " + staffName);
        System.out.println("Joining Date: " + joinDate);
        System.out.println("Qualification: " + qualification);
        System.out.println("Appointed by: " + appointedBy);
        System.out.println("Has person joined?: " + joined);
    }
}
