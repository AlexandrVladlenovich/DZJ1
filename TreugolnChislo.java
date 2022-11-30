import java.util.Scanner;
public class TreugolnChislo {
class GFG {
    static void triangular_series(int n)
{
    for (int i = 1; i <= n; i++)
    System.out.printf("%d ", i*(i+1)/2);
}
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    System.out.print("Введите число: ");
    int n = in.nextInt();
    triangular_series(n);
    System.out.println();
}
}
}