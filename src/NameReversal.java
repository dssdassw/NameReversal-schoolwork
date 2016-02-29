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
		String revName = getStringOfLength(name.length());
		name = in.next();
		if (revName.length() == 0) {
			System.out.println("An error has occured! Setting name to John Smith!");
			name = "John Smith";
			revName = "          ";
		}
		for (int i = 0; i<name.length(); i++) {
			//todo
		}
	}
}
