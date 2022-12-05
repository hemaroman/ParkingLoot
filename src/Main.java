public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        ParkingLoot unityParkingLoot = new ParkingLoot("unityParking", 2, 15);

        unityParkingLoot.addVehicle(0, "Toyota Yaris", "128977","Medium",4);

        unityParkingLoot.addVehicle(1, "Toyota Dx", "124545","Midium", 7);
        unityParkingLoot.addVehicle(2, "Toyota Corolla", "126767","Large", 3);


//        unityParkingLoot.vehicleInfo(1);
//
//        System.out.println("the total amount of the the parking cost is:"+unityParkingLoot.vehicleParkingCost(2)+" Birr");




    }




}