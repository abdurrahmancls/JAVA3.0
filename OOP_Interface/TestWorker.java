
public class TestWorker {
	public static void main(String args[]){
		
		System.out.println("Object sayisi:"+Worker.getObjectNo());
		Worker w1=new Worker();
		w1.print();
		Worker w2=new Worker(227,"Ahmet","MIS",4500);
		w2.print();
		//Worker w3=Worker.getWorker();
		//w3.print();
		System.out.println("Object sayisi:"+Worker.getObjectNo());
		Worker w3=w2;  //Nesne initialization i�lemi yani deklerasyon ve atama ayn� anda ger�ekle�iyor
		w3.print();
		System.out.println("Object sayisi:"+Worker.getObjectNo());
		Worker w4=new Worker(111,"Azime","Temizlik",3000);
		w4.print();
		System.out.println("Object sayisi:"+Worker.getObjectNo());
		
	//	w4.maas=5000;  //kapsülleme ilkesi gerekli private elemanlar sinif dogrudan erisilemezler
    //Ancak asagıdaki gibi public bir metod yardımıyla maas değistirilebili
		w4.setMaas(5000);
		w4.print();
	//Burada interface testi yapılacak;
		System.out.println("********TestInterface********");
		w4.print2();
	}
}
