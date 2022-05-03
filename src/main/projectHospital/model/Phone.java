package projet1.projectHospital.model;

public class Phone {

    private int numberPhone;

    @Override
    public String toString() {
        return "Phone [numberPhone=" + numberPhone + "]";
    }

    public Phone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

}
