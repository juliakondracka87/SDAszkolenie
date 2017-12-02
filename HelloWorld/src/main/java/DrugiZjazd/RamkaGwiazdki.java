package DrugiZjazd;

public class RamkaGwiazdki {

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                if((j==1 || j==2) && (i==1 || i==2 || i==3)){
                    System.out.print(" ");
                }
                else {
                System.out.print("*");
            }

            }
            System.out.println();}
    }



}