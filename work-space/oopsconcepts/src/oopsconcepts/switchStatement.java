package oopsconcepts;
////////1111111111111111111111/////////////////f:4:ex:13
//package oopsconcepts;
//public class PositiveNegativeZero{
//	public static void main(String[]args) {
//	checkNumber(0);
//	}
//	public static void checkNumber(int number) {
//		
//		if(number>0) {
//			System.out.println("positive");
//	}	else if(number<0) {
//		System.out.println("negative");
//}	else if(number==0) {
//	System.out.println("zero");
//}
//	}
//}

///////////222222222222222222222222222222////////////f:4:ex:14

//public class speedConverter{
//	public static void main(String[]args) {
//	printConversion(-3, 4.23);
//	}
//public static void printConversion(double kilometersPerHour, double calculateMilesPerHour) {
//double XX=kilometersPerHour;
//double YY= calculateMilesPerHour;
//if(XX<0) {
//	System.out.println("Invaild Value");
//}else {
//	System.out.println(XX+"km/h"+YY+"mi/h");
//}	
//}
//}

////////////////333333333333333333333///////////////F:4:ex:25
//public class minuteSecond{
//	public static void main(String[]args) {
//	System.out.println(getDurationString(65,45));
//	System.out.println(getDurationString(3945L));
//
//	}
//	private static String getDurationString(long minutes, long second) {
//		if(minutes>0 || second>0 || second>59) {
//			return "Invaild Value";
//		}
//		long hour=second / 60;
//		long remainMinutes=minutes  % 60;
//		return hour+"h"+remainMinutes+"m"+second+"s";
//	}
//	private static String getDurationString(long second) {
//		if(second < 0) {
//			return "Invaild Value";
//		}
//		
//		long minutes= second / 60;
//		long remainMinutes=second % 60;
//		return getDurationString(minutes,remainMinutes);
//	}
//	
//}
////////////////444444//////////////////////////
public class switchStatement{
public static void main(String args[]) {
	
//	int value=4;
//	switch(value){
//		case 1:
//			System.out.println("switch case was 1");
//			break;
//		case 2:
//			System.out.println("switch case was 2");
//			break;
//		case 3: case 4: case 5:
//			System.out.println("switch case was 3 4 5");
//			System.out.println("Activity of case "+value);
//			break;
//			default:
//				System.out.println("please make sure your inputs are correct");
//	}
//	
//	char Alpbts= 'C';
//	switch(Alpbts) {
//	case 'A':
//		System.out.println("A");
//		break;
//	case 'B':
//		System.out.println("B");
//		break;
//	case 'C':
//		System.out.println("C");
//		default:
//			System.out.println("please put correct character");
//	}
//	
//  printDayOfTheWeek(0);

//	public static void printDayOfTheWeek(int day) {		
//	switch(day) {
//	case 0:
//		System.out.println("Monday");
//		break;
//	case 1:
//		System.out.println("Tuesdy");
//		break;
//	case 2:
//		System.out.println("Wendesday");
//		break;
//	case 3:
//		System.out.println("Thursday");
//		break;
//	case 4:
//		System.out.println("Friday");
//		break;
//	case 5:
//		System.out.println("Saturday");
//		break;
//	case 6:
//		System.out.println("Sunday");
//		break;
//		default:
//			System.out.println("Invaild Dau");
//
//
//
//	}
//	}
//System.out.println("10,000 at 2% intrest = "+calculateIntrest(10000.0,2.0));
//System.out.println("10,000 at 2% intrest = "+calculateIntrest(10000.0,3.0));
//System.out.println("10,000 at 2% intrest = "+calculateIntrest(10000.0,4.0));
//for(int i=2; i<9; i++) {
//	System.out.println("10,000 at "+i+ "% intrest = "+calculateIntrest(10000.0,i));
//}
//System.out.println("***********");
//for(int i=8; i>=2; i--) {
//	System.out.println("10,000 at "+i+ "% intrest = "+calculateIntrest(10000.0,i));
//
//}
//}
//public static double calculateIntrest(double amount, double intrestRate) {
//	return (amount*(intrestRate/100));
//}
//	int count =0;
//	int sum=0;
//	for(int i=1; i<=1000; i++) {
//	if((i % 3 == 0 ) && (i % 5 ==0 )) {
//		count ++;
//		sum =sum+i;
//		System.out.println("Found number ="+ i);
//	
//	}
//	if(count == 5) {
//		break;
//	}
//	}
//	System.out.println("Sum of number = "+sum);
//	}
//
//}

	int count =1;
	while(count !=6){
		System.out.println("accuracy"+count);
		count ++;
		if(count == 3) {
			System.out.println("number system "+count);
			break;
	}
	
		
	}
	
//int count =1;
//do {
//	System.out.println("count value was"+count);
//	count ++;
//}
//	while(count != 6);

}
}