package StateInfo.H_Words.Are_Statement;

import StateInfo.Machine;
import StateInfo.SeekingState;

/**
 * Created by Mary on 7/10/2017.
 */
public class A_How_State extends SeekingState {
    public A_How_State(Machine machine) {
        super(machine);
    }

    @Override
    public void getNextState(char currentSymbol) {
        if(currentSymbol == 'r'){
            machine.setCurrentState(machine.getrState());
            machine.setSearchingState("you");
        }else{
            machine.setCurrentState(machine.getSearch());
            machine.getSearch().getNextState(currentSymbol);
        }


    }
}
