import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio03{
    public static void main(String[] args) throws IOException {
        int opcion = (int)(Math.random()*5);

        switch (opcion) {
            case 0:
                throw new NumberFormatException();
            case 1:
                throw new IOException();
            case 2:
                throw new FileNotFoundException();
            case 3:
                throw new IndexOutOfBoundsException();
            case 4:
                throw new ArithmeticException();
            default:
                break;
        }
    }
}
