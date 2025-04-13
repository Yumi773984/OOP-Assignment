package Java_Coursework;

public class StringPlay {

	public static void main(String[] args) {

	      String college = new String ("Leeds Beckett University"); //Similar for part (a)
	      
	      String town = new String("Anytown, UK"); // part (a)

	      int stringLength;
	      String change1, change2, change3; 
	      stringLength = college.length();
	      System.out.println (college + " contains " + stringLength + " characters."); //part(b)


	      change1 = college.toUpperCase(); // part (c)


	      change2 = change1.replace('E', '*'); // part (d)


	      change3 = college.concat(town); // part (e)


	      System.out.println ("The final string is " + change3);

	}

}
