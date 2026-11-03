public class Phone {
    private String brand;
    private double price;
    private int battery;

    private static int totalPhones = 0;
    private static double totalPrice = 0.0;


    public Phone(String brand, double price, int battery) {
        this.brand = brand;
        this.price = price;
        this.battery = battery;

        totalPhones++;
        totalPrice += price;
    }

    public static double getAveragePrice() {
        if (totalPhones == 0) {
            return 0.0;
        }
        return totalPrice / totalPhones;
    }

    public static void printStats() {
        System.out.println("=== Общая статистика ===");
        System.out.println("Всего телефонов создано: " + totalPhones);
        System.out.println("Общая стоимость: $" + totalPrice);
        System.out.printf("Средняя цена: $%.2f%n", getAveragePrice());
        System.out.println("========================");
    }

    public static void main(String[] args) {
        // 4. Создаем 6 объектов класса Phone
        Phone phone1 = new Phone("Apple iPhone 15", 999.99, 3349);
        Phone phone2 = new Phone("Samsung Galaxy S24", 799.99, 4000);
        Phone phone3 = new Phone("Xiaomi 14", 649.50, 4610);
        Phone phone4 = new Phone("Google Pixel 8", 699.00, 4575);
        Phone phone5 = new Phone("OnePlus 12", 799.99, 5400);
        Phone phone6 = new Phone("POCO X6 Pro", 350.00, 5000);

        Phone.printStats();
    }
}
