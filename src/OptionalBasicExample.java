
import java.util.Optional;

public class OptionalBasicExample {

    public static void main(String[] args) {
    	Adresse ad = new Adresse("Med","Med");
    	Optional<Adresse> oad=Optional.of(ad);
    	Person p = new Person("Robin",4,oad); 
    	Optional<Adresse> aa =  p.getAdresse(); 
    	
  
    	Optional<Adresse> home = p.getAdresse();
    	System.out.println(ad);
    	System.out.println( home.filter(address -> "Med".equals(address.getRue())));
}
}