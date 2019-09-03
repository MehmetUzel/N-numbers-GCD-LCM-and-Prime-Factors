import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Sayi {

	private List<AsalCarpan> asalCarpanList = new ArrayList<>();
	private int sayi;
	
	public Sayi(int sayi) {
		super();
		this.sayi = sayi;
	}

	public int getSayi(){
		return sayi;
	}


	public void setSayi(int newSayi){
		sayi = newSayi;
	}
	
	public void asalCarpanlaraAyir() {

		int n = getSayi();



		for (int i = 2; i <= n; i++) {
			AsalCarpan ac = new AsalCarpan(0,0);
			int count = 0;
			while (n % i == 0) {



				n /= i;

				count++;

			}
			ac.setDeger(i);
			ac.setCarpan(count);
			if(ac.getCarpan()>0)
			asalCarpanList.add(ac);

		}

	}

	public List<AsalCarpan> getAsalCarpanList() {
		return asalCarpanList;
	}

	public void setAsalCarpanList(List<AsalCarpan> asalCarpanList) {
		this.asalCarpanList = asalCarpanList;
	}
	
	public String toString() {
		// Sayinin değerini ve asal çarpanlarını içeren String döndür
		// @TODO

		return String.valueOf(getSayi())+ getAsalCarpanList();
	}
	
	
	
	
}
