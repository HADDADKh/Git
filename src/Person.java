import java.util.Optional;

public class Person {
	

	    private String name;
	    private int age;
	    private Optional<Adresse> adresse;

	

		public Person(String name2, int age2, Optional<Adresse> adresse2) {
			this.name = name;
	        this.age = age;
	        this.adresse = adresse2;		}

		public String getName() {
			return name;
		}

		public Optional<Adresse> getAdresse() {
			return adresse;
		}

		public void setAdresse(Optional<Adresse> adresse) {
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

