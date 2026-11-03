public class Hospital {
    private String name;
    private int beds;
    private int doctors;


    public Hospital(String name, int beds, int doctors) {
        this.name = name;
        this.beds = beds;
        this.doctors = doctors;
    }

    public String getName() { return name; }
    public int getBeds() { return beds; }
    public int getDoctors() { return doctors; }


    public static void main(String[] args) {

        Hospital[] hospitals = {
                new Hospital("Больница №1", 150, 25),
                new Hospital("Больница №2", 320, 45),
                new Hospital("Больница №3", 80, 15),
                new Hospital("Больница №4", 410, 35),
                new Hospital("Больница №5", 200, 60),
                new Hospital("Больница №6", 300, 50)
        };

        Hospital maxBedsHospital = hospitals[0];
        Hospital maxDoctorsHospital = hospitals[0];


        for (Hospital h : hospitals) {
            if (h.getBeds() > maxBedsHospital.getBeds()) {
                maxBedsHospital = h;
            }
            if (h.getDoctors() > maxDoctorsHospital.getDoctors()) {
                maxDoctorsHospital = h;
            }
        }

        System.out.println("Максимум коек: " + maxBedsHospital.getName() + " (" + maxBedsHospital.getBeds() + ")");
        System.out.println("Максимум врачей: " + maxDoctorsHospital.getName() + " (" + maxDoctorsHospital.getDoctors() + ")");
    }
}
