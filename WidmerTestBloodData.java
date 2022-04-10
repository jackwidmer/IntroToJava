public class WidmerTestBloodData {
    public static void main(String[] args) {
        WidmerBloodData joe = new WidmerBloodData();
        WidmerBloodData sue = new WidmerBloodData("A",'-');
        System.out.println(joe.bloodType);
        System.out.println(joe.rh);

        System.out.println(sue.bloodType);
        System.out.println(sue.rh);

        joe.setBloodType("QQQ");
        sue.setRh('*');

        System.out.println("Joe's bloodtype is " + joe.getBloodType());
        System.out.println("Sue's rh is " + sue.getRh());
    }
}
