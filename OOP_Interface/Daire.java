
public class Daire implements MyInterface {  //Bu s�n�f bir interface kodunu implement i�in kullan�lacak
	private int r;
	public Daire(){
		r=1;
	}
	public Daire(int r1){
		r=r1;
	}
	public void set_r(int r1){
		r=r1;
	}
	public int get_r(){
		return r;
	}
	public double alan(){
		return pi*r*r;
	}
	public void print(){
		System.out.println("Alan:"+alan());
	}

}
