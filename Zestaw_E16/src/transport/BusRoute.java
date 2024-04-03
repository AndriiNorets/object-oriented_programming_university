package transport;

public record BusRoute(String routeNumber, String startLocation, String endLocation) {
//    routeNumber: typu String, reprezentującego numer trasy autobusowej.
//• startLocation: typu String, reprezentującego punkt początkowy trasy.
//• endLocation: typu String, reprezentującego punkt końcowy trasy
    public BusRoute{
        if(routeNumber == "" || routeNumber == null){
            throw new IllegalArgumentException("Niepoprawnie wpid=sany routeNumber");
        }
    }
    public boolean isLongRoute(){
        return routeNumber.length() > 4;
    }

    public void printDetails(){
        System.out.println(
                "routeNumber='" + routeNumber + '\'' +
                ", startLocation='" + startLocation + '\'' +
                ", endLocation='" + endLocation + '\'' +
                '}');
    }
}
