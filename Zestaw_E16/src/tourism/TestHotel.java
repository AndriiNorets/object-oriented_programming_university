package tourism;

public class TestHotel {
    public static void main(String[] args) throws CloneNotSupportedException {
        Hotel h1 = new Hotel("Radisson", 120.0);
        Hotel h2;
        System.out.println(h1.getName());
        try {
            h2 = (Hotel) h1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        h1.setName("dfsdff");
        System.out.println(h1.getName());
        System.out.println(h2.getName());
    }
}
