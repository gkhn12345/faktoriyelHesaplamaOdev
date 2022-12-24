import java.util.Scanner;

public class faktoriyelHesaplamaOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int faktoriyel = 1;
        System.out.println("Faktöriyel sayısı :");
        int i = input.nextInt();

        while (i>0){
            faktoriyel*=i;
            i--;

        }
        System.out.println("Faktöriyel:"+faktoriyel);

    }
}
