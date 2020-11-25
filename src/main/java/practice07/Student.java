package practice07;


public class Student extends Person {
    public Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass =klass;
    }

    public Klass getKlass() {
        return klass;
    }
    public String introduce(){
        if(this.klass.getLeader()!=null) {
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Student. I am Leader of " + klass.getDisplayName() + ".";
        }
        else{
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Student. I am at Class " + this.klass.getNumber() + ".";
        }
    }
}