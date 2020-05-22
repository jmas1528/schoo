import java.util.Scanner;
public class Ex10_4 {
private int year=1;
private int month=1;
private int date=1;

public static boolean isLeap(int y) {
	return y%4==0 && y%100 !=0||y%400==0;
	
}


public Ex10_4()                                      {}
public Ex10_4(int year)                              {this.year=year;}
public Ex10_4(int year,int month)                    {this(year);this.month=month;}
public Ex10_4(int year,int month, int date)          {this(year,month);this.date=date;}
public Ex10_4(Ex10_4 d)                                 {this(d.year,d.month,d.date);}

public int getYear() {return year;}
public int getMonth() {return month;}
public int getDay() {return date;}

public int setYear() {this. year=year;}
public int setMonth() {this.month=month;}
public int setDay() {this. date =date;}

public void set (int year,int month, int date) {
	this. year=year;
	this.month=month;
	this. date =date;
}

public static boolean isLeap() {return isLeap(year);}
public int dayOfweek() {
	int y=year;
	int m=month;
	if(m==1||m==2) {
		y--;
		m+=12;
	}
	return (y+y/4-y/100+y/400+(13*m+8)/5+date)%7;
	}
public boolean equalTo(Ex10_4 d) {
	return year ==d.year && month == d.month && date == d.date;
}

public String toString() {
	String[]wd = {"“ú","Œ","‰Î","…","–Ø","‹à","“y"};
	return String.format("%04d”N%02dŒ%02d“ú(%s)",year,month,date,wd[dayOfweek()]);
}
}
