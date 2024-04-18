package lesson0411.lesson0418;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class User {
//    static String type="human";
    private String name,city;
    private int age;

    public void setName(String name) {
        if( this.name ==null) {
           this.name = name;
       }

    }

    public int getBirthDay(){
        Calendar calendar=new GregorianCalendar();
        return (calendar.get(Calendar.YEAR) - age);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>98 || age <1){
            this.age=18;
        }else {
            this.age = age;
        }
    }

    public void printInfo(){
        System.out.println("My name is "+this.name
                            +"\n my age = "+this.age
                            +"\n my city is "+this.city);
    }

}
