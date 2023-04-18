public class Tennis
{
    private String name;
    private int serveSpeed;
    private int wins;
    private int losses;

    public Tennis(String name, int serveSpeed, int wins, int losses)
    {
        this.name = name;
        this.serveSpeed = serveSpeed;
        this.wins = wins;
        this.losses = losses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServeSpeed() {
        return serveSpeed;
    }

    public void setServeSpeed(int serveSpeed) {
        this.serveSpeed = serveSpeed;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }
}