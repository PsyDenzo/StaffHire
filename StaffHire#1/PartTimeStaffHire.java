
/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @Denzel
 * @V04.19.25
 */
public class PartTimeStaffHire extends StaffHire {
    private int workingHour;
    private double wagesPerHour;
    private String shifts;
    private boolean terminated;

    private String staffName, joiningDate, qualification, appointedBy;
    private boolean joined;

    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType,
                             String staffName, String joiningDate, String qualification, String appointedBy, boolean joined,
                             int workingHour, double wagesPerHour, String shifts) {
        super(vacancyNumber, designation, jobType);
        this.staffName = staffName;
        this.joiningDate = joiningDate;
        this.qualification = qualification;
        this.appointedBy = appointedBy;
        this.joined = joined;
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        this.terminated = false;
    }

    public void setShifts(String newShift) {
        if (joined) this.shifts = newShift;
        else System.out.println("Shift cannot be changed. Staff not joined.");
    }

    public void terminateStaff() {
        if (terminated) {
            System.out.println("Staff already terminated.");
        } else {
            this.staffName = "";
            this.joiningDate = "";
            this.qualification = "";
            this.appointedBy = "";
            this.joined = false;
            this.terminated = true;
        }
    }

    public void display() {
        super.display();
        if (joined) {
            System.out.println("Staff Name: " + staffName);
            System.out.println("Joining Date: " + joiningDate);
            System.out.println("Qualification: " + qualification);
            System.out.println("Appointed By: " + appointedBy);
        }
        System.out.println("Working Hour: " + workingHour);
        System.out.println("Wages Per Hour: " + wagesPerHour);
        System.out.println("Shifts: " + shifts);
        System.out.println("Terminated: " + terminated);
        System.out.println("Income per day: " + (wagesPerHour * workingHour));
    }
}
