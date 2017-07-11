package StateInfo;

/**
 * Created by Mary on 6/29/2017.
 */
public abstract class SeekingState {
    public Machine machine;
    public SeekingState(Machine machine){
        this.machine = machine;
    }
    public abstract void getNextState(char currentSymbol);
}
