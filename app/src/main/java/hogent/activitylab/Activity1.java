package hogent.activitylab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Activity1 extends Activity {


    // String voor LogCat documentatie
    private final static String TAG = "Activity_1";

    /**
     * Creëer counter variabelen voor onCreate(), onRestart(), onStart() and
     * onResume() etc.
     * Je moet deze variabelen incremeteren elke keer de overeenkomstige methode opgeroepen wordt
     */
    private int mCreate = 0;
    private int mStart = 0;
    private int mResume = 0;
    private int mRestart = 0;

    //Creëer variabelen voor de verschillende textviews
    private TextView mTvCreate;
    private TextView mTvStart;
    private TextView mTvResume;
    private TextView mTvRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);

        // Initialiseer de correcte TextViews
        // Hint: findViewById()
        // textView1 = (TextView) findViewById(R.id.textView1);
        mTvCreate = (TextView) findViewById(R.id.create);
        mTvStart = (TextView) findViewById(R.id.start);
        mTvResume = (TextView) findViewById(R.id.resume);
        mTvRestart = (TextView) findViewById(R.id.restart);

        // Voeg een Onclicklistener toe aan de button om een nieuwe activity te starten
        Button button = (Button)findViewById(R.id.bLaunchActivityTwo);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Activity2.class);
                startActivity(i);
            }
        });

        // Check voor gesavede state
        if (savedInstanceState != null) {
            // Herstel waarde van de counters van de saved state
            mCreate = savedInstanceState.getInt("createCount");
            mStart = savedInstanceState.getInt("startCount");
            mResume = savedInstanceState.getInt("resumeCount");
            mRestart = savedInstanceState.getInt("restartCount");
        }

        // LogCat message
        Log.i(TAG, "onCreate() werd uitgevoerd");

        // Update voor de variabelen
        mCreate++;

        // Update de user interface via de displayCounts() methode
        displayCounts();

    }

    @Override
    public void onStart() {
        super.onStart();

        // LogCat message
        Log.i(TAG, "onStart() werd uitgevoerd");

        // Update de count variable
        mStart++;

        // Update the user interface
        displayCounts();
    }

    @Override
    public void onResume() {
        super.onResume();

        // LogCat message
        Log.i(TAG, "onResume() werd uitgevoerd");

        // Update de count variable
        mResume++;

        // Update the user interface
        displayCounts();
    }

    @Override
    public void onPause() {
        super.onPause();

        // LogCat message
        Log.i(TAG, "onPause() werd uitgevoerd");

        // TODO: Update de  count variable
        //???

        // Update the user interface
        displayCounts();
    }

    @Override
    public void onStop() {
        super.onStop();

        // LogCat message
        Log.i(TAG, "onStop() werd uitgevoerd");

        // TODO: Update de  count variable
        //???

        // Update the user interface
        displayCounts();
    }

    @Override
    public void onRestart() {
        super.onRestart();

        // LogCat message
        Log.i(TAG, "onRestart() werd uitgevoerd");

        // TODO: Update de  count variable
        mRestart++;

        // Update the user interface
        displayCounts();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        // LogCat message
        Log.i(TAG, "onDestroy() werd uitgevoerd");

        // TODO: Update de  count variable
        //???

        // Update the user interface
        displayCounts();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save de state  met key-value pairs in de Bundle
        savedInstanceState.putInt("createCount", mCreate);
        savedInstanceState.putInt("startCount", mStart);
        savedInstanceState.putInt("resumeCount", mResume);
        savedInstanceState.putInt("restartCount", mRestart);
    }

    // Updates de counters
    public void displayCounts() {
        // Zet de countervariabelen correct in de activity
        mTvCreate.setText("onCreate() calls: " + mCreate);
        mTvStart.setText("onStart() calls: " + mStart);
        mTvResume.setText("onResume() calls: " + mResume);
        mTvRestart.setText("onRestart() calls: " + mRestart);
    }
}
