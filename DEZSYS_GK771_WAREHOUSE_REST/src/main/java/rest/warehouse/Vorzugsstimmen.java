package rest.warehouse;

public class Vorzugsstimmen
{
    private int listennumber;
    private String name;
    private int votes;

    public Vorzugsstimmen(int listennumber, String name, int votes)
    {
        this.listennumber = listennumber;
        this.name = name;
        this.votes = votes;
    }

    public int getListennumber() {
        return listennumber;
    }

    public void setListennumber(int listennumber) {
        this.listennumber = listennumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
}
