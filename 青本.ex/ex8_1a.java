import java.util.Scanner;
 class Ningen{
    private String name;
   private  double   tall;
   private double  weight; 
    Ningen( String name,double  tall,double  weight ){
    	this.name=name;  this.tall=tall; this.weight=weight;
      }
    String getname(){
    	return name;
    }
    Double gettall() {
    	return tall;
    }
    Double getweight() {
    	return weight;
    }
    void go() {
    	 System.out.println("���O�F"+name);
    	 System.out.println("�g���F"+tall+"cm");
    	 System.out.println("�̏d�F"+weight+"kg");
    }
 }
 
    
public class ex8_1a{
	public static void main(String[]args) {
		Ningen murakoshi=new Ningen("���z�Y��",170.0,60.0);
		System.out.println(murakoshi.getname());
		System.out.println(murakoshi.gettall());
		System.out.println(murakoshi.getweight());
		murakoshi.go();
	}
}

