package app06a;

public class DegreeConverter {
    private float celcius;
    private float fahrenheit;
    public float getCelcius() {
        return (fahrenheit - 32)*5/9;
    }
    public void setCelcius(float celcius) {
        this.celcius = celcius;
    }
    public float getFahrenheit() {
        return celcius * 9 / 5 + 32;
    }
    public void setFahrenheit(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
}
