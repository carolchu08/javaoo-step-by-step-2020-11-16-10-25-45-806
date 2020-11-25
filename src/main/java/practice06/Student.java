package practice06;

import practice05.Person;

public class Student extends Person {
    public Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass =klass;
    }


    public Klass getKlass() {
        return klass;
    }
    public String introduce(){
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Student. I am at " + klass.getDisplayName()+".";
    }
}