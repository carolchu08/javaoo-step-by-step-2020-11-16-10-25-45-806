package practice05;

public class Teacher extends Person {
    private  Integer klass;
    public Teacher(String name, int age) {
        super(name, age);
        this.klass = null;
    }
    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }
    public Integer getKlass() {
        return klass;
    }
    public String introduce() {
        if (this.getKlass() != null) {
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I teach Class " + this.getKlass() + ".";
        }
        else{
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I teach No Class.";
        }
    }
}
