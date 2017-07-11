package StateInfo.H_Words;

import StateInfo.Machine;
import StateInfo.SeekingState;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Mary on 7/7/2017.
 */
public class Space_How_State extends SeekingState {
    public Space_How_State(Machine machine) {
        super(machine);
    }

    @Override
    public void getNextState(char currentSymbol) {
            if(currentSymbol == 'd'){
             machine.setCurrentState(machine.getdHowState());
            }else if(currentSymbol == 'a'){
                machine.setCurrentState(machine.getaHowState());
            }else if(currentSymbol != ' '){
                machine.setCurrentState(machine.getSearch());
                machine.getSearch().getNextState(currentSymbol);
            }
    }
}
