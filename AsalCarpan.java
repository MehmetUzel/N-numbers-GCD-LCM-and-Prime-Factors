public class AsalCarpan {

	private int deger;
	private int carpan;

	public AsalCarpan(int deger, int carpan) {
		super();
		this.deger = deger;
		this.carpan = carpan;
	}

	public int getDeger() {
		return deger;
	}

	public void setDeger(int deger) {
		this.deger = deger;
	}

	public int getCarpan() {
		return carpan;
	}

	public void setCarpan(int carpan) {
		this.carpan = carpan;
	}
	
	public String toString() {
		// @TODO asal �arpan string g�sterimi

		return String.valueOf(getDeger())+" sayısından " + String.valueOf(getCarpan())+" adet çarpan mevcut." ;
	}

}
