public class Alarm {
    private String id;
    private String description;
    private String date;
    private String time;

    public Alarm(String id, String description, String date, String time) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.time = time;
    }

    public void run() {
        System.out.println("Alarm " + id + " berbunyi pada " + date + " jam " + time + "\n" + description + ".");
    }

    public void terminate() {
        System.out.println("Alarm " + id + " dimatikan.");
    }

    public void snooze() {
        System.out.println("Alarm " + id + " ditunda.");
    }

    public static void main(String[] args) {
        Alarm alarm1 = new Alarm("001", "Selamat Pagi", "2024-10-01", "06:30:00");

        alarm1.run();

        alarm1.snooze();

        alarm1.terminate();
    }
}
