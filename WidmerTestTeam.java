public class WidmerTestTeam {
    public static void main(String[] args) {
    WidmerTeam hutch = new WidmerTeam("Hutchinson","Hockey","Tigers");
    WidmerTeam willmar = new WidmerTeam("Willmar","Basketball","Cardinals");
    WidmerTeam litch = new WidmerTeam("Litchfield", "baseball", "dragons");

        System.out.println(hutch.SchoolName + hutch.sport + hutch.teamName + hutch.MOTTO);
        System.out.println(willmar.SchoolName + willmar.sport + willmar.teamName + willmar.MOTTO);
        System.out.println(litch.SchoolName + litch.sport + litch.teamName + litch.MOTTO);
    }
}
