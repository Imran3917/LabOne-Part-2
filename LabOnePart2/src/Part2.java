import java.util.Scanner;

public class Part2 {
	
	//validate the 31,30,28 and 29 days of months
			public static boolean validateDate(int month, int day, int year) {
				//check for months of 31 days
				if(month==1 || month==3 || month==5 ||month==7 || month==8 || month==10 || month==12) {
					if(day<1 || day>31) {
						System.out.print("Please enter day between 1 and 31 only: ");
						return false;
					}
				}
				//check for months of 30 days
				else if(month==4 || month==6 || month==9 || month==11) {
					if(day<1 || day>30) {
						System.out.print("Please enter day between 1 and 30 only: ");
						return false;
					}
				}
				//check for February
				else {
					//check for leap year
					if(year%4==0) {
						if(day<1 || day>29) {
							System.out.print("Please enter day between 1 and 29 only: ");
							return false;
						}
					}
					//check for non leap year
					else {
						if(day<1 || day>28) {
							System.out.print("Please enter day between 1 and 28 only: ");
							return false;
						}
					}
				}
				return true;
			}
			//main function
			public static void main(String[] args) {
				//variables for date 1
				int day1,month1,year1;
				//variables for date 2
				int day2,month2,year2;
				//difference variables
				int diffDay,diffMon,diffYear;
				
				//input first date
				System.out.println("Taking input date 1: ");
				Scanner input = new Scanner(System.in);
				
				//input first day by year, month and day
				//take input year
				System.out.print("Enter year: ");
				year1 = input.nextInt();	
				//validate year
				while(year1<1) {
					System.out.print("Please enter year greater than 0 only: ");
					year1 = input.nextInt();
				}
				//take input month
				System.out.print("Enter month: ");
				month1 = input.nextInt();
				//validate month
				while(month1<1 || month1>12) {
					System.out.print("Please enter month between 1 and 12 only: ");
					month1 = input.nextInt();
				}
				//take input day
				System.out.print("Enter day: ");
				day1 = input.nextInt();
				//validate day
				while(!validateDate(month1,day1,year1)) {
					day1 = input.nextInt();
				}
				
				
				//input second date by year, month and day
				System.out.println("Taking input date 2: ");
				
				//take input year
				System.out.print("Enter year: ");
				year2 = input.nextInt();	
				//validate year
				while(year1<1) {
					System.out.print("Please enter year greater than 0 only: ");
					year2 = input.nextInt();
				}
				//take input month
				System.out.print("Enter month: ");
				month2 = input.nextInt();
				//validate month
				while(month2<1 || month2>12) {
					System.out.print("Please enter month between 1 and 12 only: ");
					month2 = input.nextInt();
				}
				//take input day
				System.out.print("Enter day: ");
				day2 = input.nextInt();
				//validate day
				while(!validateDate(month2,day2,year2)) {
					day2 = input.nextInt();
				}
				
				//day difference
				if(day2<day1) {
					//carry 1 if day 2 is lesser
					day2+=30;
					month2-=1;
				}
				//calculate difference of day
				diffDay = day2 - day1;
				
				//calculate difference of month
				if(month2<month1) {
					month2+=12;
					year2-=1;
				}
				diffMon = month2 - month1;
				//calculate difference of year
				diffYear = year2 - year1;
				
				//if dates are not appropriate
				if(diffDay<1 || diffMon<1 || diffYear<1) {
					System.out.println("second date is smaller than first date... ");
				}
				else {
					//print difference
					System.out.println("Difference is: ");
					System.out.println("Years: "+diffYear+", Months: "+diffMon+", Days: "+diffDay);
				}

				//close input variable
				input.close();
			}
		


}
