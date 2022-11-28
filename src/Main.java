import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                double length = Double.parseDouble( scanner.nextLine());
                double width = Double.parseDouble(scanner.nextLine());
                double height = Double.parseDouble(scanner.nextLine());
                Parallelepiped parallelepiped = new Parallelepiped(length,width,height);
                System.out.println(parallelepiped);
                parallelepiped.getSquare();
                parallelepiped.getVolume();

            }catch (ArithmeticException e){
                System.out.println(" Only number !");}
            catch (Exception e){
                System.out.println(" Bigger than null");
            }
        }
        }
    }