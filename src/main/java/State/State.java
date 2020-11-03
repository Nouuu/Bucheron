package State;

public abstract class State {
    public Integer ID;
    public ActionState actionState;

    public abstract void ExecuteAction();
}
