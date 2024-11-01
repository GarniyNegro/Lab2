import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Додамо кілька заходів
        Event event1 = new Event(1, "Symphony Orchestra", "2024-11-15", 101, 500);
        Event event2 = new Event(2, "Chamber Music Night", "2024-12-01", 102, 300);
        Event event3 = new Event(3, "Jazz Evening", "2024-10-20", 103, 200);
        Event event4 = new Event(4, "Piano Concert", "2024-11-05", 101, 150);
        Event event5 = new Event(5, "Classical Ballet", "2024-12-10", 102, 400);

        Room room1 = new Room(101, 500);
        Room room2 = new Room(102, 300);
        Room room3 = new Room(103, 200);

        EventService eventService = new EventService(List.of(event1, event2, event3, event4, event5));

        System.out.println("Events sorted by seats:");
        List<Event> sortedBySeats = eventService.sortEventsBySeats();
        sortedBySeats.forEach(System.out::println);

        System.out.println("\nFind event by ID 1:");
        Event eventById = eventService.findEventById(1);
        System.out.println(eventById);

        System.out.println("\nEvents sorted by nearest date:");
        List<Event> sortedByDate = eventService.sortEventsByDate();
        sortedByDate.forEach(System.out::println);
    }
}
