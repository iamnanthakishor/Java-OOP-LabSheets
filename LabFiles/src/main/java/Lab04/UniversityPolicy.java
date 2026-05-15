
package Lab04;
public final class UniversityPolicy {
    public static final String UNIVERSITY_NAME = "University of Kelaniya";
    public static final double BONUS_RATE = 1.0;
    
    public static void showPolicyHeader(){
        System.out.println("University Payment Policy");
    };
    public static double calculateBonus(double monthlyPayment){
        return monthlyPayment*BONUS_RATE;
    };
}
/*
A final class should not be inherited because it represents fixed rules 
that should not be modified or extended.
*/