package practice01;

public class Prob5 {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {

			String a = String.valueOf(i);
			// System.out.println(a);
			if (a.length() == 1) {
				if (a.charAt(0) == '3' || a.charAt(0) == '6' || a.charAt(0) == '9') {
					System.out.println(a + "짝");
				}
			} else {
				if (a.charAt(0) == '3' || a.charAt(0) == '6' || a.charAt(0) == '9') {

					if (a.charAt(1) == '3' || a.charAt(1) == '6' || a.charAt(1) == '9') {

						System.out.println(a + "짝짝");
					} else {
						System.out.println(a + "짝");
					}

				}else if(a.charAt(1) == '3' || a.charAt(1) == '6' || a.charAt(1) == '9'){
					System.out.println(a + "짝");


			}

		}
		}}}

