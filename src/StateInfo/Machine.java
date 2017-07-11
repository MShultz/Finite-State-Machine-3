package StateInfo;


import StateInfo.A_Words.A_Ahoy_State;
import StateInfo.H_Words.H_How_State;
import StateInfo.H_Words.O_How_State;
import StateInfo.H_Words.Space_How_State;
import StateInfo.H_Words.W_How_State;

/**
 * Created by Mary on 6/29/2017.
 */
public class Machine {
    SeekingState currentState;
    Start_State start;
    End_State found;
    Search_State search;
    H_How_State hHowState;
    O_How_State oHowState;
    W_How_State wHowState;
    Space_How_State spaceHowState;
    A_Ahoy_State aAhoyState;

    String foundState = "Default";


    public Machine() {
        start = new Start_State(this);
        found = new End_State(this);
        search = new Search_State(this);
        hHowState = new H_How_State(this);
        oHowState = new O_How_State(this);
        wHowState = new W_How_State(this);
        spaceHowState = new Space_How_State(this);
        aAhoyState = new A_Ahoy_State(this);

        //
        setCurrentState(start);


    }

    public void handleCharacter(char currentSymbol) {
        currentState.getNextState(currentSymbol);
    }

    public void setCurrentState(SeekingState newState) {
        this.currentState = newState;
    }

    public void setFoundState(String state) {
        this.foundState = state;
    }

    public Start_State getStart() {
        return start;
    }

    public End_State getFound() {
        return found;
    }

    public Search_State getSearch() {
        return search;
    }

    public H_How_State gethHowState() {
        return hHowState;
    }

    public O_How_State getoHowState() {
        return oHowState;
    }

    public W_How_State getwHowState() {
        return wHowState;
    }

    public Space_How_State getSpaceHowState() {
        return spaceHowState;
    }

    public A_Ahoy_State getaAhoyState() {
        return aAhoyState;
    }

    public String getFoundState() {
        return foundState;
    }

    public void reset() {
        setFoundState("Default");
        setCurrentState(getStart());
    }
}