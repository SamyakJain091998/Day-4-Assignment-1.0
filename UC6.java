import java.util.*;
public class UC6{
	static final int fullcheck=1;
	static final int partcheck=2;
	static final int nocheck=0;
	static final int wageph=20;
	static final int dayspm=30;
	static final int fullhours=8;
	static final int parthours=4;
	static final int dayslimit=20;
	static final int hourslimit=100;
	public final strictfp static void main(String[] args){
		int totalwage=0;
		int workingdays=0;
		int workinghours=0;
		for(int i=0; i<dayspm; i++){
			double ec=(int) Math.floor(Math.random()*10)%3;
			
			if(workinghours>100){
				System.out.println("Limit for working hours has been reached for this month!");
				break;
			}
			if(workingdays>20){
				System.out.println("Limit for working days has been reached for this month!");
				break;
			}


			if(ec==0){
				System.out.println("The employee didn't work on day: "+(i+1)+" and hence no wage earned.");
			}
			else if(ec==1){
				totalwage+=(wageph*fullhours);
				workingdays+=1;
				workinghours+=fullhours;
				System.out.println("The employee worked full day on day: "+(i+1)+" and hence the wage earned today would be: "+ (wageph*fullhours));
			}
			else{
				totalwage+=(wageph*parthours);
				workingdays+=1;
				workinghours+=parthours;
				System.out.println("The employee worked part time on day: "+(i+1)+" and hence the wage earned today would be: "+(wageph*parthours));
			}
		}
		System.out.println("The employee worked for: "+workingdays+ " days & "+workinghours+ " hours.");
		System.out.println("The total wage earned by the employee this month would be: "+totalwage);
	}
}