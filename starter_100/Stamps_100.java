import java.util.Scanner;

class Stamps_100 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            sc.nextLine();
            String str=sc.nextLine();
            
            int pos=-1;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='1'){
                    pos=i;
                    break;
                }
            }

            if(pos==-1 || pos== n-1 || pos== n-2)
            {
                System.out.println(str);
            }
            else
            {
                StringBuilder sb=new StringBuilder();
                for(int i=0;i<pos;i++)
                {
                    sb.append('0');
                }
                sb.append('1');
                for(int i=pos+1;i<n;i++)
                {
                    sb.append('0');
                }
                System.out.println(sb);
            }
            
        }
    }
}