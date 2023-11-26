package adapterpattern;

public class Example {
public static void main(String[] args) {
	System.out.println("Adapter pattern");
    CelsiusTemperature celsiusTemperature = new CelsiusTemperature();
    FahrenheitTemperature adapter = new CelsiusToFahrenheitAdapter(celsiusTemperature);
    System.out.println("Temperature in Fahrenheit: " + adapter.getTemperatureInFahrenheit());

	
}
}
class CelsiusTemperature {
    public double getTemperature() {
        return 25.0;
    }
}

interface FahrenheitTemperature {
    double getTemperatureInFahrenheit();
}

class CelsiusToFahrenheitAdapter implements FahrenheitTemperature {
    private CelsiusTemperature celsiusTemperature;

    public CelsiusToFahrenheitAdapter(CelsiusTemperature celsiusTemperature) {
        this.celsiusTemperature = celsiusTemperature;
    }

    @Override
    public double getTemperatureInFahrenheit() {
    	System.out.println("Temperature @celcius:"+celsiusTemperature.getTemperature());
        return (celsiusTemperature.getTemperature() * 9 / 5) + 32;
    }
}

