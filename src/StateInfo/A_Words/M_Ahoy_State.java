package StateInfo.A_Words;

import StateInfo.Machine;
import StateInfo.SeekingState;

/**
 * Created by Mary on 7/10/2017.
 */
public class M_Ahoy_State extends SeekingState {
    public M_Ahoy_State(Machine machine) {
        super(machine);
    }

    @Override
    public void getNextState(char currentSymbol) {
        if(currentSymbol == 'a'){
            machine.setCurrentState(machine.getaMateAhoyState());
        }else{
            machine.setCurrentState(machine.getSearch());
            machine.getSearch().getNextState(currentSymbol);
        }
    }
}
