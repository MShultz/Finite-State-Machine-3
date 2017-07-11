package StateInfo.H_Words.Are_Statement;

import StateInfo.Machine;
import StateInfo.SeekingState;

/**
 * Created by Mary on 7/10/2017.
 */
public class R_State extends SeekingState {
    public R_State(Machine machine) {
        super(machine);
    }

    @Override
    public void getNextState(char currentSymbol) {
        if(currentSymbol == 'e'){
            machine.setCurrentState(machine.geteState());
        }else{
            machine.setCurrentState(machine.getSearch());
            machine.getSearch().getNextState(currentSymbol);
        }
    }
}
