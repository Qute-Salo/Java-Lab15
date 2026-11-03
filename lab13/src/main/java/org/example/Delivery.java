package org.example;

public class Delivery {
    private String orderId;
    private String address;
    private double weight;
    private double distance;
    private String status;

    public Delivery(String orderId, String address, double weight, double distance) throws InvalidDeliveryDataException {
        if (weight <= 0) {
            throw new InvalidDeliveryDataException("Вес должен быть больше 0");
        }
        if (distance <= 0) {
            throw new InvalidDeliveryDataException("Расстояние должно быть больше 0");
        }
        this.orderId = orderId;
        this.address = address;
        this.weight = weight;
        this.distance = distance;
        this.status = "Создан";
    }

    public void startDelivery() throws DeliveryException {
        if ("В пути".equals(status)) {
            throw new DeliveryException("Доставка уже в пути");
        }
        if ("Завершен".equals(status)) {
            throw new DeliveryException("Нельзя начать завершенную доставку");
        }
        this.status = "В пути";
    }

    public void completeDelivery() throws DeliveryException {
        if ("Создан".equals(status)) {
            throw new DeliveryException("Нельзя завершить доставку, которая еще не началась");
        }
        if ("Завершен".equals(status)) {
            throw new DeliveryException("Доставка уже завершена");
        }
        this.status = "Завершен";
    }

    public String getOrderId() {
        return orderId;
    }

    public String getStatus() {
        return status;
    }
}
