package StateInfo.H_Words;

import StateInfo.Machine;
import StateInfo.SeekingState;

/**
 * Created by Mary on 7/7/2017.
 */
public class O_How_State extends SeekingState {
    public O_How_State(Machine machine) {
        super(machine);
    }

    @Override
    public void getNextState(char currentSymbol){
        if(currentSymbol == 'w'){
            machine.setCurrentState(machine.getwHowState());
        }else{
            machine.setCurrentState(machine.getSearch());
            machine.getSearch().getNextState(currentSymbol);
        }
    }
}
