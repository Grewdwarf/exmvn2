package example_maven2.exmvn2;

public class Main {

	public static void main(String[] args) {
		MyRandomMethods2 mrm = new MyRandomMethods2();

		for (int i = 0; i < 10; i++) {
			System.out.println(mrm.randomBetween1And10()+", ");
		}
		System.out.println("");
		for (int i = 0; i < 20; i++) {
			System.out.println(mrm.randomBetween11And20()+", ");
		}
		System.out.println("");
		for (int i = 0; i < 30; i++) {
			System.out.println(mrm.randomBetween21And30()+", ");
		}
		System.out.println("");
		for (int i = 0; i < 40; i++) {
			System.out.println(mrm.randomBetween31And40()+", ");
		}
		System.out.println("");
		for (int i = 0; i < 50; i++) {
			System.out.println(mrm.randomBetween41And50()+", ");
		}
	}

}
