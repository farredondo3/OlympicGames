public class Baseball
{
    private int battingAvg;
    private String name;
    private int runs;

    public Baseball(String name, int battingAvg, int runs)
    {
        this.battingAvg = battingAvg;
        this.name = name;
        this.runs = runs;

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getBattingAvg()
    {
        return battingAvg;
    }

    public void setBattingAvg(int battingAvg)
    {
        this.battingAvg = battingAvg;
    }

    public int getRuns()
    {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }
}