class VehicleServices{
    Vehicle vehicle;
    Bus bus;
    Car car;
    Truck truck;

    //method to get location
    def findAllByStateCode(String statecode){
       if(vehicle.vCode.contains(stateCode)){
        return car.location;
       }
    }
}