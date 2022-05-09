public class ArrayPlay {
    public static void main(String[] args) {
//        double salesFigures[];
//        salesFigures = new double[20];
//        salesFigures[0] = 45667;
//        salesFigures[2] = 325454
        double[] salesFigures = {123423,23454,2462,76575,4564};
        for(int i = 0; i < 5; ++i){
            System.out.println(salesFigures[i]);
        }

        System.out.println(salesFigures[0]);
        System.out.println(salesFigures[1]);
        System.out.println(salesFigures[2]);

        boolean[] isConvicted;
        isConvicted = new boolean[10];
        System.out.println(isConvicted[2]);
    }
}
