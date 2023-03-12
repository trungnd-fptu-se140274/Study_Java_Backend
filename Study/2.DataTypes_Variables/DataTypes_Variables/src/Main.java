public class Main {
    public static void main(String args[]) {
        // Data Types
        System.out.println("Data Types: ");
        byte x;
        int a = 270;
        double b = 128.128;
        System.out.println("int converted to byte");
        x = (byte) a;
        System.out.println("a and x " + a + " " + x);
        System.out.println("double converted to int");
        a = (int) b;
        System.out.println("b and a " + b + " " + a);
        System.out.println("\ndouble converted to byte");
        x = (byte)b;
        System.out.println("b and x " + b + " " + x);

        // Variables
        System.out.println("\nVariables: ");
        // Add 2 numbers
        System.out.println("Add 2 numbers: ");
        int a1 = 10;
        int b1 = 10;
        int c1 = a1 + b1;
        System.out.println(c1);

        // Widening
        System.out.println("\nWidening: ");
        int a2=10;
        float f=a;
        System.out.println(a2);
        System.out.println(f);


        // Narrowing (Typecasting)
        System.out.println("\nNarrowing (Typecasting): ");
        float f1 = 10.5f;
        //int a=f; //Compile time error
        int a3 = (int)f1;
        System.out.println(f1);
        System.out.println(a3);

        // Overflow
        System.out.println("\nOverflow: ");
        int a4 = 130;
        byte b4 = (byte)a4;
        System.out.println(a4);
        System.out.println(b4);

        // Adding Lower Type
        System.out.println("\nAdding Lower Type: ");
        byte a5 =10;
        byte b5 = 10;
        //byte c=a+b; //Compile Time Error: because a+b=20 will be int
        byte c5 = (byte) (a5+b5);
        System.out.println(c5);
    }
}