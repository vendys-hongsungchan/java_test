package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student sung = new Student("sung", 5000);
        Student chan = new Student("chan", 10000);

        Bus bus100 = new Bus(100);
        sung.takeBus(bus100);
        sung.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway(2);
        chan.takeSubway(subwayGreen);
        chan.showInfo();
        subwayGreen.showInfo();
    }
}
