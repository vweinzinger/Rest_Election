package rest.warehouse;

import java.util.List;

public class Party
{
    private String partyID;
    private int amountVotes;
    private List<Vorzugsstimmen> vorzugsstimmen;

    public Party(String partyID, int amountVotes, List<Vorzugsstimmen> vorzugsstimmen)
    {
        this.partyID = partyID;
        this.amountVotes = amountVotes;
        this.vorzugsstimmen = vorzugsstimmen;
    }

    public String getPartyID() {
        return partyID;
    }

    public void setPartyID(String partyID) {
        this.partyID = partyID;
    }

    public int getAmountVotes() {
        return amountVotes;
    }

    public void setAmountVotes(int amountVotes) {
        this.amountVotes = amountVotes;
    }

    public List<Vorzugsstimmen> getVorzugsstimmen() {
        return vorzugsstimmen;
    }

    public void setVorzugsstimmen(List<Vorzugsstimmen> vorzugsstimmen) {
        this.vorzugsstimmen = vorzugsstimmen;
    }
}
