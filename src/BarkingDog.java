public class BarkingDog {
   public static void shouldWakeUp(boolean barking, double hourOfDay) {
      if ((barking == true) && hourOfDay < 8 || hourOfDay < 22) {
         System.out.println("wake up");
      } else if ((hourOfDay < 0) || hourOfDay > 23) {
         System.out.println("false");
      } else {
         System.out.println("false");


      }
   }
}