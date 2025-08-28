
public class ArrayProdTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 2, 4, 6, 8, 3, 1, 2, 3 };
		int target = 12;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] * a[j] == target) {

					System.out.println(a[i]+" of index "+i + " * " + a[j] +" of index "+j+ " = target of " + a[i] * a[j]);
				}

			}

		}

	}

}
