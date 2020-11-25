package practice10;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {
    private int number;
    private int displayName;
    private Student leader;
    private Teacher classTeacher;
    private List<Student> appendMember;
    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Student getLeader() {
        return leader;
    }

    public void setDisplayName(int displayName) {
        this.displayName = displayName;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + this.displayName;
    }

    public Teacher getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(Teacher classTeacher) {
        this.classTeacher = classTeacher;
    }

    public Klass(int number) {
        this.number = number;
        appendMember = new ArrayList<>();
        this.setDisplayName(number);
    }

    public void assignLeader(Student student) {
        if(appendMember.contains(student)) {
            this.leader = student;

            if (this.classTeacher != null)
                System.out.print("I am " + this.classTeacher.getName() + ". I know " + student.getName() + " become Leader of Class " + this.number + ".\n");

        }else {

            System.out.print("It is not one of us.\n");
        }

    }

    public void appendMember(Student student) {
        if(!appendMember.contains(student)){
            appendMember.add(student);
            if (this.classTeacher != null)
                System.out.print("I am " + classTeacher.getName() + ". I know " + student.getName() + " has joined Class " +  this.number+ ".\n");
        }

    }

}