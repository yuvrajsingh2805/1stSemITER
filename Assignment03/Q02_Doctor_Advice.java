import java.util.Scanner;
public class Q02_Doctor_Advice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of water drank completed: ");
        int water = sc.nextInt();
        if (water>=5000){
            System.out.println("Yes, Alice is following doctor's advice");
        }
        else {
            System.out.println("No, Alice is not following doctor's advice");
        }
    }
}
