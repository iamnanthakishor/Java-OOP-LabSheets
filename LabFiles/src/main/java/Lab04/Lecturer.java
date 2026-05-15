
package Lab04;
public class Lecturer extends StaffMember {
    private int courseCount;
    private double paymentPerCourse;
    
    public Lecturer(String Name, String ID, String Department, int course, double payment){
        super(Name,ID, Department);
        this.courseCount = course;
        this.paymentPerCourse = payment;
    }
    public double calculateMonthlyPayment(){
        return courseCount*paymentPerCourse;
    }
    public void displayLecturerDetails(){
        displayBeasicDetails();
        System.out.println("Course Count: " + courseCount);
        System.out.println("Payment: " + paymentPerCourse);
    }
}
