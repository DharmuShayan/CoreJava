package function;

public class Student {
	
	private Integer id;
	private String name;
	private Integer age;
	
	
	public Student() {
		super();
	}


	public Student(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	public void setId(Integer id) {
		this.id=id;
	}
	
	public Integer getId() {
		return id;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	

}
