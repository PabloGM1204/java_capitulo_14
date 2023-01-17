import java.util.Scanner;
public class Ejercicio01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i<7; i++){
            int n = 0;
            boolean bien = false;
            do{
                try{
                    System.out.print("Dime números: ");
                    n = Integer.parseInt(sc.nextLine());
                    bien = true;
                }catch(Exception e){
                    System.out.print("Debe escribir un número entero.");
                    System.out.println("Intentalo de nuevo");
                }
            }while(!bien);
            if(max<n)
                max = n;
        }
        System.out.println("El número mas grande es: "+max);
        sc.close();
    }
}