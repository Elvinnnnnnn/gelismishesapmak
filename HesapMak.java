package hesapmak;

import java.util.Scanner;

public class HesapMak {
	static int a, b, islem;

	public static int toplama(int a, int b) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("İlk Sayıyı Giriniz :");
		a = scanner.nextInt();

		System.out.print("İkinci Sayıyı Giriniz : ");
		b = scanner.nextInt();

		int result = a + b;

		System.out.println("Toplama İşleminin Sonucu : " + result);

		return result;
	}

	public static int cikarma(int a, int b) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("İlk Sayıyı Giriniz :");
		a = scanner.nextInt();

		System.out.print("İkinci Sayıyı Giriniz : ");
		b = scanner.nextInt();

		int result = a - b;

		System.out.println("Çıkarma İşleminin Sonucu : " + result);

		return result;
	}

	public static int carpma(int a, int b) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("İlk Sayıyı Giriniz :");
		a = scanner.nextInt();

		System.out.print("İkinci Sayıyı Giriniz : ");
		b = scanner.nextInt();

		int result = a * b;

		System.out.println("Çarpma İşleminin Sonucu : " + result);

		return result;
	}

	public static int bolme(int a, int b) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("İlk Sayıyı Giriniz :");
		a = scanner.nextInt();

		System.out.print("İkinci Sayıyı Giriniz : ");
		b = scanner.nextInt();

		int result = a / b;

		System.out.println("Bölme İşleminin Sonucu : " + result);

		return result;
	}

	public static int us(int a, int b) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Üssü Alınacak Sayıyı Giriniz :");
		a = scanner.nextInt();

		System.out.print("Üs Olacak Sayıyı Giriniz : ");
		b = scanner.nextInt();

		int result = 1;

		for (int i = 1; i <= b; i++) {

			result *= a;
		}

		System.out.println("Üs Alma İşleminin Sonucu : " + result);

		return result;

	}

	public static int fak(int a, int b) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Faktoriyel Alınacak Sayıyı Giriniz : ");

		b = scanner.nextInt();

		int result = 1;

		for (int i = 1; i <= b; i++) {

			result *= i;

		}

		System.out.println("Faktoriyel İşleminin Sonucu : " + result);

		return result;
	}

	public static int mod(int a, int b) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Mod Alınacak Sayıyı Giriniz :");
		a = scanner.nextInt();

		System.out.print("Bölünecek Sayıyı Giriniz : ");

		b = scanner.nextInt();

		int result = a % b;

		System.out.println("Mod Alma İşleminin Sonucu : " + result);

		return result;
	}

	public static int alan(int a, int b) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Kısa Kenarı Giriniz :");
		a = scanner.nextInt();

		System.out.print("Uzun Kenarı Giriniz : ");
		b = scanner.nextInt();

		int result = (a * b);

		System.out.println("Alan Hesaplama İşleminin Sonucu : " + result);

		return result;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		/*
		 * 1- Toplama İşlemi 2- Çıkarma İşlemi 3- Çarpma İşlemi 4- Bölme işlemi 5- Üslü
		 * Sayı Hesaplama 6- Faktoriyel Hesaplama 7- Mod Alma 8- Dikdörtgen Alan ve
		 * Çevre Hesabı
		 */

		System.out.println("**********HOŞGELDİNİZ**********");

		do {
			System.out.println(
					"Yapmak İstediğiniz İşlemi Seçiniz :\n 1- Toplama\n 2- Çıkarma\n 3- Çarpma\n 4- Bölme\n 5- Üs Hesaplama\n 6- Faktoriyel Hesaplama\n 7- Mod Alma \n 8- Dikdörtgen Alanı\n 9- Çıkış");
			islem = scanner.nextInt();

			switch (islem) {
			case 1:
				toplama(a, b);
				break;

			case 2:
				cikarma(a, b);
				break;

			case 3:
				carpma(a, b);
				break;

			case 4:
				bolme(a, b);
				break;

			case 5:
				us(a, b);
				break;

			case 6:
				fak(a, b);
				break;

			case 7:
				mod(a, b);
				break;

			case 8:
				alan(a, b);
				break;

			}

		} while (islem < 9);

		

		System.out.println("Güle Güle...");
	}

}
