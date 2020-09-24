import java.util.*;
public class UC9{

	public static final int no_work = 0;
	public static final int part_time = 1;
	public static final int full_time = 2;

	public int computeWage(String comname, int wageperhour, int dayspm, int hourslimit){
		int totalwage;
		int emphrs = 0; int workingdays = 0; int totalhours = 0;
		while(totalhours <= hourslimit && workingdays <= dayspm){
			workingdays++;
			int work_type = (int) Math.floor(Math.random()*10)%3;
			switch(work_type){
				case no_work:
					emphrs = 0;
					break;
				case part_time:
					emphrs = 4;
					break;
				case full_time:
					emphrs = 8;
					break;
				default:
					break;
			}
			totalhours+=emphrs;
			System.out.println("Employee worked for: "+emphrs+" hours today.");
		}
		totalwage = totalhours * wageperhour;
		return totalwage;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the company name:");
		String cname = sc.next();
		
		System.out.println("Enter wage per hour:");
		int wph = sc.nextInt();
		
		System.out.println("Enter the no of working days in a month:");
		int wdpm = sc.nextInt();
		
		System.out.println("Enter hour limit in a month:");
		int hlimit = sc.nextInt();
		
		Company c = new Company(cname, wph, wdpm, hlimit);
		UC9 u = new UC9();
		int ans = u.computeWage(c.getCompanyName(), c.getWagePerHour(), c.getWorkingDaysPerMonth(), c.getWorkingHoursPerMonth());
		System.out.println("The employee worked for "+ c.getCompanyName() + " and earned total wage of "+ ans);
	}
}