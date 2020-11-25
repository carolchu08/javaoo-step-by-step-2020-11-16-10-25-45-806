package practice09;


import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private List<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classes = new ArrayList<>();
    }



    public Teacher(int id, String name, int age,List<Klass> classes ) {
        super(id, name, age);
        this.classes = classes;
    }


    public String introduce() {
        String classNum= "";
        for(int i=0;i< this.getClasses().size();i++){
            classNum = classNum + this.getClasses().get(i).getNumber();
            if(i!=this.getClasses().size()-1){
                classNum += ", ";
            }
        }
        if (this.getClasses().size()!= 0) {
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I teach Class " + classNum + ".";
        } else {
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student student) {
        Boolean isteaching = false;
        for(int i =0;i<this.getClasses().size();i++) {
            if (student.getKlass().getNumber()==(this.getClasses().get(i).getNumber())) {
                isteaching =  true;
                break;
            }
            else{
                isteaching = false;
            }
        }
        if (!isteaching) {
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
        } else {
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I teach " + student.getName() + ".";
        }
    }
    public Boolean isTeaching(Student student){
        Boolean isteaching = false;
        for(int i =0;i<this.getClasses().size();i++) {
            if (student.getKlass().getNumber()==(this.getClasses().get(i).getNumber())) {
                isteaching =  true;
                break;
            }
            else{
                isteaching = false;
            }
        }
       return isteaching;
    }

    public List<Klass> getClasses() {
        return classes;
    }

    public void setClasses(List<Klass> classes) {
        this.classes = classes;
    }
}
