package StateInfo.H_Words.Are_Statement;

import StateInfo.Machine;
import StateInfo.SeekingState;

/**
 * Created by Mary on 7/10/2017.
 */
public class Space_Are_You_State extends SeekingState {
    public Space_Are_You_State(Machine machine) {
        super(machine);
    }

    @Override
    public void getNextState(char currentSymbol) {
        if(currentSymbol == 'd'){
            machine.setCurrentState(machine.getdDoingState());
        }else if (currentSymbol != ' '){
            machine.setCurrentState(machine.getSearch());
            machine.getSearch().getNextState(currentSymbol);
        }
    }
}
