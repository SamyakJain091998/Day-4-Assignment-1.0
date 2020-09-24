import java.util.*;
public class UC5{
	static final int fullcheck=1;
	static final int partcheck=2;
	static final int nocheck=0;
	static final int wageph=20;
	static final int dayspm=20;
	static final int fullhours=8;
	static final int parthours=4;
	public final strictfp static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int totalwage=0;
			for(int i=0; i<dayspm; i++){
			double ec=(int) Math.floor(Math.random()*10)%3;
			if(ec==0){
				System.out.println("The employee didn't work on day: "+(i+1)+" and hence no wage earned.");
			}
			else if(ec==1){
				totalwage+=(wageph*fullhours);
				System.out.println("The employee worked full day on day: "+(i+1)+" and hence the wage earned today would be: "+ (wageph*fullhours));
			}
			else{
				totalwage+=(wageph*parthours);
				System.out.println("The employee worked part time on day: "+(i+1)+" and hence the wage earned today would be: "+(wageph*parthours));
			}
		}
		System.out.println("The total wage earned by the employee this month would be: "+totalwage);
	}
}