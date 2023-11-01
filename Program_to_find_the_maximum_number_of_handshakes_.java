import java.util.*;
public class GFG {
    static int maxHandshake(int n)
    {
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(maxHandshake(n));
    }
}
 