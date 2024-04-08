import java.util.ArrayList;
import java.util.List;

public class ArrConversion {

	public static void main(String[] args) {
		
	        // Create a List
	        List<String> name = new ArrayList<>();
	        
	        name.add("Dharaneesh");
	        name.add("kumar");
	        name.add("Briyani");
	        
	        System.out.println("Before conversion");
	        System.out.println(name);

	        // Convert List to Array
	        String[] nameArray = name.toArray(new String[name.size()]);

	        System.out.println("\n");
            System.out.println("After conversion");
	        // Print the Array
	        for (String name1 : nameArray) {
	        	
	            System.out.println(name1);
	        }
	    }
}
/*
 * OUTPUT
 Before conversion
[Dharaneesh, kumar, Briyani]


After conversion
Dharaneesh
kumar
Briyani
	        
 */