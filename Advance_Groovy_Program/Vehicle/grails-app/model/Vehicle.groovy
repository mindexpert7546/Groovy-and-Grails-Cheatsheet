class Vehicle {
    Bus bus
    Car car
    Truck truck

    def vCode = [bus.code: bus.location, car.code: car.location, truck.code: truck.location]

    static mapping = {
        autowire true
    }
}
