public class Restaurant {
    private String name;
    private String cuisine;
    private int rating;


    public Restaurant(String name, String cuisine, int rating) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
    }

    // Метод проверки популярности
    public boolean isPopular() {
        return this.rating > 4;
    }


    public static void main(String[] args) {
        Restaurant myRestaurant = new Restaurant("Gusto", "Italian", 5);

        System.out.println("Ресторан: " + myRestaurant.name);
        System.out.println("Популярный? " + (myRestaurant.isPopular() ? "Да" : "Нет"));
    }
}
