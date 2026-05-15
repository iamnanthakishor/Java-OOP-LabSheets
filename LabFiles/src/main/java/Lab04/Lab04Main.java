
package Lab04;
public class Lab04Main {
    public static void main (String args[]){
        
        StaffMember.showSystemName();
        
        Lecturer L1 = new Lecturer("Alice Smith", "L001", "Computing", 3, 80000.0);
        Lecturer L2 = new Lecturer("Bob Jones", "L002", "Engineering", 2, 100000.0);
        LabAssistant Lab1 = new LabAssistant("Charlie Brown", "A001", "Science", 30, 1500.0);
        
        System.out.println("Total Number of Staffs: " + StaffMember.getStaffCount());
        System.out.println("\n");
        
        L1.displayLecturerDetails();
        System.out.println("Monthly Payment: " + L1.calculateMonthlyPayment());
        L2.displayLecturerDetails();
        System.out.println("Monthly Payment: " + L2.calculateMonthlyPayment());
        Lab1.displayLabAssistantDetails();
        System.out.println("Monthly Payment: " + Lab1.calculateMonthlyPayment());
        
        UniversityPolicy.showPolicyHeader();
        System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);
        
        System.out.println("\nBonus:");
        System.out.println("Lecturer 1 Bonus: " + UniversityPolicy.calculateBonus(L1.calculateMonthlyPayment()));
        System.out.println("Lecturer 1 Bonus: " + UniversityPolicy.calculateBonus(L2.calculateMonthlyPayment()));
        System.out.println("Lab Assistent Bonus: " + UniversityPolicy.calculateBonus(Lab1.calculateMonthlyPayment()));
    }
}
// Comment: department can be used here because it is protected in the parent class
