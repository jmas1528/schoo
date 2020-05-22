import java.util.Scanner;
 class Car {
private String name;
private String number;
private int width;
private int height;
private int length;
private double x;
private double y;
private double fuel;

Car(String name,String number,int width, int length, int height,double fuel){
	this.name=name; this.number=number; this.width=width; this.length=length; x=y=0.0; this.fuel=fuel;
	this.height=height;
}
 double getx() {return x;}
 double gety() {return y;}
 double getfuel() {return fuel;}
 
 void putspec() {
	 System.out.println("���O�F"+name);
	 System.out.println("�ԑ̔ԍ�"+number);
	 System.out.println("�ԕ��F"+width+"mm");
	 System.out.println("�Ԓ�"+length+"mm");
	 System.out.println("�ԍ�"+height+"mm");
	 
 }
  boolean move(double dx,double dy) {
	 double dist=Math.sqrt(dx*dx+dy*dy);
	 if (dist>fuel)
		 return false;
	 else {
		 fuel-=dist;
		 x+=dx;
		 y+=dy;
		 return true;
	 }
 }
 
	 }
 
 class ex8_2{
	 public static void main(String[]args) {
		 Car vits=new Car("�r�b�c","120-33234",1660,1500,3640,40.0);
		 Car march=new Car("�}�[�`","2345-1244",1660,1525,3695,41.0);
		 
		 vits.putspec();
		 System.out.println();
		 march.putspec();
		 
	 }
	 
 }
	 
 
	 