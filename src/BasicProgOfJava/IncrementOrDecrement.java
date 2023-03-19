package BasicProgOfJava;

public class IncrementOrDecrement {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;

        String name = "Neeraj tiwari";

        System.out.println("Old value of x is : " + x); // x ki old value
        System.out.println("Old value of x is : " + y); // y ki old value

        x = ++x; // will get new vlaue   1 + x
        y = ++y; // will get new vlaue   1 + y

        System.out.println("New value of x is : " + x); // will get new vlaue
        System.out.println("New value of y is : " +  y); // will get new vlaue


        x++;
        y++;
        System.out.println("New value of x is : " + x); // x ki new value x + 1
        System.out.println("New value of y is : " +  y); // y ki new value y + 1

    }
}
