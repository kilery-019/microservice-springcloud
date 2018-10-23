package com.example.microservice.eurekaclient.order.model;

public class Order {
    private String id;
    private Double price;
    private String receiverName;
    private String receiverPhone;
    private String receiverAddress;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getReceiverName() {
        return receiverName;
    }
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
    public String getReceiverPhone() {
        return receiverPhone;
    }
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }
    public String getReceiverAddress() {
        return receiverAddress;
    }
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    @Override
    public String toString() {
        return "[id="+id+", price="+price+", receiverPhone="+receiverPhone+"]";
    }
}
