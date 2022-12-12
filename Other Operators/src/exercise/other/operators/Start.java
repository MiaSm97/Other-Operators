package exercise.other.operators;

public class Start {
    public static void main(String[] args) {

        int a = 15;
        System.out.println(a);
        System.out.println(a += 5);
        System.out.println(a -= 4);

        int b = a;
        System.out.println(b ++);

        if(b % 2 == 0){
            System.out.println(" int b is even");
        }else{
            System.out.println("int b is odd");
        }


        if((b * (b +1)) % 3 == 0){
            System.out.println("int b is a multiple of 3");
        }else{
            System.out.println("int b isn't a multiple of 3");
        }

    }
}
   /* Define a testing class where you:

        define an int variable called a and initialise it with the value 15
        add 5 to a without repeating the a variable (e.g. a = a + 5 is not accepted)
        then subtract 4 to a without repeating the a variable
        assign the value of a to int b and increment b by one without using a or int b = b + 1
        check and prints if both the following statements are true:
        statement 1: check if b is an odd number
        statement 2: check if the result of (b multiplied for b + 1) is a multiple of 3*/