package org.example;

public class Pet {
    private String name;
    private String species;
    private int age;
    private double weight;
    private String owner;

    public Pet(String name, String species, int age, double weight, String owner) throws InvalidPetDataException {
        if (age < 0) {
            throw new InvalidPetDataException("Возраст не может быть отрицательным: " + age);
        }
        if (weight <= 0) {
            throw new InvalidPetDataException("Вес должен быть больше 0: " + weight);
        }
        if (name == null || name.isEmpty() || owner == null || owner.isEmpty()) {
            throw new InvalidPetDataException("Имя питомца и владельца не должны быть пустыми");
        }
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.owner = owner;
    }

    public void visitVet() throws VetException {
        if (this.weight < 0.5) {
            throw new VetException("Критически малый вес у питомца " + name + "! Требуется срочное лечение.");
        }
        System.out.println("Питомец " + name + " (" + species + ") успешно прошел осмотр у ветеринара.");
    }

    public void updateWeight(double newWeight) throws InvalidPetDataException {
        if (newWeight <= 0) {
            throw new InvalidPetDataException("Новый вес должен быть больше 0");
        }
        this.weight = newWeight;
        System.out.println("Вес питомца " + name + " обновлен: " + this.weight + " кг.");
    }

    public String getName() { return name; }
    public String getSpecies() { return species; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }
    public String getOwner() { return owner; }

    @Override
    public String toString() {
        return "Pet{name='" + name + "', species='" + species + "', age=" + age +
                ", weight=" + weight + ", owner='" + owner + "'}";
    }
}