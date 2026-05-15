
package Lab04;
public abstract class StaffMember {
    private String fullName;
    private String staffId;
    protected String department;
    
    private static int staffCount = 0;
    
    public StaffMember(String Name, String ID, String Department){
    this.fullName = Name;
    this.staffId = ID;
    this.department = Department;
    staffCount++;
    }
    
    public String ShowName(){
        return fullName;
    }
    public String ShowID(){
        return staffId;
    }
    public String ShowDepart(){
        return department;
    }
    
    public final void displayBeasicDetails(){
        System.out.println("Name: " + fullName);
        System.out.println("ID: " + staffId);
        System.out.println("Department: " + department);

    }
    
    public abstract double calculateMonthlyPayment();
    
    public static void showSystemName(){
        System.out.println("Campus Staff Payment System");
    }
    
    public static int getStaffCount(){
        return staffCount;
    }
}
/* Comment: 
    StaffMember is abstract because it represents a general concept. 
    We cannot calculate a payment without knowing if the member is a 
    Lecturer or a LabAssistant.
*/