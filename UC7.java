import java.util.*;
import java.lang.*;

class UC7{

	static final int nowork=0;
	static final int check=1;
	static final int part=2;
	static final int wageph=20;

	public int computeWage(int typeOfWork){
		int t = typeOfWork;
		int hours;
		switch(t){
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
		return total;
	}

	public static void main(String[] args){
		int totalwage=0;
		int ec= (int) Math.floor(Math.random() * 10)%3;
		UC7 u = new UC7();
		int ans = u.computeWage(ec);
		System.out.println("Wage earned in total would be: "+ans);

	}
}