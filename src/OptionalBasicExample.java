
import java.util.Optional;

public class OptionalBasicExample {

    public static void main(String[] args) {
    	Optional<Adresse> oad=Optional.empty();
    	Person p = new Person("Robin",4,oad); 
    	Optional<Adresse> aa =  p.getAdresse(); 
    	aa.isPresent();
    	System.out.println(aa.isPresent());


    }

}