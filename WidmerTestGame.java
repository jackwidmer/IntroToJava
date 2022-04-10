public class WidmerTestGame {
    public static void main(String[] args) {
        WidmerTeam home = new WidmerTeam("litch","hockey","dragons");
        WidmerTeam away = new WidmerTeam("hutch","hockey","tigers");
        WidmerGame bigGame = new WidmerGame(home,away,"7PM");
        displayGame(bigGame);
    }
    public static void displayGame(WidmerGame game){
        System.out.println(game.time + " " + game.team1.teamName + " against " + game.team2.teamName + " in " + game.team1.sport);
    }
}
