package model;

public record ContactData(String firstN, String middleN, String lastN) {

    public ContactData() {
        this("", "", "");
    }
    public ContactData withfirstN(String firstN){
        return new ContactData(firstN, this.middleN, this.lastN);
    }

    public ContactData withmiddleN(String middleN)
    {return new ContactData( this.firstN, middleN, this.lastN);
    }

    public ContactData witlastN(String lastN){
        return new ContactData( this.firstN, this.middleN, lastN);
    }
}
