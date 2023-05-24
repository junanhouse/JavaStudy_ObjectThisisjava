package Object_TicketExam;

public class Audience {
    Bag bag;
    Ticket ticket = null;
    public Audience(Bag bag){
        this.bag = bag;
    }
    public int payMoney(int price){
        if(bag.getMoney() > price){
            bag.setMoney(bag.getMoney() - price);
            return price;
        }
        else {
            return 0;
        }
    }
    public boolean hasTicket() {
            return this.ticket != null;
    }
    public Invitation payInvitation(){
        return bag.getInvitation();
    }

    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }
    public void removeInvitation(){
        bag.setInvitation(null);
    }
    public Ticket getTicket() { return this.ticket; }

}
