import java.util.*;

public class StudentMain {
    Map<String,Student> studentmap=new HashMap<>();
    Set<Integer>evenage=new HashSet<>();
    Set<Integer>oddage=new HashSet<>();
    List<Integer>rollnumber=new ArrayList<>();
    public static void main(String[] args) {
        StudentMain stuobj=new StudentMain();
        stuobj.app();
    }
    public void app()
    {
        Student student1=new Student(51,"vineel",22);
        Student student2=new Student(50,"rudrapati",24);
        Student student3=new Student(51,"leo",27);
        Student student4=new Student(50,"david",28);
        Student student5=new Student(51,"mathew",29);
        Student student6=new Student(50,"smith",31);
        studentmap.put(student1.getName(),student1);
        studentmap.put(student2.getName(),student2);
        studentmap.put(student3.getName(),student3);
        studentmap.put(student4.getName(),student4);
        studentmap.put(student5.getName(),student5);
        studentmap.put(student6.getName(),student6);
        for(String itervar:studentmap.keySet())
        {
            Student data=studentmap.get(itervar);
            int age= data.getAge();
            int roll=data.getRollno();
            if(age%2==0)
            {

                evenage.add(age);
            }
            else {
                oddage.add(age);
            }
        }
        
    }
}

