package aviation;

public class TestPilot {
    public static void main(String[] args) {
        Pilot p1 = new Pilot("Vasio",new double[]{11.6,12.5,7.5,1.2,3.5});
        Pilot p2 =new Pilot("sdfdsf",new double[]{11.6,12.5,7.5,1.2,3.5});
        try {
            p2 = (Pilot)p1.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        p1.changeValue(5.5,3);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
