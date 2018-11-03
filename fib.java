import java.io.*;
public class fib {

    public static void main(String args[])throws IOException {
     	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
     	System.out.print("請輸入費氏數列項數n：");
     	int n=Integer.parseInt(buf.readLine());
     	System.out.println("費氏數列第 "+n+" 項數的值為"+fib(n));
    }
    
    public static long fib(int n){
        if(n==1 || n==2)
		return 1;
	else
		return fib(n-1)+fib(n-2); 
    }   
}
