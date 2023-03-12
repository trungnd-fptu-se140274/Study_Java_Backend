import ExampleClass.Program2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // showExample1
        Program1 pro1 = new Program1();
        pro1.showExample1();

        // showExample2
        Program2 pro2 = new Program2();
        pro2.showExample2();
    }
}

class Program1 {
    public void showExample1(){
        System.out.println("Example 1");
    }
}