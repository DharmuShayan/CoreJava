package WithoutLambda;

class Employee {
	
	private String fname;
	private String lname;
	private Integer age;
	
	
	
	public Employee() {}

	public Employee(String fname, String lname, Integer age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}
	
	
	
	
	

}
