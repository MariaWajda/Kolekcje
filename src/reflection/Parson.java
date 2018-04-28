package reflection;

@Doc (info = "Klasa reprezentująca człowieka")
public class Parson {

    @Doc(info = "Pole reprezentujące wiek (zakrees 0- 99)")
    private int age;
    @Doc(info = "Pole reprezentujace imię człowieka")
    public String name;

    @Doc(info = "Konsturktor z dwoma parametrami")
    public Parson(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Doc(info = "Konstruktor bezparametrowy")
    public Parson() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private void shout () {
        System.out.println("Ja płacze tak rzewnie");
    }

    @Override
    public String toString() {
        return "Parson{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
