public class overload{
	public static void main(String[] args) {
		cal(6,0);
	}
	public static int cal(double inches){
		boolean val = (inches>=0)?true:false;
		if (!val) {
			return -1;
		}
		return 0;
	}
	public static double cal(double feet, double inches){
		if(feet>=0 && inches>=0 && inches<=12){
			double cent = ((feet*30.48)+(inches*2.54));
			System.out.println("Centimeters : "+cent);
			return cent;
		}else{
			System.out.println("Please Enter Valid Values");
			return -1;
		}
	}	
}