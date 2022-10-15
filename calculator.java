import java.util.*;
class calculator
{
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        
        int c=1,choice;
        while(c!=0)
        {   System.out.println("Enter two numbers to apply basic calculations on:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Enter 0 to Exit, 1 to Add, 2 to Subtract, 3 to Multiply...\n");
            choice =sc.nextInt();
            switch(choice)
            {
                case 0:
                c=0;
                break;
    
                case 1:
                System.out.println("Addition of the given numbers="+(a+b));
                break;

                case 2:
                System.out.println("Difference of the given numbers="+(a-b));
                break;

                case 3:
                System.out.println("Product of the given numbers="+(a*b));
                break;

            }
        } 
    }
}