public class charAdd {
	static int tranNum(char x) {
		if (x > '9' || x < '0')
			return -1;
		x -= '0';
		return x;
	}

	static int atoi(String x) {
		int result = 0;
		boolean positive = true;
		int nav = 0;
		if (x.charAt(0) == '-' || x.charAt(0) == '_') {
			positive = false;
			nav++;
		}
		do {
			result += tranNum(x.charAt(nav++));
			result *= 10;
		} while (nav < x.length() - 1);
		result += tranNum(x.charAt(nav++));
		if (!positive)
			result = -result;
		return result;
	}

	public static void main(String arg[]) {
		String source1 = "-234";
		System.out.println(atoi(source1));
		String source2 = "235";
		System.out.println(atoi(source2));
	}
}
