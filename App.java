interface Activity {
    void describeActivity();
}

class IndoorActivity implements Activity {
    private String name;
    private int duration;

    public IndoorActivity(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public void describeActivity() {
        System.out.println("Indoor Activity: " + name);
        System.out.println("Duration (in minutes): " + duration);
    }
}

class OutdoorActivity implements Activity {
    private String name;
    private int duration;

    public OutdoorActivity(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public void describeActivity() {
        System.out.println("Outdoor Activity: " + name);
        System.out.println("Duration (in minutes): " + duration);
    }
}

class Yoga extends IndoorActivity {
    private String style;

    public Yoga(String name, int duration, String style) {
        super(name, duration);
        this.style = style;
    }

    @Override
    public void describeActivity() {
        super.describeActivity();
        System.out.println("Yoga Style: " + style);
    }
}

class Hiking extends OutdoorActivity {
    private String location;

    public Hiking(String name, int duration, String location) {
        super(name, duration);
        this.location = location;
    }

    @Override
    public void describeActivity() {
        super.describeActivity();
        System.out.println("Hiking Location: " + location);
    }
}

public class ActivityDemo {
    public static void main(String[] args) {
        Activity indoorActivity = new IndoorActivity("Reading", 60);
        Activity outdoorActivity = new OutdoorActivity("Running", 45);
        Activity yoga = new Yoga("Yoga", 90, "Vinyasa");
        Activity hiking = new Hiking("Hiking", 120, "Mountain Trails");

        indoorActivity.describeActivity();
        System.out.println();
        outdoorActivity.describeActivity();
        System.out.println();
        yoga.describeActivity();
        System.out.println();
        hiking.describeActivity();
    }
}
