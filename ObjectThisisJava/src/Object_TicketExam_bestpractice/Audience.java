package Object_TicketExam_bestpractice;

public class Audience {
    Bag bag;
    Ticket ticket = null;
    public Audience(Bag bag){
        this.bag = bag;
    }
    public int buy(Ticket ticket){
        return bag.hold(ticket);
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