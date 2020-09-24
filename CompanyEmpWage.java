public class CompanyEmpWage{
	public final String companyName;
	public final int wageph;
	public final int workingDaysPerMonth;
	public final int workingHoursPerMonth;
	public int totalWage;
	public CompanyEmpWage(String companyName, int wageph, int workingDaysPerMonth, int workingHoursPerMonth){
		this.companyName = companyName;
		this.wageph = wageph;
		this.workingDaysPerMonth = workingDaysPerMonth;
		this.workingHoursPerMonth = workingHoursPerMonth;
	}

	public void setTotalWage(int totalWage){
		this.totalWage = totalWage;
	}
	// public void setDailyWage(int dailyWage){
	// 	this.dailyWageArray[i] = dailyWage;
	// 	i++;
	// }
	// public int getTotalWage(){
	// 	return totalWage;
	// }

	// public String getCompanyName(){
	// 	return companyName;
	// }
	// public int getWagePerHour(){
	// 	return wageph;
	// }
	// public int getWorkingDaysPerMonth(){
	// 	return workingDaysPerMonth;
	// }
	// public int getWorkingHoursPerMonth(){
	// 	return workingHoursPerMonth;
	// }

	@Override
	public String toString(){
		return "Total wage for the company: " + companyName + " would be: " + totalWage; 
	}
}