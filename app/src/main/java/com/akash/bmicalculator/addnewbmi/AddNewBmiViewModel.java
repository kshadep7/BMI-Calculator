package com.akash.bmicalculator.addnewbmi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.akash.bmicalculator.Event;
import com.akash.bmicalculator.R;
import com.akash.bmicalculator.models.BMI;

public class AddNewBmiViewModel extends ViewModel {
    // Live Data for snackbar text to show user if height and weight is incorrect.
    private MutableLiveData<Event<Integer>> snackBarText;

    public LiveData<Event<Integer>> getsnackBarText() {
        if (snackBarText == null) {
            snackBarText = new MutableLiveData<>();
        }
        return snackBarText;
    }

    // Live data for bmi calculation.
    private MutableLiveData<Event<Integer>> calculateMBmiEvent;

    public LiveData<Event<Integer>> getCalculateBmiEvent() {
        if (calculateMBmiEvent == null)
            calculateMBmiEvent = new MutableLiveData<>();
        return calculateMBmiEvent;
    }

    MutableLiveData<String> height = new MutableLiveData<>();
    MutableLiveData<String> weight = new MutableLiveData<>();

    BMI bmi;

    private boolean checkValuesCorrectness(String height, String weight) {
        if (height.isEmpty()) {
            snackBarText.setValue(new Event(R.string.height_is_empty));
            return false
        }
        if (weight.isNullOrEmpty()) {
            _snackbarText.value = Event(R.string.weight_is_empty)
            return false
        }
        return true
    }

}