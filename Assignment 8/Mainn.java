class Personn
	{
	private int ssn;
	private String name;
	private int age;
	private String address;
	public Personn()
	{
	} 
	public Personn(int ssn,String name,int age,String address)
	{
		this.ssn=ssn;
		this.name=name;
		this.age=age;
		this.address=address;
	} 
	public void setSsn(int ssn)
	{
		this.ssn=ssn;		
	}
	public void setName(String name)
	{
		this.name=name;
	}	
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public int getSsn()
	{
		return ssn;		
	}
	public String getName()
	{
		return name;
	}	
	public int getAge()
	{
		return age;
	}
	public String getAddress()
	{
		return address;
	}
	public String toString()
	{
		return "Serial no:"+ssn+"\nName:"+name+"\nAge:"+age+"\nAddress"+address;
	}		
}
class Student extends Personn
{
	public int rollNo;
	public int mark1;
	public int mark2;
	public int mark3;
	public Student()
	{
	}
	public Student(int ssn,String name,int age,String address,int rollNo,int mark1,int mark2,int mark3)
	{
		super(ssn,name,age,address);
		this.rollNo=rollNo;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	public int totalMark()
	{
		return (mark1+mark2+mark3);
	}
	public String toString()
	{
		return super.toString()+"\nRoll No:"+rollNo+"\nMark 1:"+mark1+"\nMark 2:"+mark2+"\nMark 3:"+mark3+"\nTotal Marks: "+totalMark();
	}
}
class Mainn
{
	public static void main(String[] args)
	{
		Student s= new Student(1,"Janu",12,"Gandhi Street, chennai, Tamilnadu ",123,98,99,60);
		System.out.println(s);
	}
}