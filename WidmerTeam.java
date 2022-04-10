public class WidmerTeam {
    String SchoolName;
    String sport;
    String teamName;
    public static final String MOTTO = "Sportsmanship!";

    public WidmerTeam(String schoolName, String sport, String teamName) {
        SchoolName = schoolName;
        this.sport = sport;
        this.teamName = teamName;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public String getSport() {
        return sport;
    }

    public String getTeamName() {
        return teamName;
    }
}
