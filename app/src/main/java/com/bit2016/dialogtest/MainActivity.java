package com.bit2016.dialogtest;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        Dialog dialog = new Dialog(this);

        dialog.setContentView(R.layout.dialog_test);
        dialog.setTitle("Dialog Test");
        dialog.show();
    }

}
