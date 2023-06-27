package main.java.ssafy.project_ssafy.seasonal.self.collection;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



public class Solution {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		int year = ld.getYear();
		int month = ld.getMonth().getValue();

		int[] days = {28, 29, 30, 31};
		int count = 0;

		if(month == 2) {
			if((year % 4 == 0) && (year % 100 != 0) || (year % 400 ) == 0) {
				count = days[1];
			}else{
				count = days[0];
			}
		}else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			count = days[3];
		}else{
			count = days[2];
		}

		System.out.println(count + " days for " + year + "-" + month);
	}


}
