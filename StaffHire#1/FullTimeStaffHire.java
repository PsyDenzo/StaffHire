
/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @Denzel
 * @V04.19.25
 */
    public class FullTimeStaffHire extends StaffHire {
    private int salary;
    private int workingHours;
    private String staffName, joiningDate, qualification, appointedBy;
    private boolean joined;

    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary, int workingHours) {
        super(vacancyNumber, designation, jobType);
        this.salary = salary;
        this.workingHours = workingHours;
        this.staffName = "";
        this.joiningDate = "";
        this.qualification = "";
        this.appointedBy = "";
        this.joined = false;
    }

    public void hireFullTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy) {
        if (!joined) {
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
        } else {
            System.out.println("Staff already joined.");
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Staff Name: " + staffName);
        System.out.println("Salary: " + salary);
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Joining Date: " + joiningDate);
        System.out.println("Qualification: " + qualification);
        System.out.println("Appointed By: " + appointedBy);
        System.out.println("Joined: " + joined);
    }
}
