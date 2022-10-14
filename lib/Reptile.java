package lib;
public class Reptile extends Animal {
    public String SkinType;
    public String Bone;
    public String EggType;

    public Reptile(
        Integer height,
        Integer weight,
        String animalType,
        String bloodType,
        String skinType,
        String bone,
        String eggType
    ) {
        super(height, weight, animalType, bloodType);
        this.SkinType = skinType;
        this.Bone = bone;
        this.EggType = eggType;
    }
}
