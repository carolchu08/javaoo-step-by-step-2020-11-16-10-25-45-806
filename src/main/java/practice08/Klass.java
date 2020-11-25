package practice08;


import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private int displayName;

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    private Student leader;


    private List<Student> appendMember;
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

    public Klass(int number) {
        this.number = number;
        appendMember = new ArrayList<>();
        this.setDisplayName(number);
    }

    public void assignLeader(Student student) {
        if(appendMember.contains(student)){
            this.leader = student;
        }
        else {

            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        if(!appendMember.contains(student)){
            appendMember.add(student);
        }

    }
}