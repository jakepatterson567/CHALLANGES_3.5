public class TeenChecker {
    public static void hasTeen(int teen1, int teen2, int teen3){
        if ((teen1>13 && teen1<19) || (teen2>13 && teen2<19) || (teen3>13 && teen3<19)){
            System.out.println(Boolean.TRUE);
            return;
        }
        else
            System.out.println(Boolean.FALSE);
        }
       public static void isTeen(int teen4){
        if (teen4>13 && teen4<19 ){
            System.out.println(Boolean.TRUE);
        }
        else
            System.out.println(Boolean.FALSE);
       }

}
