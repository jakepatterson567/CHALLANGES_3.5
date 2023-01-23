public class MegaBytesConverter {
    static void printMegaBytesAndKiloBytes (int kiloBytes){
        int megabyte;
        int remaining = kiloBytes % 1024;
        if (kiloBytes<0){
            System.out.println("invalid");
        } else{
            System.out.print(megabyte=(kiloBytes/1024));
            System.out.print(" MB ");
            System.out.print("and ");
            System.out.print( kiloBytes%1024);
            System.out.print(" KB ");

        }

    }

    }















