package StateInfo;

import StateInfo.Machine;

/**
 * Created by Mary on 7/5/2017.
 */
public class End_State extends SeekingState {
    public End_State(Machine machine) {
        super(machine);
    }

    @Override
    public void getNextState(char currentSymbol) {
        throw new UnsupportedOperationException();
    }


}
