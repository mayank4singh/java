import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        //this is question twenty three
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer: ");
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println(+a + " is even ");
        }
        else{
            System.out.println(+a + " is odd ");
        }
    }
}
