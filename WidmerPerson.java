import java.time.LocalDate;

public class WidmerPerson {
    private String first;
    private String last;
    private LocalDate birthdate;

    public WidmerPerson(String first, String last, LocalDate birthdate) {
        this.first = first;
        this.last = last;
        this.birthdate = birthdate;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
}
