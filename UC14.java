import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UC14 implements IComputeEmpWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private ArrayList<CompanyEmpWage> companyEmpWageList;
	private Map<String, CompanyEmpWage> companyEmpWageMap;

	public UC14() {
		companyEmpWageList = new ArrayList<>();
		companyEmpWageMap = new HashMap<>();
	}

	@Override
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);

		companyEmpWageList.add(companyEmpWage);
		companyEmpWageMap.put(company, companyEmpWage);
	}

	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHours = 0, totalWorkingHours = 0, totalWorkingDays = 0;

		while (totalWorkingDays++ < companyEmpWage.numOfWorkingDays
				&& totalWorkingHours < companyEmpWage.maxHoursPerMonth) {
			short empCheck = (short) (Math.random() * 10 % 3);

			switch (empCheck) {
			case IS_PART_TIME:
				empHours = 4;
				break;
			case IS_FULL_TIME:
				empHours = 8;
				break;
			default:
				empHours = 0;
			}

			totalWorkingHours += empHours;
			System.out
					.println("Total Working Day: " + totalWorkingDays + " & Total Working Hours: " + totalWorkingHours);
		}

		return totalWorkingHours * companyEmpWage.empRatePerHour;
	}

	@Override
	public void computeEmpWage() {
		for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	@Override
	public int getTotalWage(String company) {
		return companyEmpWageMap.get(company).totalEmpWage;
	}

	public static void main(String[] args) {
		UC14 empWageBuilder = new UC14();
		empWageBuilder.addCompanyEmpWage("Capgemini", 10, 20, 100);
		empWageBuilder.addCompanyEmpWage("Apple", 20, 30, 150);
		empWageBuilder.computeEmpWage();

		// query to get total wage of company capgemini
		System.out.println("Total Wage for capgemini(using query): " 
								+ empWageBuilder.getTotalWage("capgemini"));
	}
}