public class Main {
    public static void main(String[] args) {
        Example ex = new Example();
        ex.Weather("Sunny");
        ex.SwitchCaseWeather();
    }
}

class Example {
    public void Weather(String myDay) {
        // 1st condition
        if (myDay == "Sunny") {
            // Decision
            System.out.println("Read in the Library");
        }
        // 2nd condition
        else if (myDay == "Raining") {
            //decision
            System.out.println("Read at Home");
        }
        // 3rd condition
        else if (myDay == "Cloudy") {
            // Decision
            System.out.println("Read in the Garden");
        } else {
            // Default Decision
            System.out.println("Get some Sleep");
        }
    }

    public void SwitchCaseWeather() {
        int myDay = 4; // setting the value to test
        switch (myDay) {
            case 1:
                System.out.println("Read in the Library");
                break;
            case 2:
                System.out.println("Read at Home");
                break;
            case 3:
                System.out.println("Read in the Garden");
                break;
            default:
                System.out.println("Get some Sleep");
                break;
        }
    }
}