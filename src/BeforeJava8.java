import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BeforeJava8 {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40),
                new Person("HADDAD", 50),
                new Person("HADDAD", 40)
        );

        Person result = getStudentByName(persons, "jack");
        System.out.println(result.getAge());
        Person result1 = getStudentByNamee(persons, "HADDAD");
        System.out.println(result1.getName());
        System.out.println(result1.getAge());
        Person result2 = getStudentByNameee(persons, "HADDAD");
        System.out.println(result2.getAge());
        Person result3 = getStudentByNameeee(persons, "HADDAD");
        System.out.println(result3.getAge());
        getStudentmap(persons);
       
    }

    private static void getStudentmap(List<Person> persons) {
		
    	int name= persons.stream().filter(elemt-> "HADDAD".equals(elemt.getName()))
    			.map(Person::getAge).findFirst().orElse(null);
    	System.out.println("name = " + name);
    	
    	List<String> collect = persons.stream().map(Person::getName).collect(Collectors.toList());
    	collect.forEach(System.out::println);
    	
	}

	private static Person getStudentByNameeee(List<Person> persons, String name) {
    	Person p1= persons.stream().filter(elemt-> {
    		if (name.equals(elemt.getName()) && 10==elemt.getAge()) {
    			return true;
    		}
    	return false; 
    					
    	})
				.findAny().orElse(null);
		return p1;
	}

	private static Person getStudentByNameee(List<Person> persons, String name) {
		// TODO Auto-generated method stub
		return persons.stream().filter(elemt-> name.equals(elemt.getName()) && 40==elemt.getAge())
				.findAny().orElse(null);

	}

	private static Person getStudentByNamee(List<Person> persons, String name) {
	
    	
		return persons.stream().filter(elemt-> name.equals(elemt.getName())).findAny().orElse(null);
			
	}

	private static Person getStudentByName(List<Person> persons, String name) {

        Person result = null;
        for (Person temp : persons) {

            if (name.equals(temp.getName())) {
               
            return temp;
            }
        }
        return result;
    }
}