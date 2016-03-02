package stringCalculator;

public class StringCalculator {

	public int calculate(String s) {
		int result = 0;
		String tmp = "0";

		if (s.length() == 0) {
			System.out.println("Empty String provided.");
			return 0;
		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '+' && s.charAt(i) != '-') {
				tmp += s.charAt(i);
			} else if (s.charAt(i) == '+') {
				result += Integer.parseInt(tmp);
				tmp = "0";
			} else {
				result += Integer.parseInt(tmp);
				tmp = "-0";
			}
		}
		result += Integer.parseInt(tmp);
		return result;
	}

	public static void main(String[] args) {

		StringCalculator sc = new StringCalculator();
		System.out.println(sc.calculate(""));

	}

}
