
/**
 * Write a description of class StaffHire here.
 *
 * @Denzel
 * @V04.19.25
 */
public class StaffHire
{
    private int vacancyNumber;
    private String designation;
    private String jobType;

    public StaffHire(int vacancyNumber, String designation, String jobType) {
        this.vacancyNumber = vacancyNumber;
        this.designation = designation;
        this.jobType = jobType;
    }

    public int getVacancyNumber() { return vacancyNumber; }
    public String getDesignation() { return designation; }
    public String getJobType() { return jobType; }

    public void display() {
        System.out.println("Vacancy No: " + vacancyNumber);
        System.out.println("Designation: " + designation);
        System.out.println("Job Type: " + jobType);
    }
}
