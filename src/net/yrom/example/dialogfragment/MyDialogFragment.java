package net.yrom.example.dialogfragment;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyDialogFragment extends DialogFragment {
    
    /**
     * will set from Activity
     */
    View.OnClickListener mButtonClick;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(STYLE_NO_TITLE, 0);
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog, container, false);
    }
    
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // set listener to buttons
        view.findViewById(android.R.id.button1).setOnClickListener(mButtonClick);
        view.findViewById(android.R.id.button2).setOnClickListener(mButtonClick);
    }
    
    /**
     * set a click listener to buttons
     * @param l
     */
    public void setButtonListener(View.OnClickListener l){
        mButtonClick = l;
    }
}
