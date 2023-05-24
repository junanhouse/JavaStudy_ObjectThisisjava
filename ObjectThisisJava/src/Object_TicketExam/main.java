package Object_TicketExam;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Bag bag1 = new Bag(10000);
        Invitation invitation = new Invitation();
        invitation.when = LocalDateTime.now();
        Bag bag2 = new Bag(6000, invitation);
        Audience audience1 = new Audience(bag1);
        Audience audience2 = new Audience(bag2);

        List<Ticket> tickets = new ArrayList<Ticket>();
        for(int i = 0; i < 50; i++){
            Ticket ticket = new Ticket();
            ticket.setPrice(5000);
            tickets.add(ticket);
        }
        TicketOffice ticketOffice = new TicketOffice(0, tickets);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);

        ticketSeller.sell(audience1);
        ticketSeller.sell(audience2);
        ticketSeller.calcBalance();
        System.out.println(ticketOffice.getAmount());
        System.out.println(audience1.getTicket().getPrice());
        System.out.println(audience2.getTicket().getPrice());
        System.out.println(audience2.bag.getMoney());

    }
}
