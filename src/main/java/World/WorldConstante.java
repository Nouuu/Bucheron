package World;

public class WorldConstante {
    public static Integer HouseWoodNeededQuantity;
    public static Double LumberjackStaminaMaximum;

    public WorldConstante(Integer houseWoodNeededQuantity, Double lumberjackStaminaMaximum) {
        HouseWoodNeededQuantity = houseWoodNeededQuantity;
        LumberjackStaminaMaximum = lumberjackStaminaMaximum;
    }

    public WorldConstante() {
        HouseWoodNeededQuantity = 0;
        LumberjackStaminaMaximum = 0.;
    }
}
