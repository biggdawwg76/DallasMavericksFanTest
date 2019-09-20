package com.example.android.dallasmavericksfantest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.MVP:
                if (checked) (True)
                    //MVP is correct
                else
                // MVP is incorrect
                break;
            case R.id.dpoy:
                if (checked)
                // Not  Defensive player of the year Incorrect
                else
                // answer is correct
                break;
            case R.id.Scoring:
                if (checked)
                // Never an NBA SCoring chanmpion MVP is incorrect
                else
                //  Checks in incorredt
                break;
            case R.id.Finals:
                if (checked)
                // was in NBA finals MVP is correct
                else
                // unchecked for Finals MVP is incorrect
                break;
            case R.id.teammate:
                if (checked)
                //Was NBA teammate of the year is correct
                else
                // not checked is incorrect
                break;
            }

    }

    private String answer ( String name, boolean checked, )
    {
        String submitAnswers = "name: " + name;
        submitAnswers +=  "\nDirk was NBA MVP, Finals MVP and NBA teammate of the year." + checked;
        //answer +=  "\nAdd Chocolate? " + addChocolate;
        //answer +=  "\nQuantity:" ;
        //answer +=  "\nTotal: $";
        //answer +=  "\nThank You!";
        return submitAnswers;
    }

    /**
     * reset score when reset button is hit
     */
    public void resetTest(View V) {
    }

    public void submitAnswers(View view)
        TextView;
       }
}
