import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int a,b,c;

        for(int i=0;i<T;i++){
            a=s.nextInt();
            b=s.nextInt();
            c=1;

            for(int k=0;k<b;k++) c=(c*a)%10;
            if(c==0) c=10;
            System.out.println(c);
        }
        s.close();
    }
}