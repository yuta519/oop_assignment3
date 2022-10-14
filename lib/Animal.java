package lib;
public class Animal {
    Integer Height;
    Integer Weight;
    String AnimalType;
    String BloodType;

    public Animal(
        Integer height,
        Integer weight,
        String animalType,
        String bloodType
    ) {
        this.Height = height;
        this.Weight = weight;
        this.AnimalType = animalType;
        this.BloodType = bloodType;
    }
}
