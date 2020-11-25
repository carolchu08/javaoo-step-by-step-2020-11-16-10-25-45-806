package practice09;


import java.util.Objects;

public class Student extends Person {
    public Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if(klass.getLeader()!=null) {
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Student. I am Leader of " + klass.getDisplayName() + ".";
        }
        else{
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Student. I am at " + klass.getDisplayName() + ".";
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(klass, student.klass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), klass);
    }
}
