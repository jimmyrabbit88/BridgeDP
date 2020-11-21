public class TicketResource implements ItemResource{
    Ticket ticket;

    public TicketResource(Ticket ticket){
        this.ticket = ticket;
    }

    @Override
    public String providePicture() {
        return this.ticket.getPicUrl();
    }

    @Override
    public String provideTitle() {
        return this.ticket.getName();
    }

    @Override
    public String provideDescription() {
        return this.ticket.getNumber() + " tickets for " + this.ticket.getName() + " in " + this.ticket.getLocation();
    }

    @Override
    public String providePrice() {
        return this.ticket.getPrice();
    }
}
