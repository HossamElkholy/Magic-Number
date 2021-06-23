import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Magic_Number {

	public static List<Character> convertStringToCharList(String str) {

		List<Character> chars = new ArrayList<>();

		for (char ch : str.toCharArray()) {

			chars.add(ch);
		}

		return chars;
	}

	public static void main(String[] args) {

		System.out.println("Please write any number you want");
		int num = new Scanner(System.in).nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 2; j < 10; j++) {

				String n1 = Integer.toString(i);
				String r1 = Integer.toString(i * j);
				if (n1.length() == r1.length()) {

					List<Character> CharList = convertStringToCharList(n1);
					List<Character> CharList2 = convertStringToCharList(r1);

					Collections.sort(CharList, Comparator.comparing(Integer::valueOf));
					Collections.sort(CharList2, Comparator.comparing(Integer::valueOf));

					if (CharList.equals(CharList2) == true) {
						System.out.println("m = " + i + "; n= " + (i * j) + "; k = " + j);

					}
				}
			}
		}
		System.out.println("\nProgram is finished Thank You");
	}
}
