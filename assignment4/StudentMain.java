import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentMain {
	Set<Student> store = new HashSet<Student>();

	public static void main(String args[]) {

		StudentMain demo = new StudentMain();
		demo.runApp();
	}

	public void runApp() {
		Student student1 = new Student("50", 22);
		Student student2 = new Student("32", 14);
		Student student3 = new Student("51", 26);
		Student student4 = new Student("53", 29);
		Student student5 = new Student("55", 24);
		store.add(student1);
		store.add(student2);
		store.add(student3);
		store.add(student4);
		store.add(student5);
		List<Student>list=convertList(store);	
	}
	public void List<Student>convertList(set<Student>set)
	{
		List<Student>list=new ArrayList<>();
for(Student student:set)
{
if(Student.getAge()>21)
{
list.add(student);
	}
}