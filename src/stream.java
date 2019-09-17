import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class stream {

	
	public static void main(String args []) {
		List <String> lines = Arrays.asList("sprin","node","HADDAD");
		List <String> results = get (lines,"HADDAD");
		for(String tmp : results) {
			System.out.println(tmp);
		}
		 getstream (lines);

		
		
		
		
	}

	private static void getstream(List<String> lines) {
	
		
		// TODO Auto-generated method stub
		List <String> result1=lines.stream().filter(line->!"HADDAD".equals(line)).collect(Collectors.toList());
		result1.forEach(System.out::println);
	}

	private static List<String> get(List<String> lines, String filtre) {
	List<String> result= new ArrayList<String>();
		// TODO Auto-generated method stub
	for (String line : lines) {
        if (!"HADDAD".equals(line)) { // we dont like mkyong
            result.add(line);
        }
    }
	
	return result;
	}
}
