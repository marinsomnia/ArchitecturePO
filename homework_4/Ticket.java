package homework_4;

import java.util.Date;

// Класс, представляющий билет
class Ticket {
    private long id;
    private long routeNumber; // Номер маршрута
    private double price;  // цена
    private boolean isValid; // Валидность билета
    private Date date; //  дата


    public Ticket( long id, long routeNumber, double price, boolean isValid, Date date) {
        this.id = id;
        this.routeNumber = routeNumber;
        this.price = price;
        this.isValid = isValid;
        this.date = date;
        InvariantChecker.checkTicketInvariant(this);
        
    }

    public long getRouteNumber() {
        return this.routeNumber;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean getIsValid() {
        return this.isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }
    public Date getDate() {
        return this.date;
    }
    public long getId() {
        return this.id;
    }
}