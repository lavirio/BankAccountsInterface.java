public class Country {
    String name;
    int quantity;
    int sqrMeters;
    String capital;
    boolean see;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSqrMeters() {
        return sqrMeters;
    }

    public void setSqrMeters(int sqrMeters) {
        this.sqrMeters = sqrMeters;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public boolean isSee() {
        return see;
    }

    public void setSee(boolean see) {
        this.see = see;
    }
}
