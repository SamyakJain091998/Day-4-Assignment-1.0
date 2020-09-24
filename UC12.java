import java.util.*;


//Implementing interface with function addToCompanyEmpWage
interface I1{
	public void addToCompanyEmpWage(String var1, int var2, int var3, int var4);
}

public class UC12 implements I1{

	public static final int no_work = 0;
	public static final int part_time = 1;
	public static final int full_time = 2;
	public static ArrayList<String> Companies = new ArrayList<String>(); 

	private int companyNumber = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	//Constructor of the class
	public UC12(){
		companyEmpWageArray = new CompanyEmpWage[10000];
	}

	@Override
	public void addToCompanyEmpWage(String comname, int emphour, int noOfWorkingDays, int hourLimit){
		companyEmpWageArray[companyNumber] = new CompanyEmpWage(comname, emphour, noOfWorkingDays, hourLimit);
		companyNumber++;
	}

	private void computeWage(){
		for(int i=0; i<companyNumber;i++){
			companyEmpWageArray[i].setTotalWage(this.computeWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	private int computeWage(CompanyEmpWage companyEmpWage){
		int totalwage;
		int emphrs = 0; int workingdays = 0; int totalhours = 0;
		while(totalhours <= companyEmpWage.workingHoursPerMonth && workingdays <= companyEmpWage.workingDaysPerMonth){
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
		totalwage = totalhours * (companyEmpWage.wageph);
		return totalwage;
	}

	public void printArrayList(){
		System.out.println("The list of all companies are: " + Companies);
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter the data for the first time: ");
				System.out.println("Enter the company name:");
				String cname = sc.next();
				Companies.add(cname);

				System.out.println("Enter wage per hour:");
				int wph = sc.nextInt();
				
				System.out.println("Enter the no of working days in a month:");
				int wdpm = sc.nextInt();
				
				System.out.println("Enter hour limit in a month:");
				int hlimit = sc.nextInt();
				
				UC12 u = new UC12();
				u.addToCompanyEmpWage(cname, wph, wdpm, hlimit);
				u.computeWage();

		while(true)
			{

				System.out.println("Do you want to enter data for a company? Type Y for yes or N for no");
				char ch = sc.next().charAt(0);;
				if(ch != 'Y'){
					u.printArrayList();
					System.out.println("Thank you!");
					System.exit(0);
				}
				System.out.println("Enter the company name:");
				cname = sc.next();
				if(Companies.indexOf(cname) != -1){
					System.out.println("Entered company already exist. Please mention a new company name.");
					continue;
				}
				Companies.add(cname);

				System.out.println("Enter wage per hour:");
				wph = sc.nextInt();
				
				System.out.println("Enter the no of working days in a month:");
				wdpm = sc.nextInt();
				
				System.out.println("Enter hour limit in a month:");
				hlimit = sc.nextInt();
				
				u.addToCompanyEmpWage(cname, wph, wdpm, hlimit);
				u.computeWage();
			}

		//CompanyEmpWage  c = new CompanyEmpWage();
		// int ans = u.computeWage(c.getCompanyName(), c.getWagePerHour(), c.getWorkingDaysPerMonth(), c.getWorkingHoursPerMonth());
		// System.out.println("The employee worked for "+ c.getCompanyName() + " and earned total wage of "+ ans);
	}
}