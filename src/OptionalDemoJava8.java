
import java.util.ArrayList; 
import java.util.List; import java.util.Optional;
/** * Simple example of how to use Optional from Java 8 to avoid NullPointerException. * Optional is a new addition in Java API and also allows you to set default values for any object. * * @author HADDAD */ 
public class OptionalDemoJava8
{ 
	public static void main(String args[]) 
{ 
	Address johnaddress = new Address("52/A, 22nd Street", "Mumbai", "India", 400001); 
	Personn john = new Personn("John",Optional.of(johnaddress), 874731232); 
	Personn mac = new Personn("Mac", Optional.empty(), 333299911); 
	Personn gautam = new Personn("Gautam", Optional.empty(), 533299911); 
	List<Personn> people = new ArrayList<>();
	people.add(john); 
	people.add(mac); 
	people.add(gautam);
	people.stream().forEach((p) -> { System.out.printf("%s from %s %n", p.name(), p.address().orElse(Address.EMPTY_ADDRESS));});
	}
}

class Personn
{ 
	private String name; 
private Optional<Address> address;
private int phone; 

public Personn(String name, Optional<Address> address, int phone) 
{
	if(name == null)
{ throw new IllegalArgumentException("Null value for name is not permitted"); } 
this.name = name; 
this.address = address; 
this.phone = phone; } 

public String name()
{ return name; } 

public Optional<Address> address(){ return address; } 

public int phone(){ return phone; } 

@Override 

public String toString() 
{ 
	return "Personn{" + "name=" + name + ", address=" + address + ", phone=" + phone + '}'; 
	
} 
} 
class Address
{ 
	
	public static final Address EMPTY_ADDRESS = new Address("","","",0); 
private final String line1; 
private final String city; 
private final String country; 
private final int zipcode; 
public Address(String line1, String city, String country, int zipcode) 
{ 
	this.line1 = line1; 
	this.city = city; 
	this.country = country; 
this.zipcode = zipcode; 
}

public String line1(){ return line1; } 
public String city(){ return city; } 
public String country(){ return country; } 
public int zipcode(){ return zipcode; } 

@Override 
public String toString() 
{ 
	return "Address{" + "line1=" + line1 + ", city=" + city + ", country=" + country + ", zipcode=" + zipcode + '}'; 
} }

