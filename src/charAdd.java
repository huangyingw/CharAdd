public class charAdd {
	static int tranNum(char x) {
		if (x > '9' || x < '0')
			return -1;
		x -= '0';
		return x;
	}

	static int atoi(char[] x) {
		int result = 0;
		boolean positive = true;
		int nav = 0;
		if (x[0] == '-' || x[0] == '_') {
			positive = false;
			nav++;
		}
		do {
			result += tranNum(x[nav++]);
			result *= 10;
		} while (nav < x.length - 1);
		result += tranNum(x[nav]);
		if (!positive)
			result = -result;
		return result;
	}

	public static void main(String arg[]) {
		String source1 = "-234";
		System.out.println(atoi(source1.toCharArray()));
		String source2 = "235";
		System.out.println(atoi(source2.toCharArray()));
		System.out.println(atoi(source1.toCharArray())
				+ atoi(source2.toCharArray()));
	}
}
