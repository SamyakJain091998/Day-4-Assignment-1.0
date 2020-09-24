import java.util.*;
import java.lang.*;

public class UC8{

	public int computeWage(int wageph, int workingDaysPerMonth, int workingHoursPerDay){
		return workingHoursPerDay * wageph * workingDaysPerMonth;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the code of Company you're in:\n1. Company A\n2. Company B\n3. Company C");
		int code = sc.nextInt();
		System.out.println("Enter your ID: ");
		int id = sc.nextInt();
		Company co =  new Company(code, id);

		UC8 u = new UC8();
		int ans = u.computeWage(co.getWagePerHour(), co.getWorkingDaysPerMonth(), co.getWorkingHoursPerDay());

		System.out.println("Wage earned in total for the Employee with Id: " + id + " would be: "+ans);

	}
}