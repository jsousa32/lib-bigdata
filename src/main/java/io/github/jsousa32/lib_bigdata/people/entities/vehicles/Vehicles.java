package io.github.jsousa32.lib_bigdata.people.entities.vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vehicles {

    private String taxIdNumber;

    private List<VehicleDetails> vehicleDetails;

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public List<VehicleDetails> getVehicleDetails() {
        return Objects.isNull(vehicleDetails) ? new ArrayList<>() : vehicleDetails;
    }
}
