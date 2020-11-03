package StateMachine;

import State.*;
import Transition.*;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;

public class StateMachine {

    public HashMap<State, List<Pair<Transition, State>>> stateList;
    public static Integer tick = 0;

    public void Process() {
        tick++;
        // à chaque appel, regarde l'état courant, réalise l'action, sinon, trouve la nouvelle action
    }

    public void InitializeStateMachine() {
        stateList = new HashMap<State, List<Pair<Transition, State>>>();

    }

    public void DeinitStateMachine() {
        stateList.clear();
    }
}
