package Object_TicketExam_bestpractice;

class TicketSeller {
    TicketOffice ticketOffice;


    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }

    public void sell(Audience audience){
       ticketOffice.sellTo(audience);
    }
}