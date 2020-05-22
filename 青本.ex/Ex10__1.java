import java.util.Scanner;
public class Ex10__1 {
	
static int counter=0;

private int id;

public Ex10__1() { 
	id=++counter;
}


public int getId() {
	return id;
}

public static int getMaxId() {
	return counter;
}

}

