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
public class BottomController extends Controller {

    public BottomController(MiddleController middleController) {
        setTargetController(middleController);
        addChildController(ChildControllerTransaction.builder(new LastController(this), R.id.frame_layout).build());
    }

    public BottomController(Bundle args) {
        super(args);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        if (getTargetController() == null)
            throw new UnsupportedOperationException("getTarget() can not be null");
    }

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.controller, container, false);
        TextView tv = (TextView) view.findViewById(R.id.text_view);
        tv.setText("BottomController");
        return view;
    }
}
