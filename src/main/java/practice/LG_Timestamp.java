package practice;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LG_Timestamp {
	private static final SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static final SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);                      // 2021-03-24 16:34:26.666

        // method 2 - via Date
        Date date = new Date();
        Timestamp timestamp2 = new Timestamp(date.getTime());
        System.out.println(timestamp2);
        // 2021-03-24 16:34:26.666
                                                            // number of milliseconds since January 1, 1970, 00:00:00 GMT
     
        System.out.println(sdf3.format(timestamp)); 
        int month = timestamp2.getMonth();
       String dateValue = timestamp2.toString();
       System.out.println(dateValue);
       String[] split1= dateValue.split(" ");
       String[] splitDate = split1[0].split("-");
    
       System.out.println(split1[0]);
       String yearC =splitDate[0]; 
       System.out.println(yearC);
       
       String monC =splitDate[1]; 
       System.out.println(monC);
       
       String dateC =splitDate[2]; 
       System.out.println(dateC);
       
       String[] splitTime = split1[1].split(":");
       String hrC= splitTime[0];
       String minC = splitTime[1];
       System.out.println(hrC);
       System.out.println(minC);
       Calendar c = Calendar.getInstance();
       c.add(Calendar.DAY_OF_MONTH, 5);
       String newDate = sdf4.format(c.getTime());
       System.out.println(newDate); 
	}

}
