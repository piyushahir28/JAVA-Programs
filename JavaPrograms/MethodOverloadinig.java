public class MethodOverloading{
	public static void public static void main(String[] args) {
		cal(6,0);
	}
	public static void cal(double inches){
		boolean val = (inches>=0)?true:false;
		if (!val) {
			return = -1;
		}
	}
	public static double cal(double feet, double inches){
		if(feet>=0 && inches>=0 && inches<=12){
			double Cent = ((feet*30.48)+(inches*2.54));
			System.out.println("Centimeters : "+cent);
			return cent;
		}else{
			return -1;
		}
	}	
}