package src;
import java.util.Scanner;

public class Main {
    // //java 2-1
    // public static double digui(double up, int count) {
    // if (count == 1)
    // return up / (1 + up);
    // else
    // return up / (count + digui(up, count - 1));
    // }

    // //java 2-5
    // public static long sumall(int modnum,int limit_max){
    // int times=limit_max/modnum;
    // if(limit_max%modnum==0) times--;
    // long resultlong = (modnum+modnum*times)*times/2;
    // return resultlong;
    // }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // java 2-1
        // double x = input.nextDouble();
        // // String str = "0";
        // int num = input.nextInt();
        // double result = x;
        // for(int i=0;i<=num-1;i++)
        // result=x/(i+1+result);
        // // double result = digui(x, num);
        // // str = String.format("%.2f", result);
        // System.out.printf("%.2f\n",result);

        // // java 2-2
        // char[] match_sol = new char[200000],stakcch=new char[200000];
        // String str= input.nextLine();
        // int cnt=-1;
        // String strout="false";
        // stakcch[0]=0;
        // match_sol=str.toCharArray();
        // for(int i=0;i<str.length();i++){
        // if(cnt==-1){
        // stakcch[++cnt]=match_sol[i];
        // continue;
        // }
        // if(match_sol[i]=='{'||match_sol[i]=='('||match_sol[i]=='[')
        // stakcch[++cnt]=match_sol[i];
        // if(match_sol[i]==')'){
        // if(stakcch[cnt]=='(') cnt--;
        // else stakcch[++cnt]=match_sol[i];
        // }
        // if(match_sol[i]==']'){
        // if(stakcch[cnt]=='[') cnt--;
        // else stakcch[++cnt]=match_sol[i];
        // }
        // if(match_sol[i]=='}'){
        // if(stakcch[cnt]=='{') cnt--;
        // else stakcch[++cnt]=match_sol[i];
        // }
        // }
        // if(cnt==-1) strout="true";
        // System.out.println(strout);

        // // java 2-3
        // long num = input.nextLong();
        // // double n =Math.pow(num,1.0/3.0);
        // long result = (long) Math.cbrt(num);
        // // System.out.println(df.format(result));
        // if (result == 2097152)
        // result--;
        // long jg = result * result * result;
        // if(jg>num) result--;
        // System.out.println((long) result);

        // //java 2-4
        // long a=input.nextInt(),b=input.nextInt(),p=input.nextInt(),ans=1;
        // long basenum=a,pointnum=b,modnum=p;
        // a%=p;
        // while(b!=0)
        // {
        // if(b%2==1) ans=(ans*a)%p;
        // b/=2;
        // a=(a*a)%p;
        // }
        // System.out.printf("%d^%d mod %d=%d\n",basenum,pointnum,modnum,ans);

        // //java 2-5
        // int n=input.nextInt();
        // long result = sumall(3,n)+sumall(5, n)-sumall(15, n);
        // System.out.println(result);
        // // System.out.println(sumall(5,n));
        // // System.out.println(sumall(3,n));
        input.close();
    }
}