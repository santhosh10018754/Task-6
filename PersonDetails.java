package task6;


class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class PersonDetails {

	public static void main(String[] args) {
		
Person person = new Person("Sandy", 21);
		
		System.out.println(person.toString());


	}

}
