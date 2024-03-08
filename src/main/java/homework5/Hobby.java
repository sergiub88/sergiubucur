package homework5;
import java.util.List;

public class Hobby {
    private String name;
    private int frequency;
    private List<Adress> addresses ;

    public Hobby(String name, int frequency, List<Adress> addresses)
    {
        this.name=name;
        this.frequency=frequency;
        this.addresses=addresses;

    }

    public List<Adress> getAddresses(){
        return addresses;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", addresses=" + addresses +
                '}';
    }
}
