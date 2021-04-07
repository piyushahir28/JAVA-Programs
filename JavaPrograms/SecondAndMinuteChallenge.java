public class SecondAndMinuteChallenge{
	public static void main(String[] args) {
		int min=65,sec=45;
		//getDurationString(sec);
		getDurationString(min,sec);
	}
	public static int getDurationString(int min, int sec) {
		if (min>=0 && sec>=0 && sec<=59) {
			int hour,minute,second;
			hour = min/60;
			minute = min%60;
			second = sec;
			System.out.println(" "+hour+"h "+minute+"m "+second+"s ");
			return 0;
		}else{
			System.out.println("Invalid Value");
			return -1;
		}
	}
	/*public static int getDurationString(int sec){
		if(sec>=0){
			int local = sec/60;
			min = min + local;
			sec = sec%60;
			getDurationString(min,sec);
			return 0;
		}else{
			System.out.println("Invalid Value");
			return -1;
		}
	}*/
}