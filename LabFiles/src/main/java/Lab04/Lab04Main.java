
package Lab04;
public class Lab04Main {
    public static void main (String args[]){
        Lecturer L1 = new Lecturer("Alice Smith", "L001", "Computing", 3, 50000.0);
        L1.displayLecturerDetails();
        System.out.println("Monthly Payment: " + L1.calculateMonthlyPayment());
    }
}
