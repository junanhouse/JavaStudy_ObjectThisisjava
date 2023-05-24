package Object_TicketExam;

class TicketSeller {
    int balance;
    TicketOffice ticketOffice;

    public void calcBalance(){
        ticketOffice.calc(balance);
        this.balance = 0;
    }
    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
        this.balance = balance;
    }

    public void sell(Audience audience){
        if(audience.payInvitation() != null){
            ticketOffice.setInvitation(audience.payInvitation());
            audience.removeInvitation();
            audience.setTicket(ticketOffice.getTicket());
            ticketOffice.removeTicket();
        }
        else if (audience.payMoney(ticketOffice.getTicket().getPrice()) != 0) {
            this.balance += ticketOffice.getTicket().getPrice();
            audience.setTicket(ticketOffice.getTicket());
            ticketOffice.removeTicket();
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
}

