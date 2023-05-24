package Object_TicketExam;

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

    public void calc(int balance){
        this.amount += balance;
    }
    public void removeTicket(){
        this.tickets.remove(0);
    }


    public Ticket getTicket(){
        return this.tickets.get(0);
    }
    public int getAmount(){
        return this.amount;
    }

    public void setInvitation(Invitation...invitations){
        this.invitations.addAll(Arrays.asList(invitations));
    }
}
