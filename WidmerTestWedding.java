import java.time.LocalDate;

public class WidmerTestWedding {
    public static void main(String[] args) {
        WidmerPerson bride1 = new WidmerPerson("Mary","Smith",LocalDate.of(1996,1,1));
        WidmerPerson groom1 = new WidmerPerson("John","Doe",LocalDate.of(1995,6,1));
        WidmerCouple c1 = new WidmerCouple(bride1,groom1);
        WidmerWedding w1 = new WidmerWedding(LocalDate.of(2022,5,19),"Willmar",c1);
        displayWeddingInfo(w1);

        WidmerPerson bride2 = new WidmerPerson("Sue","Jones",LocalDate.of(1977,1,1));
        WidmerPerson groom2 = new WidmerPerson("Jim","Franklin",LocalDate.of(1976,4,1));
        WidmerCouple c2 = new WidmerCouple(bride2,groom2);
        WidmerWedding w2 = new WidmerWedding(LocalDate.of(2022,4,12),"Hutch",c2);
        displayWeddingInfo(w2);
    }
    public static void displayWeddingInfo(WidmerWedding w){
        System.out.println(w.getbrideAndGroomName());
        System.out.println(w.getWeddingDate());
        System.out.println(w.getLocation());
    }
}
