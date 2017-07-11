package StateInfo.H_Words.Do_Statement;

import StateInfo.Machine;
import StateInfo.SeekingState;

/**
 * Created by Mary on 7/10/2017.
 */
public class U_Do_State extends SeekingState {
    public U_Do_State(Machine machine) {
        super(machine);
    }

    @Override
    public void getNextState(char currentSymbol) {
        if(currentSymbol == ' '){
            machine.setCurrentState(machine.getSpaceYouState());
        }else{
            machine.setCurrentState(machine.getSearch());
            machine.getSearch().getNextState(currentSymbol);
        }
    }
}
