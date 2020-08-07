public class Student
{
    private String rollno;
    private int age;

    public Student(String rollno,int age)
    {
        this.age=age;
        this.rollno=rollno;
    }
    public Student()
    {
    	this("1",18);
    }
    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
    
    public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}





	public int hashCode()
	{
		int hash=rollno.hashCode();
		return hash;
	}
	public boolean equals(Object obj)
	{
		if(this==obj)
		{
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		boolean isequal=this.rollno.equals(other.rollno);
		return isequal;
	}






	
	  /*  @Override
	public int hashCode() {
		return Objects.hash(age, rollno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return age == other.age && Objects.equals(rollno, other.rollno);
	}*/

}