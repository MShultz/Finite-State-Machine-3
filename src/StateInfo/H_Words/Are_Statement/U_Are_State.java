package StateInfo.H_Words.Are_Statement;

import StateInfo.Machine;
import StateInfo.SeekingState;

/**
 * Created by Mary on 7/10/2017.
 */
public class U_Are_State extends SeekingState {
    public U_Are_State(Machine machine) {
        super(machine);
    }

    @Override
    public void getNextState(char currentSymbol) {
        if(currentSymbol == '?'){
            machine.setCurrentState(machine.getQuestionState());
        }else if (currentSymbol == ' '){
        machine.setCurrentState(machine.getSpaceAreYouState());
        }else{
            machine.setCurrentState(machine.getSearch());
            machine.getSearch().getNextState(currentSymbol);
        }
    }
}
