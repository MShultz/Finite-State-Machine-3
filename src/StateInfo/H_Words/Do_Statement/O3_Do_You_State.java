package StateInfo.H_Words.Do_Statement;

import StateInfo.Machine;
import StateInfo.SeekingState;

/**
 * Created by Mary on 7/10/2017.
 */
public class O3_Do_You_State extends SeekingState {
    public O3_Do_You_State(Machine machine) {
        super(machine);
    }

    @Override
    public void getNextState(char currentSymbol) {
        if(currentSymbol == 'u'){
         machine.setCurrentState(machine.getuDoState());
        }else{
            machine.setCurrentState(machine.getSearch());
            machine.getSearch().getNextState(currentSymbol);
        }
    }
}
