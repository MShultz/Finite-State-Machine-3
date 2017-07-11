package StateInfo;

/**
 * Created by Mary on 7/5/2017.
 */
public class Start_State extends SeekingState {
    public Start_State(Machine machine){
        super(machine);
    }
    @Override
    public void getNextState(char currentSymbol) {
        if(currentSymbol == 'H' || currentSymbol == 'h'){
            machine.setCurrentState(machine.gethHowState());
        }else if(currentSymbol == 'A' || currentSymbol == 'a'){
            machine.setCurrentState(machine.getaAhoyState());
        }else if(currentSymbol != ' '){
            machine.setCurrentState(machine.getSearch());
        }
    }
}
