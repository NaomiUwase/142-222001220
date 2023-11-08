interface WeatherCondition {
    void describeCondition();
}

class Weather implements WeatherCondition {
    private String conditionName;

    public Weather(String conditionName) {
        this.conditionName = conditionName;
    }

    public void describeCondition() {
        System.out.println("Weather Condition: " + conditionName);
    }
}

class Sunny extends Weather {
    public Sunny() {
        super("Sunny");
    }

    @Override
    public void describeCondition() {
        super.describeCondition();
        System.out.println("The sun is shining with clear skies.");
    }
}

class Rainy extends Weather {
    public Rainy() {
        super("Rainy");
    }

    @Override
    public void describeCondition() {
        super.describeCondition();
        System.out.println("It's raining, and the skies are overcast.");
    }
}

class Cloudy extends Weather {
    public Cloudy() {
        super("Cloudy");
    }

    @Override
    public void describeCondition() {
        super.describeCondition();
        System.out.println("The skies are cloudy, but no rain is falling.");
    }
}

class WeatherDemo {
    public static void main(String[] args) {
        WeatherCondition sunnyWeather = new Sunny();
        WeatherCondition rainyWeather = new Rainy();
        WeatherCondition cloudyWeather = new Cloudy();

        sunnyWeather.describeCondition();
        rainyWeather.describeCondition();
        cloudyWeather.describeCondition();
    }
}
