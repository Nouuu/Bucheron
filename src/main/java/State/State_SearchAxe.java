package State;

import World.*;
import StateMachine.*;

public class State_SearchAxe extends State {
    public Integer tickEnd;

    public void prepareAction(Integer tick) {
        this.tickEnd = tick + 5;
    }

    @Override
    public void ExecuteAction() {
        WorldParameter.LumberjackStamina--;
        if (StateMachine.tick < tickEnd) {
            actionState = ActionState.Running;
            System.out.println("State.State_SearchAxe, " + (tickEnd - StateMachine.tick) + " to go.");
        } else {
            WorldParameter.HasAxe = true;
            actionState = ActionState.Finished;
            System.out.println("State.State_SearchAxe... Founded ! ");
        }
    }
}
