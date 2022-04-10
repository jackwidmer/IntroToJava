public class TestWidmerCircle {
    public static void main(String[] args) {
        WidmerCircle c1 = new WidmerCircle();
        WidmerCircle c2 = new WidmerCircle();
        WidmerCircle c3 = new WidmerCircle();

        c1.setRadius(2);
        c2.setRadius(6);

        System.out.println("Radius of c1 is: " + c1.getRadius());
        System.out.println("Radius of c2 is: " + c2.getRadius());
        System.out.println("Radius of c3 is: " + c3.getRadius());
    }
}
