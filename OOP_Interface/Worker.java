/*
 * Bir id, isim, department ve maas bilgilerinden ve standard fonksiyonlardan 
 * olu�an bir Worker (i�ci) s�n�f� tasarlay�n ve kodlay�n.S�n�f�n methodlar�n� ve 
 * nesnelerini test ediniz.
 */
import java.util.Scanner;  //Console input i�lemi i�in Scanner nesnesi kulln�lacak
public class Worker implements WorkerInterface{
	private int id;
	private String isim, department;
	private double maas;
	private static int count=0;
	
	public Worker(){
		id=99999; isim="aaaaaaa";
		department="ddddddddddd";
		maas=0;  //Fabrika ayarları
		count++;
	}
	public Worker(int id1, String isim1, String department1, double maas1){
		id=id1;
		isim=isim1;
		department=department1;
		maas=maas1;
		count++;
	}
	public void setWorker(int id1, String isim1, String department1, double maas1){
		id=id1;
		isim=isim1;
		department=department1;
		maas=maas1;
	}
	public static Worker getWorker(){
		int id1;
		String isim1, department1;
		double maas1;
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("id için bir tamsayı gir: ");
			id1=scan.nextInt();
			System.out.print("isim için bir string gir: ");
			isim1=scan.next();
			System.out.print("Department için bir string gir: ");
			department1=scan.next();
			System.out.print("Maas için bir double deger gir:");
			maas1=scan.nextDouble();
		}
		return new Worker(id1,isim1,department1,maas1);
	}
	public void setMaas(double maas){
		this.maas=maas;  //Setter fonksiyonu
	}
	public double getMaas(){
		return maas;
	}
	public void print(){
		System.out.println("Id:"+id+" isim:"+isim+" Department:"+department+" Maas:"+maas);
	}
	public static int getObjectNo(){
		return count;
	}
	//Simdi interface gerçekleşecek, metodlar buraya yaz�lacak
	public void print2(){
		System.out.println("Id:"+id+" Maas:"+maas);
	}
	public void setId(int id1){
		
	}
}
