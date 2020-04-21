package E04FoodShortage;

public class Citizen implements Person, Buyer, Identifiable {
    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food = 0;

    public Citizen( String name, int age, String id, String birthDate){
        this.name =name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;

    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getBirthDate() {
        return birthDate;
    }


    public void buyFood() {
        this.food+=10;
    }

    public int getFood() {
        return this.food;
    }
}
