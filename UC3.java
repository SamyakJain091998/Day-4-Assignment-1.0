import java.util.*;

public class UC3{
	static final int check=1;
	static final int part = 2;
	static final int wageph=20;
	static final int full_day_hour=8;
	//static final int part_time_hour=4;
	public static void main(String[] args){
	//variables
	// static final int check=1;
	// static final int wageph=20;
	Scanner sc=new Scanner(System.in);
	//int part=2;
	double ec=Math.floor(Math.random() * 10)%3;
	if(ec==check){
		//int hours=8;
		int total=wageph*full_day_hour;
		System.out.println("The employee is Present, Worked full day for 8 hrs. & the wage earned would: "+total);
	}else if(ec==part){
		int input;
		System.out.println("Enter no of hours worked: ");
		input=sc.nextInt();
		System.out.println("Employee worked part time for: "+input+" hours and hence the wage earned would be: "+(input*wageph));
	}
	else{
		System.out.println("The employee is Absent and hence the wage earned would be 0.");
	}/*
	if(ec==check){
		System.out.println("Present");
	}else{
		System.out.println("Absent");
	}
	System.out.println("HEllo World!");
	*/
	}
}