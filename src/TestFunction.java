import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class TestFunction {
	public static void main(String[] args) {
		
		List<Person> lPerson = Arrays.asList(
				new Person(10, "toto"),
				new Person(20, "titi"),
				new Person(30, "tata"),
				new Person(40, "tutu")
		);
		
		Function<Person, String> f1 = (Person p) -> p.getNom();
		Function<Person, Integer> f2 = (Person p) -> p.getAge() * 2;
		System.out.println(transformToListString(lPerson, f1));
		System.out.println(transformToListInt(lPerson, f2));
	}
	
	
	public static List<String> transformToListString(List<Person> list, Function<Person, String> func){
		List<String> ls = new ArrayList<>();
		for (Person p : list) {
			ls.add(func.apply(p));
			//func.apply(p) retournera ici le nom de l'objet Person
		}
		return ls;		
	}
	public static List<Integer> transformToListInt(List<Person> list, Function<Person, Integer> func){
		List<Integer> ls = new ArrayList<>();
		for (Person p : list) {
			ls.add(func.apply(p));
			//func.apply(p) retournera ici l'âge multiplié par 2 de l'objet Person
		}
		return ls;		
	}
}
