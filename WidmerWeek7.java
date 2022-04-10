public class WidmerWeek7 {
    int x = 99999;
    int y;
    String fName = "John";
    String lName = "Doe";
    int age = 24;

    public void squareNbr(int nbr){
        System.out.println(nbr*nbr);
        System.out.println("overload1");
    }
    public void squareNbr(float nbr){
        System.out.println(nbr*nbr);
        System.out.println("overload2");
    }
    public void squareNbr(int nbr1, int nbr2){
        System.out.println(nbr1*nbr2);
        System.out.println("overload3");
    }
}
