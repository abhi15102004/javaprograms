import java.util.*;
class StringCompare
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your name: ");
        String nam= sc.nextLine();
        if(nam.equals("java"))
        {
            System.out.println("good choice");
        }
        else
        {
            System.out.println("you have entered"+nam);
        }
    }
}