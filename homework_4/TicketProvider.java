package homework_4;



// Класс для предоставления билетов
public class TicketProvider {
    private TicketRepo ticketRepo; 

    public TicketProvider(TicketRepo ticketRepo) {
        this.ticketRepo = ticketRepo;
    }

    public boolean getTicket(long ticketId) {
        return ticketRepo.isTicketAvailable(ticketId); // используем метод репозитория
    }

    public boolean updateTicketStatus(Ticket ticket) {
        if (ticket == null) {
            throw new IllegalArgumentException("Ticket cannot be null");
        }

        // Проверим, есть ли такой билет в репозитории и является ли он действительным
        boolean isAvailable = ticketRepo.isTicketAvailable(ticket.getId());
        
        if (!isAvailable) {
            // Если билета нет в репозитории или он уже недействителен, выбрасываем исключение
            throw new RuntimeException("Ticket is either not found or already invalid");
        }

        // Обновляем статус билета. В данном случае, делаем его недействительным.
        ticket.setIsValid(false);

        // Возвращаем true, указывая на то, что статус успешно обновлен
        return true;
    }
}