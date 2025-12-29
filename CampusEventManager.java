import java.util.Scanner;

class Event {
    String name;
    String date;
    String type;

    Event(String name, String date, String type) {
        this.name = name;
        this.date = date;
        this.type = type;
    }
}

public class CampusEventManager {
    static Event[] events = new Event[10];
    static int count = 0;

    public static void addEvent(Scanner sc) {
        if (count >= events.length) {
            System.out.println("Event list full!");
            return;
        }
        System.out.print("Enter event name: ");
        String name = sc.nextLine();
        System.out.print("Enter event date: ");
        String date = sc.nextLine();
        System.out.print("Enter event type (Technical/Cultural): ");
        String type = sc.nextLine();

        events[count++] = new Event(name, date, type);
        System.out.println("Event added successfully!\n");
    }

    public static void viewEvents() {
        if (count == 0) {
            System.out.println("No events available.\n");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println("Event Name: " + events[i].name);
            System.out.println("Date: " + events[i].date);
            System.out.println("Type: " + events[i].type);
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addEvent(sc); break;
                case 2: viewEvents(); break;
                case 3: System.exit(0);
                default: System.out.println("Invalid choice\n");
            }
        }
    }
}
