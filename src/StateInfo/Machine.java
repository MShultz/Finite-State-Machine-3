package StateInfo;


import StateInfo.A_Words.*;
import StateInfo.H_Words.*;
import StateInfo.H_Words.Are_Statement.*;
import StateInfo.H_Words.Do_Statement.*;
import StateInfo.H_Words.Do_Statement.Space_You_State;
import StateInfo.H_Words.Doing_Statement.*;

/**
 * Created by Mary on 6/29/2017.
 */
public class Machine {
    //Basic States
    private SeekingState currentState;
    private Start_State start;
    private End_State found;
    private Search_State search;
    private Question_State questionState;

    //How
    private H_How_State hHowState;
    private O_How_State oHowState;
    private W_How_State wHowState;
    private Space_How_State spaceHowState;

    // Do you do?
    private D_How_State dHowState;
    private O2_Do_State o2DoState;
    private Space_Do_State spaceDoState;
    private Y_Do_State yDoState;
    private O3_Do_You_State o3DoYouState;
    private U_Do_State uDoState;
    private Space_You_State spaceYouState;
    private D2_How_State d2HowState;
    private O4_Do2_State o4_do2_state;

    //are you?
    private A_How_State aHowState;
    private R_State rState;
    private E_State eState;
    private Space_Are_State spaceAreState;
    private Y_Are_State yAreState;
    private O_Are_State oAreState;
    private U_Are_State u_are_state;
    private Space_Are_You_State spaceAreYouState;

    //doing?

    private D_Doing_State dDoingState;
    private O_Doing_State oDoingState;
    private I_State iState;
    private N_Doing_State nDoingState;
    private G_State gState;

    //Ahoy mate
    private A_Ahoy_State aAhoyState;
    private H_Ahoy_State hAhoyState;
    private O_Ahoy_State oAhoyState;
    private Y_Ahoy_State yAhoyState;
    private Space_Ahoy_State spaceAhoyState;
    private M_Ahoy_State mAhoyState;
    private A_Mate_Ahoy_State aMateAhoyState;
    private T_Ahoy_State t_ahoy_state;
    private E_Ahoy_State eAhoyState;

    private String SearchingState = "Default";


    public Machine() {
        //Basic States
        start = new Start_State(this);
        found = new End_State(this);
        search = new Search_State(this);
        questionState = new Question_State(this);

        //How
        hHowState = new H_How_State(this);
        oHowState = new O_How_State(this);
        wHowState = new W_How_State(this);
        spaceHowState = new Space_How_State(this);

        //Do you do?
        dHowState = new D_How_State(this);
        o2DoState = new O2_Do_State(this);
        spaceDoState = new Space_Do_State(this);
        yDoState = new Y_Do_State(this);
        o3DoYouState = new O3_Do_You_State(this);
        uDoState = new U_Do_State(this);
        spaceYouState = new Space_You_State(this);
        d2HowState = new D2_How_State(this);
        o4_do2_state = new O4_Do2_State(this);

        //Are you?
        aHowState = new A_How_State(this);
        rState = new R_State(this);
        eState = new E_State(this);
        spaceAreState = new Space_Are_State(this);
        yAreState = new Y_Are_State(this);
        oAreState = new O_Are_State(this);
        u_are_state = new U_Are_State(this);
        spaceAreYouState = new Space_Are_You_State(this);

        //Doing?
        dDoingState = new D_Doing_State(this);
        oDoingState = new O_Doing_State(this);
        iState = new I_State(this);
        nDoingState = new N_Doing_State(this);
        gState = new G_State(this);

        //Ahoy States
        aAhoyState = new A_Ahoy_State(this);
        hAhoyState = new H_Ahoy_State(this);
        oAhoyState = new O_Ahoy_State(this);
        yAhoyState = new Y_Ahoy_State(this);
        spaceAhoyState = new Space_Ahoy_State(this);
        mAhoyState = new M_Ahoy_State(this);
        aMateAhoyState = new A_Mate_Ahoy_State(this);
        t_ahoy_state = new T_Ahoy_State(this);
        eAhoyState = new E_Ahoy_State(this);
        //
        setCurrentState(start);
    }

    public void handleCharacter(char currentSymbol) {
        currentState.getNextState(currentSymbol);
    }

    public void setCurrentState(SeekingState newState) {
        this.currentState = newState;
    }

    public void setSearchingState(String state) {
        this.SearchingState = state;
    }

    public void setSearchingFound() {
        this.SearchingState += "Found";
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
        return SearchingState;
    }

    public D_How_State getdHowState() {
        return dHowState;
    }

    public O2_Do_State getO2DoState() {
        return o2DoState;
    }

    public Space_Do_State getSpaceDoState() {
        return spaceDoState;
    }

    public Y_Do_State getyDoState() {
        return yDoState;
    }

    public O3_Do_You_State getO3DoYouState() {
        return o3DoYouState;
    }

    public U_Do_State getuDoState() {
        return uDoState;
    }

    public Space_You_State getSpaceYouState() {
        return spaceYouState;
    }

    public D2_How_State getD2HowState() {
        return d2HowState;
    }

    public O4_Do2_State getO4_do2_state() {
        return o4_do2_state;
    }

    public Question_State getQuestionState() {
        return questionState;
    }

    public A_How_State getaHowState() {
        return aHowState;
    }

    public R_State getrState() {
        return rState;
    }

    public E_State geteState() {
        return eState;
    }

    public Space_Are_State getSpaceAreState() {
        return spaceAreState;
    }

    public Y_Are_State getyAreState() {
        return yAreState;
    }

    public O_Are_State getoAreState() {
        return oAreState;
    }

    public U_Are_State getU_are_state() {
        return u_are_state;
    }

    public Space_Are_You_State getSpaceAreYouState() {
        return spaceAreYouState;
    }

    public D_Doing_State getdDoingState() {
        return dDoingState;
    }

    public O_Doing_State getoDoingState() {
        return oDoingState;
    }

    public I_State getiState() {
        return iState;
    }

    public N_Doing_State getnDoingState() {
        return nDoingState;
    }

    public G_State getgState() {
        return gState;
    }


    public H_Ahoy_State gethAhoyState() {return hAhoyState;}

    public O_Ahoy_State getoAhoyState() {
        return oAhoyState;
    }

    public Y_Ahoy_State getyAhoyState() {
        return yAhoyState;
    }

    public Space_Ahoy_State getSpaceAhoyState() {
        return spaceAhoyState;
    }

    public M_Ahoy_State getmAhoyState() {
        return mAhoyState;
    }

    public A_Mate_Ahoy_State getaMateAhoyState() {
        return aMateAhoyState;
    }

    public T_Ahoy_State getT_ahoy_state() {
        return t_ahoy_state;
    }

    public E_Ahoy_State geteAhoyState() {
        return eAhoyState;
    }

    public void reset() {
        setSearchingState("Default");
        setCurrentState(getStart());
    }
}