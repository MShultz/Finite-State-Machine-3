package StateInfo.H_Words;

import StateInfo.Machine;
import StateInfo.SeekingState;

/**
 * Created by Mary on 7/10/2017.
 */
public class Question_State extends SeekingState {
    public Question_State(Machine machine) {
        super(machine);
    }

    @Override
    public void getNextState(char currentSymbol) {
            if(currentSymbol == '\n' || currentSymbol == ' '){
             machine.setCurrentState(machine.getFound());
             machine.setSearchingFound();
            }else{
                machine.setCurrentState(machine.getSearch());
                machine.getSearch().getNextState(currentSymbol);
            }
        }
    }