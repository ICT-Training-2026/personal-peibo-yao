public class Hello {
	public static void main(String[] args) {
		System.out.println("入力");
		String input = new java.util.Scanner(System.in).nextLine();
		int card = Integer.parseInt(input);

		String str;
		switch (card) {
			case 1:
				str = "A";
				break;
			case 11:
				str = "J";
				break;
			case 12:
				str = "Q";
				break;
			case 13:
				str = "K";
				break;
			default:
				str = "" + card;
		}

		System.out.println("結果は"+str);
	}
}
