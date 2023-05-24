package Object_TicketExam;

public class Bag {
    private int money;
    private Invitation invitation;

    public Bag(int money){
        this.money = money;
        this.invitation = null;
    }
    public Bag(int money, Invitation invitation){
        this.money = money;
        this.invitation = invitation;
    }
    public int getMoney(){
        return this.money;
    }
    public Invitation getInvitation(){ return this.invitation; }

    public void setMoney(int money){
        this.money = money;
    }
    public void setInvitation(Invitation invitation){
        this.invitation = invitation;
    }

}
