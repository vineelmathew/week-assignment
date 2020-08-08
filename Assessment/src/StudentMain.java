import java.util.*;

public class StudentMain {
    Map<String,Student> studentmap=new HashMap<>();
    Set<Student>evenage=new HashSet<>();
    Set<Student>oddage=new HashSet<>();
    List<String> rollnumber=new ArrayList<String>();
    public static void main(String[] args) {
        StudentMain stuobj=new StudentMain();
        stuobj.app();
    }
    public void app()
    {
        Student student1=new Student("51","vineel",22);
        Student student2=new Student("50","rudrapati",24);
        Student student3=new Student("51","leo",27);
        Student student4=new Student("50","david",28);
        Student student5=new Student("51","mathew",29);
        Student student6=new Student("50","smith",31);
        studentmap.put(student1.getName(),student1);
        studentmap.put(student2.getName(),student2);
        studentmap.put(student3.getName(),student3);
        studentmap.put(student4.getName(),student4);
        studentmap.put(student5.getName(),student5);
        studentmap.put(student6.getName(),student6);
        for(String itervar:studentmap.keySet())
        {
            Student data=studentmap.get(itervar);
            if(data.getAge()%2==0)
            {
                evenage.add(data);
            }
            else
            {
                oddage.add(data);
            }
            rollnumber.add(data.getRollno());
        }

    }
}

