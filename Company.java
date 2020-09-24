public class Company{
	private int code, id;
	private int wageph, workingDaysPerMonth, workingHoursPerDay;
	public Company(int cod, int idd){
		code = cod;
		id = idd;

		if(code == 1){
			wageph = 10; workingDaysPerMonth = 10; workingHoursPerDay = 50;
		}else if(code == 2){
			wageph = 20; workingDaysPerMonth = 20; workingHoursPerDay = 100;
		}else{
			wageph = 30; workingDaysPerMonth = 25; workingHoursPerDay = 150;
		}

	}

	public int getWagePerHour(){
		return wageph;
	}
	public int getWorkingDaysPerMonth(){
		return workingDaysPerMonth;
	}
	public int getWorkingHoursPerDay(){
		return workingHoursPerDay;
	}
}