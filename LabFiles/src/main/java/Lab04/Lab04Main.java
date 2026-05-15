
package Lab04;
public class Lab04Main {
    public static void main (String args[]){
        
        StaffMember.showSystemName();
        
        UniversityPolicy.showPolicyHeader();
        System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);
     
        Lecturer L1 = new Lecturer("Kamal", "L001", "IT", 3, 50000);
        Lecturer L2 = new Lecturer("Nimal", "L002", "CS", 2, 60000);
        LabAssistant Lab1 = new LabAssistant("Saman", "LA001", "IT", 120, 500);
        
        L2.changeDepartment("SE");
        System.out.println("\n--- Lecturer 1 ---");
        L1.displayLecturerDetails();

        System.out.println("\n--- Lecturer 2 ---");
        L2.displayLecturerDetails();
        
        System.out.println("\n--- Lab Assistant ---");
        Lab1.displayLabAssistantDetails();
        
        System.out.println("\nPayments:");
        System.out.println("Lecturer 1 Monthly Payment: " + L1.calculateMonthlyPayment());
        System.out.println("Lecturer 2 Monthly Payment: " + L2.calculateMonthlyPayment());
        System.out.println("LabAssistent 1 Monthly Payment: " + Lab1.calculateMonthlyPayment());
        
        System.out.print("\n");
        
        double amount = L1.calculateMonthlyPayment() + L2.calculateMonthlyPayment() + Lab1.calculateMonthlyPayment();
        System.out.println("Total Monthly Payment: "+ amount);
        
        System.out.print("\n");
        System.out.println("Bonus:");
        System.out.println("Lecturer 1 Bonus: " + UniversityPolicy.calculateBonus(L1.calculateMonthlyPayment()));
        System.out.println("Lecturer 1 Bonus: " + UniversityPolicy.calculateBonus(L2.calculateMonthlyPayment()));
        System.out.println("Lab Assistent Bonus: " + UniversityPolicy.calculateBonus(Lab1.calculateMonthlyPayment()));
        
        System.out.print("\n");
        System.out.println("Total Staff: " + StaffMember.getStaffCount());
        L1.showCommonNotice();
        L2.showCommonNotice();
        Lab1.showCommonNotice();
    }
}
// Comment: department can be used here because it is protected in the parent class
