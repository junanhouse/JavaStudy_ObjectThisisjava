package Object_TicketExam_bestpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private int amount;
    private List<Ticket> tickets = new ArrayList<>();
    private List<Invitation> invitations = new ArrayList<>();

    public TicketOffice(int amount, List<Ticket> tickets){
        this.amount = amount;
        this.tickets.addAll(tickets);
    }

    public void sellTo(Audience audience){
        plusAmount(audience.buy(getTicket()));
        removeTicket();
    }

    public void removeTicket(){
        tickets.remove(0);
    }
    public Ticket getTicket(){ return tickets.get(0); }
    public void plusAmount(int amount){ this.amount += amount; }
    public void setInvitation(Invitation...invitations){
        this.invitations.addAll(Arrays.asList(invitations));
    }


    // test전용
    public int getAmount() { return this.amount; }
}


