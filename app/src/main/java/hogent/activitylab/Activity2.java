package hogent.activitylab;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends Activity {



    // String voor LogCat documentatie
    private final static String TAG = "Activity_2";



    /**
     * TODO: Creëer counter variabelen voor onCreate(), onRestart(), onStart() and
     * onResume() etc.
     * Je moet deze variabelen incremeteren elke keer de overeenkomstige methode opgeroepen wordt

     */


    /**
     * TODO: Creëer variabelen voor de verschillende textviews
     */


    // TODO: Creëer variabelen voor de verschillende textviews

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        // TODO: initialiseer de correcte TextViews
        // Hint: findViewById()
        // textView1 = (TextView) findViewById(R.id.textView1);


        //TODO: voeg een Onclicklistener toe aan de button om de activity te stoppen




        // TODO: Check voor gesavede state
        if () {

            // TODO: Herstel waarde van de counters van de  saved state

        }

        // TODO: LogCat message


        // TODO:Update voor de variabelen


        // TODO: Update de user interface via de displayCounts() methode


    }

    // Lifecycle callback methods overrides

    @Override
    public void onStart() {
        super.onStart();

        // TODO: Emit LogCat message
        Log.i(TAG, "Start has been called");

        // TODO:
        // Update voor de variabelen
        // Update de user interface via de displayCounts() methode
        mStart++;
        displayCounts();

    }

    @Override
    public void onResume() {
        super.onResume();

        // TODO: LogCat message

        // TODO: Update de  count variable

        // TODO: Update the user interfac


    }

    @Override
    public void onPause() {
        super.onPause();

        // TODO: LogCat message

        // TODO: Update de  count variable

        // TODO: Update the user interfac


    }

    @Override
    public void onStop() {
        super.onStop();

        // TODO: LogCat message

        // TODO: Update de  count variable

        // TODO: Update the user interfac


    }

    @Override
    public void onRestart() {
        super.onRestart();

        // TODO: LogCat message

        // TODO: Update de  count variable

        // TODO: Update the user interfac

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        // TODO: LogCat message

        // TODO: Update de  count variable

        // TODO: Update the user interfac
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        // TODO:  Save de state  met key-value pairs in de Bundle





    }

    // Updates the displayed counters
    public void displayCounts() {

        // TODO: zet de countervariabelen correct in de activity

    }
}
