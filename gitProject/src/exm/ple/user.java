package exm.ple;

public class user {
	private String name;
	private Integer id;
	private int age;
	private String school;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	

	
	public user(String name, int id, int age, String school) {
		System.out.println("����:"+name);
		System.out.println("ѧ��:"+id);
		System.out.println("����:"+age);
		System.out.println("ѧУ:"+school);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "user [name=" + name + ", id=" + id + ", age=" + age + ", school=" + school + "]";
	}
	
	
	

}
