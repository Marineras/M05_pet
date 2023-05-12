package pet;

public class Animal {

    //Atributos:

    private final int MIN = 40;
    private final int MAX = 60;
    private String name;
    private char type;
    private int energy;
    private int fatigue;
    private int sleep;
    private int hygiene;
    private int weight;

    //Constructores:

    public Animal() {

    }

    public Animal(String name, char type, int energy, int fatigue, int sleep, int hygiene, int weight) {
        this.name = name;
        this.type = type;
        this.energy = energy;
        this.fatigue = fatigue;
        this.sleep = sleep;
        this.hygiene = hygiene;
        this.weight = weight;
    }

    //Geters:

    public String getName() {
        return this.name;
    }

    public char getType() {
        return this.type;
    }

    public int getEnergy() {
        return this.energy;
    }

    public int getFatigue() {
        return this.fatigue;
    }

    public int getSleep() {
        return this.sleep;
    }

    public int getHygiene() {
        return this.hygiene;
    }

    public int getWeight() {
        return this.weight;
    }

    //Setters:

    public void setName(String name) {
        this.name = name;
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public void setHygiene(int hygiene) {
        this.hygiene = hygiene;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //Funciones:


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", energy=" + energy +
                ", fatigue=" + fatigue +
                ", sleep=" + sleep +
                ", hygiene=" + hygiene +
                ", weight=" + weight +
                '}';
    }

    public void inicializarAtributos() {


        this.energy = (int) Math.floor(Math.random() * (MAX - MIN + 1) + MIN);
        this.fatigue = (int) Math.floor(Math.random() * (MAX - MIN + 1) + MIN);
        this.sleep = (int) Math.floor(Math.random() * (MAX - MIN + 1) + MIN);
        this.hygiene = (int) Math.floor(Math.random() * (MAX - MIN + 1) + MIN);
        this.weight = (int) Math.floor(Math.random() * (MAX - MIN + 1) + MIN);
    }

    public void mostrarAtributos() {

        System.out.println("Energy " + this.energy);
        System.out.println("Fatigue " + this.fatigue);
        System.out.println("Sleep " + this.sleep);
        System.out.println("Hygiene " + this.hygiene);
        System.out.println("Weight " + this.weight);
    }

    public void Sleep() {
        fatigue = fatigue - 15;
        energy = energy +15;
        if (type == 'd') {
            sleep = sleep - 25;
        } else {
            sleep = sleep - 20;
        }
    }

    public void Play() {
        fatigue = fatigue + 10;
        energy = energy - 10;
        hygiene = hygiene - 15;
        weight = weight - 10;
        if (type == 'd') {
            sleep = sleep - 10;
        } else {
            sleep = sleep - 15;
        }
    }

    public void Eat() {
        energy = energy + 10;
        hygiene = hygiene - 10;
        weight = weight + 10;
        if (type == 'd') {
            sleep = sleep + 15;
        } else {
            sleep = sleep + 10;
        }
    }

    public void clean() {
        if (type == 'd') {
            sleep = sleep - 15;
            hygiene = hygiene + 20;
        } else {
            sleep = sleep + 10;
            hygiene = hygiene + 20;
        }
    }
}
