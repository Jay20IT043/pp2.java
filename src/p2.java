import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String num[]=new String[n];
        for(int i=0;i<n;i++)
        {
            num[i]=sc.next();
        }

        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<num[i].length();j++)
            {
                sum=sum + Integer.parseInt(String.valueOf(num[i].charAt(j)));
            }
            System.out.println(sum);
        }
    }
}
