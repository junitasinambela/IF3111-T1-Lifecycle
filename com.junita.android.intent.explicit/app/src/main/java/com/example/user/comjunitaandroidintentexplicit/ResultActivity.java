package com.example.user.comjunitaandroidintentexplicit;

/**
 * Created by user on 2/7/2015.
 */
import android.app.Activity;
import android.os.Bundle;

public class ResultActivity extends Activity{
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
    }
    @Override
    public void finish() {

        // TODO 1 create new Intent
        // Intent intent = new Intent();

        // TODO 2 read the data of the EditText field
        // with the id returnValue

        // TODO 3 put the text from EditText
        // as String extra into the intent
        // use editText.getText().toString();

        // TODO 4 use setResult(RESULT_OK, intent);
        // to return the Intent to the application

        super.finish();
    }
}
