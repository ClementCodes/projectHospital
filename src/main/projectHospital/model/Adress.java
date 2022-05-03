package projet1.projectHospital.model;

public class Adress {

    private String path;
    private int number;
    private int zip;

    @Override
    public String toString() {
        return "Adress [number=" + number + ", path=" + path + ", zip=" + zip + "]";
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public Adress(String path, int number, int zip) {
        this.path = path;
        this.number = number;
        this.zip = zip;
    }

}
