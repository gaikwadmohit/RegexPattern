package regexCases;

import java.util.regex.*;

public class RegexPattern {
	

		public void first_Name() {
			// scanning
			String line = "Mohit";
			String pattern = "^[A-Z][a-z]*";

			// Create pattern object
			Pattern pat = Pattern.compile(pattern);

			// matching object create
			Matcher mat = pat.matcher(line);

			// Check Matching or not
			boolean result = mat.matches();
			System.out.println("First Name Matching result is " + result);
			System.out.println();

		}
		public void Last_Name() {

			// scanning
			String line = "Gaikwad";
			String pattern = "^[A-Z][a-z]*";

			// Create pattern object
			Pattern pat = Pattern.compile(pattern);

			// matching object create
			Matcher mat = pat.matcher(line);

			// Check Matching or not
			boolean result1 = mat.matches();
			System.out.println("Last Name Matching result is " + result1);
			System.out.println();

		}
		public void Email_Id() {

			// scanning
			String line = "abc.xyz@bl.co.in";
			String pattern = "^[a-z]\\.[a-z][@][a-z]\\.[a-z]\\.[a-z]*";

			// Create pattern object
			Pattern pat = Pattern.compile(pattern);

			// matching object create
			Matcher mat = pat.matcher(line);

			// Check Matching or not
			boolean result2 = mat.matches();
			System.out.println("Email_Id Matching result is " + result2);
			System.out.println();

		}
		public void Mobile_Number() {

			// scanning
			String line = "+91 8859652365";
			String pattern = "^([+]\\d{2}[ ])?\\d{10}$";

			// Create pattern object
			Pattern pat = Pattern.compile(pattern);

			// matching object create
			Matcher mat = pat.matcher(line);

			// Check Matching or not
			boolean result3 = mat.matches();
			System.out.println("Mobile Number Matching result is " + result3);
			System.out.println();

		}
}


