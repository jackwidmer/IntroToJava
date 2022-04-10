import java.time.LocalDate;

public class WidmerWedding {
    private LocalDate weddingDate;
    private String location;
    private String brideAndGroomName;

    public WidmerWedding(LocalDate weddingDate, String location, WidmerCouple brideAndGroomName) {
        this.weddingDate = weddingDate;
        this.location = location;
        this.brideAndGroomName = brideAndGroomName.getBride().getFirst() + " " +brideAndGroomName.getBride().getLast() + " Born " + brideAndGroomName.getBride().getBirthdate() + " and " + brideAndGroomName.getGroom().getFirst() + " " + brideAndGroomName.getGroom().getLast() + " Born " + brideAndGroomName.getGroom().getBirthdate();
    }

    public LocalDate getWeddingDate() {
        return weddingDate;
    }

    public String getLocation() {
        return location;
    }

    public String getbrideAndGroomName() {
        return brideAndGroomName;
    }
}
