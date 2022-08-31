package pacticePrograms;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatePrac {
	
	public static void main(String[] args) throws ParseException {
		
	int dateId=2266;
	String date="2019-02-07";
	
	String givenDate="2019-02-09";
	
;
	
    String sDate1="2019/02/09";  
    Date date1=new SimpleDateFormat("yyyy/mm/dd").parse(sDate1);  
   int  today =date1.getDate();
  int thisMonth= date1.getMonth();
  int thisYear= date1.getYear();
  
  String sDate2="2019/02/07";  
  Date date2=new SimpleDateFormat("yyyy/mm/dd").parse(sDate2); 
  int  refDate =date2.getDate();
  int refMonth= date2.getMonth();
  int refYear= date2.getYear();
 
	System.out.println(m1());
	
	}
	
	public static int[] m1() {
		
		int[] j = null;
		
		for (int i=1;i<=4;i++) {
			
			j[i]=i;
			
		}
		
	return j;
	}

}
