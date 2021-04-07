public class MethodChallenge{
   public static void main(String[] args){  
      display("Ram",1500);
      cal(1500);
      display("Shyam",900);
      cal(900);
      display("Piyush",400);
      cal(400);
      display("Rakesh",50);
      cal(50);   
   }
   public static void display(String name, int score){
      System.out.println("Name : "+name+"    Score is : "+score);
   }
   public static int cal(int score){
      if(score>1000)
         return 1;
      else if(score>500 && score<1000)
         return 2;
      else if(score>100 && score<500)
         return 3;
      else
         return 4;
   }
}
