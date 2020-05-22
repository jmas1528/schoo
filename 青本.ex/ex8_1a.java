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
    	 System.out.println("名前："+name);
    	 System.out.println("身長："+tall+"cm");
    	 System.out.println("体重："+weight+"kg");
    }
 }
 
    
public class ex8_1a{
	public static void main(String[]args) {
		Ningen murakoshi=new Ningen("村越雄大",170.0,60.0);
		System.out.println(murakoshi.getname());
		System.out.println(murakoshi.gettall());
		System.out.println(murakoshi.getweight());
		murakoshi.go();
	}
}

