

abstract class Member {
    protected String name;
    protected String memberId;
    public Member(String name, String memberId){
        this.memberId = memberId;
        this.name=name;
    }
    public abstract void displayDetails();
}
 class Student extends Member{
    private String course;
    public Student (String name, String memberId, String course){
        super(name, memberId);
        this.course = course;
    }
    @Override
    public void displayDetails(){
        System.out.println("Student name: "+ super.name+" Student Member Id: "+ super.memberId+" Student course: "+ course );
    }
}

 class Faculty extends Member{
    private String dep;
    public Faculty (String name, String memberId, String dep){
        super(name, memberId);
        this.dep = dep;
    }
    @Override
    public void displayDetails(){
        System.out.println("Faculty name: "+ super.name+" Faculty Member Id: "+ super.memberId+" Faculty Department: "+ dep );
    }
}
public class TestInheritance {
    public static void main(String[] args) {
        Member student = new Student("Rohan", "55", "Computer Science");
        Member faculty = new Faculty("Mohan", "F10", "ISE");

        student.displayDetails();
        faculty.displayDetails();
    }
}

