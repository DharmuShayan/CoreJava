package com.blueribbon.controllflow;

public class TestDemo {

	public static void main(String[] args) {

		int month = 01;
		String monthName;
		switch (month) {
		case 1:
			monthName = "JANUARY";
			break;
		case 2:
			monthName = "FEBRUARY";
			break;
		case 3:
			monthName = "MARCH";
			break;
		case 4:
			monthName = "APRIL";
			break;
		case 5:
			monthName = "MAY";
			break;
		case 6:
			monthName = "JUNE";
			break;
		case 7:
			monthName = "JUILY";
			break;
		case 8:
			monthName = "AUGUST";
			break;
		case 9:
			monthName = "SEPTEMBER";
			break;
		case 10:
			monthName = "OCTOBER";
			break;
		case 11:
			monthName = "NOVEMBER";
			break;
		case 12:
			monthName = "DECEMBER";
			break;
		default:
			monthName = "Invailed moth";
			break;
		}
		System.out.println(monthName);
		
		int month1=1;
		int year=2019;
		int noOfdays=0;
		
		switch (month1) {
		case 1:case 3: case 5:case 7:case 8: case 10: case 12:
	        noOfdays=31;
			break;

		case 4: case 6: case 9: case 11:
			noOfdays=30;
			break;
		case 2:
			if ((year % 4==0)&& !(year % 100==0)||(year % 400==0)) {
				noOfdays=29;
			}
			else {
				noOfdays=28;
			}
			break;
			
		default:
			System.out.println("Invalid month.");
			break;
		}
		
		 System.out.println("Number of Days = " + noOfdays);
	}

}
