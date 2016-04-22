package com.adi.conductorissue;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.bluelinelabs.conductor.Conductor;
import com.bluelinelabs.conductor.Router;

/**
 * Created by adi on 22/04/16.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout container = new FrameLayout(this);
        setContentView(container);
        Router router = Conductor.attachRouter(this, container, savedInstanceState);
        if (!router.hasRootController()) {
            router.setRoot(new TopController());
        }
    }
}
