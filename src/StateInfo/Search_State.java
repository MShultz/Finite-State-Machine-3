package StateInfo;

/**
 * Created by Mary on 7/7/2017.
 */
public class Search_State extends SeekingState {
    public Search_State(Machine machine) {
        super(machine);
    }

    @Override
    public void getNextState(char currentSymbol) {
        if(currentSymbol == ' '){
            machine.setCurrentState(machine.getStart());
        }else if(currentSymbol == '\n'){

        }
    }
}
