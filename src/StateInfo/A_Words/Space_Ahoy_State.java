package StateInfo.A_Words;

import StateInfo.Machine;
import StateInfo.SeekingState;

/**
 * Created by Mary on 7/10/2017.
 */
public class Space_Ahoy_State extends SeekingState {
    public Space_Ahoy_State(Machine machine) {
        super(machine);
    }

    @Override
    public void getNextState(char currentSymbol) {
        if (currentSymbol == 'm') {
            machine.setCurrentState(machine.getmAhoyState());
        } else if (currentSymbol != ' ') {
            machine.setCurrentState(machine.getSearch());
            machine.getSearch().getNextState(currentSymbol);
        }
    }
}
