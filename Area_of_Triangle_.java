import java.util.*;
public class Test 
{ 
    static float findArea(float a, float b, float c) 
    { 
        if (a < 0 || b < 0 || c <0 || (a+b <= c) || 
            a+c <=b || b+c <=a) 
        { 
            System.out.println("Not a valid triangle"); 
            System.exit(0); 
        } 
        float s = (a+b+c)/2; 
        return (float)Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
    } 
    public static void main(String[] args)  
    {
        Scanner sc=new Scanner(System.in);
        float a = sc.nextFloat(); 
        float b = sc.nextFloat();
        float c = sc.nextFloat(); 
      
        System.out.printf("%.2f",findArea(a, b, c)); 
    } 
}