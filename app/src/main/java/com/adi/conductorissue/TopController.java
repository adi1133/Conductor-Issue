package com.adi.conductorissue;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bluelinelabs.conductor.ChildControllerTransaction;
import com.bluelinelabs.conductor.Controller;

/**
 * Created by adi on 22/04/16.
 */
public class TopController extends Controller {
    public TopController() {
        addChildController(ChildControllerTransaction.builder(new MiddleController(this), R.id.frame_layout).build());
    }

    public TopController(Bundle args) {
        super(args);
    }

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.controller, container, false);
        TextView tv = (TextView) view.findViewById(R.id.text_view);
        tv.setText("TopController");
        return view;
    }
}
