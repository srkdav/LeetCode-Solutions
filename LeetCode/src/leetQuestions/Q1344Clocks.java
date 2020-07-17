package leetQuestions;

public class Q1344Clocks {

	public static void angleClock(int hour,int minutes) {
		double per_hour = 30;
		double per_minute=6;
		double minute_angle = minutes * per_minute;
		double hour_angle = hour * per_hour;
		if(hour_angle>=360) {
			hour_angle=hour_angle-360;
		}
		if(minutes!=0) {
			double adjusted_angle = ((double)minutes/60)*per_hour;
			hour_angle=hour_angle + adjusted_angle;
		}
		double ans = Math.abs(hour_angle-minute_angle);
		System.out.println(Math.min(ans, 360-ans));
		
	}
	public static void main(String[] args) {
//		System.out.println(((double)30/60)*60);
		angleClock(1, 57);
	}

}
