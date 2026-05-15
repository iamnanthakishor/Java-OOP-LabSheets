
package Lab04;
public class Lab04Main {
    public static void main (String args[]){
        Lecturer L1 = new Lecturer("Alice Smith", "L001", "Computing", 3, 80000.0);
        Lecturer L2 = new Lecturer("Bob Jones", "L002", "Engineering", 2, 100000.0);
        LabAssistant Lab1 = new LabAssistant("Charlie Brown", "A001", "Science", 30, 1500.0);
        L1.displayLecturerDetails();
        System.out.println("Monthly Payment: " + L1.calculateMonthlyPayment());
        L2.displayLecturerDetails();
        System.out.println("Monthly Payment: " + L2.calculateMonthlyPayment());
        Lab1.displayLabAssistantDetails();
        System.out.println("Monthly Payment: " + Lab1.calculateMonthlyPayment());
        
        UniversityPolicy.showPolicyHeader();
    }
}
// Comment: department can be used here because it is protected in the parent class
