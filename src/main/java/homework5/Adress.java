package homework5;

public class Adress {

    private String address;
    private String country;


    public String getAddress() {
        return address;
    }


    public Adress(String address, String country) {
        this.address = address;
        this.country = country;
    }


    public String getCountry() {
        return country;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "address='" + address + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

