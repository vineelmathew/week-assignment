import java.util.Objects;

public class Student {
    private String rollno;
    private String name;
    private int age;
    public Student(String rollno, String name, int age)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    public Student()
    {

        this("1","A",18);
    }

    public String getRollno() {

        return rollno;
    }

    public void setRollno(String rollno) {

        this.rollno = rollno;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {

        this.age = age;
    }
    public int hashCode()
    {
        int rollhash=rollno.hashCode();
        return rollhash;
    }
    @Override
    public boolean equals(Object Arg) {
        if(Arg==this)
        {
            return true;
        }
       if(Arg==null || !(Arg instanceof Student))
       {
           return false;
       }
       Student that=(Student)Arg;
       boolean isequal=this.rollno.equals(that.rollno);
       return isequal;
    }
}
