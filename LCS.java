import java.util.Scanner;
public class LCS {
	int lcs(char[] X, char[] Y, int m, int n)
	{
		if (m == 0 || n == 0)
			return 0;
		if (X[m - 1] == Y[n - 1])
			return 1 + lcs(X, Y, m - 1, n - 1);
		else
			return max(lcs(X, Y, m, n - 1), lcs(X, Y, m - 1, n));
	}
	int max(int a, int b)
	{
		return (a > b) ? a : b;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1;
		String s2;
		System.out.println("Enter the first String:");
		s1=sc.nextLine();
		System.out.println("Enter the Second String:");
		s2=sc.nextLine();
		LCS lcs = new LCS();

		char[] X = s1.toCharArray();
		char[] Y = s2.toCharArray();
		int m = X.length;
		int n = Y.length;

		System.out.println("Length of LCS is"
						+ " " + lcs.lcs(X, Y, m, n));
	}
}