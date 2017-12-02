package DrugiZjazd;

public class Choinka {
    public static void main(String[] args){

int podstawa = 4;
        for (int i = 0; i < podstawa; i++) {
            for (int j = 0; j < podstawa * 2; j++) {
                if (j < (podstawa - i) || j > (podstawa + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

//        for(int i = 0; i < 4; i++){//4 entery zrobi
//            for(int j = 0; j<7; j++){//7 znaków zrobi
//                if(){
//
//                }
//            }
//
//        }

    }
}
