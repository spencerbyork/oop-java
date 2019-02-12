public abstract class GenericPlayer
{
    // ---------------------
    // Game attributes
    // ---------------------
    protected String name;
    protected int numberOfWins;
    protected int numberOfLosses;
    protected int numberOfTies;
    protected int numberOfGamesPlayed;

    // Accessors: getName(), getNumberOfWins(), etc...


    // -------------------
    // abstract functions
    // -------------------
    public abstract double getWinPercentage();
    public abstract void printWinPercentage();
    public abstract double getLossPercentage();
    public abstract void printLossPercentage();




}
