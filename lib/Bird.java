package lib;
public class Bird extends Animal {
    String SkinType;
    Boolean CanFly;

    public Bird(
        Integer height,
        Integer weight,
        String animalType,
        String bloodType,
        String skinType,
        Boolean canFly
    ) {
        super(height, weight, animalType, bloodType);
        this.SkinType = skinType;
        this.CanFly = canFly;
    }
}
