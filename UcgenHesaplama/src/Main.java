import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a, b, c, u, alan;
		Scanner deger = new Scanner(System.in);
		System.out.print("birinci dik kenari giriniz:");
		a = deger.nextInt();
		System.out.print("ikinci dik kenari giriniz:");
		b = deger.nextInt();
		c = Math.sqrt(a * a + b * b);
		System.out.println("hipotenüs: " + c);
		u = (a + b + c) / 2;
		alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("ucgenin alani:" +alan);
	}

}
