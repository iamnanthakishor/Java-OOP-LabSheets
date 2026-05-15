
package Lab04;
public class LabAssistant extends StaffMember{
    private int hoursWorked;
    private double hourlyRate;
    
    public LabAssistant(String Name, String ID, String Department, int hours, double rate){
        super(Name,ID,Department);
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }
    @Override
    public double calculateMonthlyPayment(){
        return hoursWorked*hourlyRate;
    }
    public void displayLabAssistantDetails(){
        displayBeasicDetails();
        System.out.println("Worked Hours: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);  
    }
    
}
