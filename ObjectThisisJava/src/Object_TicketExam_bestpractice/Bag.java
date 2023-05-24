package Object_TicketExam_bestpractice;



public class Bag {
    private int money;
    private Invitation invitation;
    private Ticket ticket;
    public Bag(int money){
        this.money = money;
        this.invitation = null;
    }
    public Bag(int money, Invitation invitation){
        this.money = money;
        this.invitation = invitation;
    }
    public int hold(Ticket ticket){
        if (hasInvitation()){
            setTicket(ticket);
            return 0;
        } else if(this.money > ticket.getPrice()){
            setMoney(money - ticket.getPrice());
            return ticket.getPrice();
        } else {
            System.out.println("no money");
            return 0;
        }
    }
    public boolean hasInvitation(){
        return this.invitation != null;
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
    public void setTicket(Ticket ticket){ this.ticket = ticket; }
}