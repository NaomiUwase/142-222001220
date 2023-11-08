interface Activity {
    void describeActivity();
}

class ActivityBase implements Activity {
    private String name;

    public ActivityBase(String name) {
        this.name = name;
    }

    public void describeActivity() {
        System.out.println("Activity: " + name);
    }
}

class IndoorActivity extends ActivityBase {
    private int participants;

    public IndoorActivity(String name, int participants) {
        super(name);
        this.participants = participants;
    }

    @Override
    public void describeActivity() {
        super.describeActivity();
        System.out.println("Type: Indoor");
        System.out.println("Number of Participants: " + participants);
    }
}

class OutdoorActivity extends ActivityBase {
    private String location;

    public OutdoorActivity(String name, String location) {
        super(name);
        this.location = location;
    }

    @Override
    public void describeActivity() {
        super.describeActivity();
        System.out.println("Type: Outdoor");
        System.out.println("Location: " + location);
    }
}

class ActivityDemo {
    public static void main(String[] args) {
        Activity indoorActivity = new IndoorActivity("Board Games", 4);
        Activity outdoorActivity = new OutdoorActivity("Hiking", "Mountain Trail");

        indoorActivity.describeActivity();
        outdoorActivity.describeActivity();
    }
}
