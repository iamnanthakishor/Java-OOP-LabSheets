
package Lab06;
public class Student {
    private String name;
    private int mark;
    
    public Student(String Fname, int Gmark){
        this.name = Fname;
        this.mark = Gmark;
    }
    
    public String getName(){
        return name;
    }
    public int getMark(){
        return mark;
    }
    public String getGrade(){
        if (mark >= 75){
            return "A";
        }
        else if (mark >= 65){
            return "B";
        }
        else if (mark >= 55){
            return "C";
        }
        else if (mark >= 40){
            return "S";
        }
        else {
            return "F";
        }
    }
}
