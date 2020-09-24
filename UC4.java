import java.util.*;
import java.lang.*;

class UC4{

	static final int nowork=0;
	static final int check=1;
	static final int part=2;
	static final int wageph=20;

	public static void main(String[] args){
	int hours;
	int totalwage=0;
		double ec= Math.floor(Math.random() * 10)%3;
		switch((int) ec){
			case check:
				hours=8;
				break;
			case part:
				hours=4;
				break;
			case nowork:
				hours=0;
				break;
			default:
				hours=0;
		}
		int total=hours*wageph;
	System.out.println("Wage earned in total would be: "+total);

	}
}