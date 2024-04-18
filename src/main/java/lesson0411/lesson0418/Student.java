package lesson0411.lesson0418;

public class Student {
    private String name;
    private int groupNumber;
    public Student(String name, int groupNumber) {
        this.name = nameValidate(name);
        this.groupNumber = groupNumber;
    }
    public Student(String name) {
        this.name = nameValidate(name);
    }

    public Student() {
    this("vasiko",12);
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getName() {
        return name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }



    private String nameValidate(String str){
        if(str.length()==0){
            return "John Dou";
        }
        if(str.length()>15){
            return "John Dou";
        }
        return str;
    }


}
