package World;

public class WorldParameter {
    public static Integer WoodQuantity;
    public static Boolean HasAxe;
    public static Double LumberjackStamina;

    public WorldParameter(Integer woodQuantity, Boolean hasAxe, Double lumberjackStamina) {
        WoodQuantity = woodQuantity;
        HasAxe = hasAxe;
        LumberjackStamina = lumberjackStamina;
    }

    public WorldParameter() {
        WoodQuantity = 0;
        HasAxe = false;
        LumberjackStamina = 0.;
    }
}
