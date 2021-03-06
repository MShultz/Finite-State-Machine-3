package StateInfo.A_Words;

import StateInfo.Machine;
import StateInfo.SeekingState;

/**
 * Created by Mary on 7/7/2017.
 */
public class A_Ahoy_State extends SeekingState {
    public A_Ahoy_State(Machine machine) {
        super(machine);
    }

    @Override
    public void getNextState(char currentSymbol) {
        if(currentSymbol == 'h'){
            machine.setCurrentState(machine.gethAhoyState());
            machine.setSearchingState("ahoy");
        }else{
            machine.setCurrentState(machine.getSearch());
            machine.getSearch().getNextState(currentSymbol);
        }
    }
}
