import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class AsalCarpanOOPApp {

	public static void main(String[] args) {
		new AsalCarpanOOPApp().run();

	}

	public void run() {

		int n;



		Scanner sc = new Scanner(System.in);
		System.out.println("Kaç farklı değer gireceksiniz yazınız : ");
		n=sc.nextInt();
		System.out.println(n+" sayı giriniz : (Sayılar arasında boşluk bırakınız.)");


		ArrayList<Sayi> myList = new ArrayList<Sayi>();
		int[] array = new int[n];
		for (int i=0;i<n;i++){
			array[i] = sc.nextInt();
			 myList.add(new Sayi(array[i]));
			myList.get(i).asalCarpanlaraAyir();
			System.out.println((i+1) + " sayi " + myList.get(i).toString());
		}

		System.out.println("Obeb " + obebBul(array, n));
		System.out.println("Okek " + okekBul(array));




//		myList.get(0).asalCarpanlaraAyir();
//		sayi2.asalCarpanlaraAyir();
//
//		System.out.println("Sayi 1 : " + sayi1.toString());
//		System.out.println("Sayi 2 : " + sayi2.toString());
//
//
//		System.out.println("Obeb " + obebBul(sayi1, sayi2));
//		System.out.println("Okek " + okekBul(sayi1, sayi2));

	}


	int ebob,ekok,kalan,bolunen,bolen;

	public long okekBul(int[] array) {

		long array_ekok = 1;
		int carpan = 2;

		while (true) {
			int sayac = 0;
			boolean bolunebilir = false;

			for (int i = 0; i < array.length; i++) {

				// Negatif sayıları pozitif farz ederek hesaplama yapıyoruz.

				if (array[i] == 0) {
					return 0;
				}
				else if (array[i] < 0) {
					array[i] = array[i] * (-1);
				}
				if (array[i] == 1) {
					sayac++;
				}

				if (array[i] % carpan == 0) {
					bolunebilir = true;
					array[i] = array[i] / carpan;
				}
			}

			if (bolunebilir) {
				array_ekok = array_ekok * carpan;
			}
			else {
				carpan++;
			}

			if (sayac == array.length) {
				return array_ekok;
			}
		}


	}

	static int ebob(int a, int b)
	{
		if (a == 0)
			return b;
		return ebob(b % a, a);
	}

	static int obebBul(int arr[], int n)
	{
		int result = arr[0];
		for (int i = 1; i < n; i++)
			result = ebob(arr[i], result);

		return result;
	}



}
