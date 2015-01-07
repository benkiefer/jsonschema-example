package bk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import java.util.List;

public class Car {
    @JsonProperty(required = true)
    private String make;
    @JsonProperty(required = true)
    private String model;
    private TitleStatus titleStatus;
    @JsonPropertyDescription("people authorized to drive a car")
    private List<Driver> drivers;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm'Z'")
    private String purchaseDate;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public TitleStatus getTitleStatus() {
        return titleStatus;
    }

    public void setTitleStatus(TitleStatus titleStatus) {
        this.titleStatus = titleStatus;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
