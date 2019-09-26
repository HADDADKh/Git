
public class Personne {
	private int age;
	private String name;
	public Personne(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Personne [age=" + age + ", name=" + name + "]";
	}
	    
}
