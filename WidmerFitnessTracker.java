import java.time.LocalDate;
public class WidmerFitnessTracker {
    String activity;
    int minutes;
    LocalDate today = LocalDate.of(2022,1,1);

    public String getActivity() {
        return activity;
    }
    public int getMinutes(){
        return minutes;
    }
    public LocalDate getToday(){
        return today;
    }
    public WidmerFitnessTracker(){
        activity = "Running";
    }
}
