class VehicleServices {
    Vehicle vehicle

    // Method to get the location based on state code
    def findLocationByStateCode(String stateCode) {
        if (vehicle.vCode.containsKey(stateCode)) {
            return vehicle.vCode[stateCode]
        } else {
            // Return an appropriate value or error message if the state code is not found
            return "State code not found"
        }
    }
}
