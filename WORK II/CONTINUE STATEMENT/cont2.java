public class cont2 {
public static void main(String[] args) {
 System.out.println("Even numbers btn 1 to 10 (skipping odd numbers) :");
 for (int n=1; n<=10; n++) {
 if (n%2==1) {
 continue;
}
 System.out.println(n);
}
}
}