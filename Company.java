public class Company{

	private final String companyName;
	private final int wageph;
	private final int workingDaysPerMonth;
	private final int workingHoursPerMonth;

	public Company(String companyName, int wageph, int workingDaysPerMonth, int workingHoursPerMonth){
		this.companyName = companyName;
		this.wageph = wageph;
		this.workingDaysPerMonth = workingDaysPerMonth;
		this.workingHoursPerMonth = workingHoursPerMonth;
	}

	public String getCompanyName(){
		return companyName;
	}
	public int getWagePerHour(){
		return wageph;
	}
	public int getWorkingDaysPerMonth(){
		return workingDaysPerMonth;
	}
	public int getWorkingHoursPerMonth(){
		return workingHoursPerMonth;
	}
}