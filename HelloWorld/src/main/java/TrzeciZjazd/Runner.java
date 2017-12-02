package TrzeciZjazd;

import java.io.EOFException;

public class Runner {
    public static void main(String[] args) {
        /*try {
            Scanner in = new Scanner(new File("test.in"));
        } catch(FileNotFoundException ex) {
            System.out.println("File not found");
        }*/
        couseArrayIndexOutOfBoundEx();

        try {
            couseEOFException();
        } catch (EOFException ex) {
            //obsługa błędu
        }
    }

    public static void couseArrayIndexOutOfBoundEx() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();
    }

    public static void couseEOFException() throws EOFException {

    }
}




