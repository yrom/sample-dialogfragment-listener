
package net.yrom.example.dialogfragment;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("@@@", "onCreate() "+savedInstanceState);
        if(savedInstanceState != null){
            MyDialogFragment dialog = (MyDialogFragment) getFragmentManager()
                    .findFragmentByTag("dialog");
            if(dialog != null)
                dialog.setButtonListener(aListener);
        }
        setContentView(R.layout.activity_main);
    }

    View.OnClickListener aListener = new View.OnClickListener(){
        
        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), ((Button)v).getText()+" click!", Toast.LENGTH_SHORT).show();
        }
    };
    
    public void showDialog(View v){
        MyDialogFragment dialog = new MyDialogFragment();
        dialog.setButtonListener(aListener);
        dialog.show(getFragmentManager(), "dialog");
    }
    
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("@@@", "onSaveInstanceState(): "+outState);
    }
}

