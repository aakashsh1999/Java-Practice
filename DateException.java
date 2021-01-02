//Program to Changing the date format
import java.util.*;
import java.text.SimpleDateFormat;

class SampleException2{
	static void dateFormat(String inputdate)
			{		
			try{
				SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyy");
				Date date=sdf.parse(inputdate);
				SimpleDateFormat odf=new SimpleDateFormat("yyyy/mm/dd");;
				String output=odf.format(date);
				System.out.println("After changing date format to yyyy/mm/ddd" +output);
			}
			catch(java.text.ParseException e)
			{
			System.out.println("Invalid Date Format");
			}

			}
			public static void main(String args[])
					{
							Scanner sc=new Scanner(System.in);
							System.out.println("Enter date in format dd//mm//yyyy");
							String date=sc.nextLine();
							dateFormat(date);
					}
}