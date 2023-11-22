public class cont {
public static void main(String[] args) {
 System.out.println("Odd numbers btn 1 to 10 (skipping even numbers) :");
 for (int n=1; n<=10; n++) {
 if (n%2==0) {
 continue;
}
 System.out.println(n);
}
}
}