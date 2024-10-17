public class Mortal extends LivingBeingEssence{
    private boolean hasBless;

    public Mortal(boolean isMortal, String baseType, String nickname, String ID, int age, String affinity, String race) {
        super(isMortal, baseType, nickname, ID, age, affinity, race, false, false, false);
    }

    public void setHasBless(boolean hasBless) {
        this.hasBless = hasBless;
    }

    public void ascendEssence (String newType){
        this.essenceType.setType(newType);
    }
}
