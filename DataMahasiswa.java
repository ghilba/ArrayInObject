package arrayInObject;

public class DataMahasiswa {

	public static void main (String[] args) {
		int maxSize = 100;
		ManageMahasiswa obj = new ManageMahasiswa (maxSize);
		obj.insertt("116705000", "Andre", 24);
		obj.insertt("116705001", "Parto", 29);
		obj.insertt("116705002", "Sule", 27);
		obj.insertt("116705003", "Aziz", 20);
		obj.insertt("116705004", "Nunung", 20);
		System.out.println("Data mahasiswa : ");
		obj.display();
	}
}
