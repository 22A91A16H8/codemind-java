import java.util.*; 
public class GFG  
{ 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i, j;
        int n=sc.nextInt();
        for (i = n; i >= 1; i--)  
        { 
            for (j = 1; j <= i; j++)  
            { 
                System.out.printf("%c ", 'A' - 1 + i); 
            } 
            System.out.printf("
"); 
        }
    } 
} 