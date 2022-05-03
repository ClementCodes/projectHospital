package projet1.projectHospital.model;

public class Visit {

    public Visit(int idVsit, String date, int price, Doctor doctor) {
        this.idVsit = idVsit;
        this.date = date;
        this.price = price;
        this.doctor = doctor;
    }

    private int idVsit;
    private String date;
    private int price;
    private Doctor doctor;
    private final int fixedPrice = 23;

    public int getIdVsit() {
        return idVsit;
    }

    public void setIdVsit(int idVsit) {
        this.idVsit = idVsit;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getFixedPrice() {
        return fixedPrice;
    }

}
