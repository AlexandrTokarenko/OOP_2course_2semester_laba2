package train;
public class Train {

    private String point;
    private String number;
    private int hour;
    private int minute;
    private int common;
    private int compartment;
    private int berth;
    private int luxury;

    public Train(String point, String number, int hour, int minute, int common, int compartment, int berth, int luxury) {
        this.point = point;
        this.number = number;
        this.hour = hour;
        this.minute = minute;
        this.common = common;
        this.compartment = compartment;
        this.berth = berth;
        this.luxury = luxury;
    }

    public void setPoint(String point) { this.point = point; }
    public void setNumber(String number) { this.number = number; }
    public void setOclock(int hour, int minute) { this.hour = hour; this.minute = minute; }
    public void setCommon(int common) { this.common = common; }
    public void setCompartment(int compartment) { this.compartment = compartment; }
    public void setBerth(int berth) { this.berth = berth; }
    public void setLuxury(int luxury) { this.luxury = luxury; }

    public String getPoint() { return point; }
    public String getNumber() { return number; }
    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getCommon() { return  common; }
    public int getCompartment() { return compartment; }
    public int getBerth() { return berth; }
    public int getLuxury() { return luxury; }

    @Override
    public String toString() {
        return "Пункт призначення: " + point + " Номер поїзду: " + number + " Час відправки: " + hour + ":" + minute +
                " Число місць загальних: " + common + " Число місць купе: " + compartment + " Число місць купе: " + berth +
                " Число місць люкс: " + luxury;
    }
}
