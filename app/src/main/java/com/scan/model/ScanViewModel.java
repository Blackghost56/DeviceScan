package com.scan.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScanViewModel extends ViewModel {


    public enum State {START, SINGLE, MULTIPLE}


    private final MutableLiveData<State> stateChange = new MutableLiveData<>();
    public LiveData<State> getStateChange() {
        return stateChange;
    }


//    protected void setState(State state){
//        switch (state){
//            case START:
//            case SINGLE:
//            case MULTIPLE:
//        }
//        stateChange.setValue(state);
//    }

}