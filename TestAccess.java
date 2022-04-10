public class TestAccess {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getFirstName());

        int loopCount = 1;
        while (loopCount < 6) {
            System.out.println("WhileLoopCount = " + loopCount);
            loopCount++;
        }
        for (int val = 1; val < 6; ++val){
            System.out.println("val = " + val);
        }
        int temp = 88;
        if (temp > 65){
            System.out.println("Please turn on the AC");
        } else {
            System.out.println("No need for the AC");
        }
        int year = 1;
        switch (year){
            case 1:
                System.out.println("Freshman");
                break;
            case 2:
                System.out.println("Sophmore");
                break;
            case 3:
                System.out.println("Junior");
                break;
            case 4:
                System.out.println("Senior");
                break;
        }
    }
}
