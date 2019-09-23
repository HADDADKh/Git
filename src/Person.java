import java.util.Optional;

public class Person {
	

	    private String name;
	    private int age;
	    private String adresse;

		public static void main(String args[]) 
		{
			Person p = new Person("ff", 5, "adresse2");
			System.out.println(p);
		}
		public Person(String name2, int age2, String string) {
			this.name = name;
	        this.age = age;
	        this.adresse = string;		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", adresse=" + adresse + "]";
		}
		public String getName() {
			return name;
		}

		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	    //gettersm setters, toString
	}

