package StateInfo.H_Words.Doing_Statement;

import StateInfo.Machine;
import StateInfo.SeekingState;

/**
 * Created by Mary on 7/10/2017.
 */
public class D_Doing_State extends SeekingState {
    public D_Doing_State(Machine machine) {
        super(machine);
    }

    @Override
    public void getNextState(char currentSymbol) {
        if (currentSymbol == 'o') {
            machine.setCurrentState(machine.getoDoingState());
            machine.setSearchingState("doing");
        } else {
            machine.setCurrentState(machine.getSearch());
            machine.getSearch().getNextState(currentSymbol);
        }
    }
}
