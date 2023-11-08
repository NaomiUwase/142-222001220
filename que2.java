interface Weather {
    void describeWeather();
}

class BasicWeather implements Weather {
    private String condition;
    private int temperature;

    public BasicWeather(String condition, int temperature) {
        this.condition = condition;
        this.temperature = temperature;
    }

    public void describeWeather() {
        System.out.println("Basic Weather Condition: " + condition);
        System.out.println("Temperature (in Celsius): " + temperature);
    }
}

class RainyWeather extends BasicWeather {
    private int rainfall;

    public RainyWeather(String condition, int temperature, int rainfall) {
        super(condition, temperature);
        this.rainfall = rainfall;
    }

    @Override
    public void describeWeather() {
        super.describeWeather();
        System.out.println("Rainfall (in mm): " + rainfall);
    }
}

class SunnyWeather extends BasicWeather {
    private int uvIndex;

    public SunnyWeather(String condition, int temperature, int uvIndex) {
        super(condition, temperature);
        this.uvIndex = uvIndex;
    }

    @Override
    public void describeWeather() {
        super.describeWeather();
        System.out.println("UV Index: " + uvIndex);
    }
}

class WeatherDemo {
    public static void main(String[] args) {
        Weather basicWeather = new BasicWeather("Partly Cloudy", 25);
        Weather rainyWeather = new RainyWeather("Light Rain", 18, 5);
        Weather sunnyWeather = new SunnyWeather("Sunny", 30, 8);

        basicWeather.describeWeather();
        System.out.println();
        rainyWeather.describeWeather();
        System.out.println();
        sunnyWeather.describeWeather();
    }
}
