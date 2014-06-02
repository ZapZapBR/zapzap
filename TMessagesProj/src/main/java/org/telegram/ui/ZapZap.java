package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by erickcosta on 21/05/14.
 */
public class ZapZap extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        restartMain();
    }

    public void restartMain(){
            Intent mainIntent = new Intent(this, LaunchActivity.class);
            startActivity(mainIntent);
            finish();
    }
}
