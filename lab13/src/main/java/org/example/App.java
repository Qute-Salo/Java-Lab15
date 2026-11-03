package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static List<Delivery> deliveries = new ArrayList<>();

    public static void main(String[] args) {
        try {
            deliveries.add(new Delivery("ORD-001", "Минск, ул. Ленина 5", 10.5, 15.0));
            deliveries.add(new Delivery("ORD-002", "Минск, пр. Независимости 45", 2.0, 5.4));
            deliveries.add(new Delivery("ORD-003", "Минск, ул. Сурганова 12", 25.0, 30.2));
        } catch (InvalidDeliveryDataException e) {
            System.out.println("Ошибка создания: " + e.getMessage());
        }

        try {
            new Delivery("ORD-004", "Минск, ул. Новая 1", -5.0, 10.0);
        } catch (InvalidDeliveryDataException e) {
            System.out.println("Ожидаемая ошибка конструктора: " + e.getMessage());
        }

        try {
            Delivery d = findDelivery("ORD-001");
            d.startDelivery();
            System.out.println("Заказ " + d.getOrderId() + " статус: " + d.getStatus());
            d.completeDelivery();
            System.out.println("Заказ " + d.getOrderId() + " статус: " + d.getStatus());
        } catch (DeliveryNotFoundException | DeliveryException e) {
            System.out.println("Ошибка операции: " + e.getMessage());
        }

        try {
            Delivery d = findDelivery("ORD-002");
            d.completeDelivery();
        } catch (DeliveryNotFoundException | DeliveryException e) {
            System.out.println("Ожидаемая ошибка логики: " + e.getMessage());
        }

        try {
            findDelivery("ORD-999");
        } catch (DeliveryNotFoundException e) {
            System.out.println("Ожидаемая ошибка поиска: " + e.getMessage());
        }
    }

    private static Delivery findDelivery(String orderId) throws DeliveryNotFoundException {
        for (Delivery d : deliveries) {
            if (d.getOrderId().equals(orderId)) {
                return d;
            }
        }
        throw new DeliveryNotFoundException("Доставка с ID " + orderId + " не найдена");
    }
}
