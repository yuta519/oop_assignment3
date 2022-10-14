package lib;
public class Fish extends Animal {
    String WhereLive;
    String FishType;

    public Fish(
        Integer height,
        Integer weight,
        String animalType,
        String bloodType,
        String whereLive,
        String fishType
    ) {
        super(height, weight, animalType, bloodType);
        this.WhereLive = whereLive;
        this.FishType = fishType;
    }

}
