import java.util.Arrays;
import java.util.Scanner;

public class NameReversal {
	public static String getStringOfLength(int l) {
		if(l>0) {
			char[] a = new char[l];
			Arrays.fill(a, ' ');
			return new String(a);
		}
		return "";
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = "";
		System.out.println("What is your name?\n");
		name = in.nextLine(); //I am an idiot lol why did I initially put this after the assignment of revName
		String revName = getStringOfLength(name.length());
		if (revName.length() == 0) {
			System.out.println("An error has occured! Setting name to John Smith!");
			name = "John Smith";
		}
		System.out.println(name.length());
		//revName = name.substring(name.length()-1, 0);
		for (int i = 0; i<name.length(); i++) {
			revName += name.charAt((name.length()-1)-i);	
		}
		System.out.println("Reversed, your name is " + revName);
	}
}
