package practice07;



public class Teacher extends Person {
    private Klass klass;
    public Teacher(int id, String name, int age) {
        super(id,name, age);
        this.klass = null;
    }
    public Teacher(int id, String name, int age,Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }
    public String introduce() {
        if (this.getKlass() != null) {
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I teach " + klass.getDisplayName() + ".";
        }
        else{
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student student) {
        if(!student.getKlass().equals(this.getKlass())) {
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
        }else{
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I teach " + student.getName() + ".";
        }
    }

}