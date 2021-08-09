package com.unicoders.learn16;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        switch(view.getId()) {
            case R.id.btn_success:
                Toasty.success(this, "Success Toast", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_error:
                Toasty.error(this, "Error Toast", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_info:
                Toasty.info(this, "Info Toast", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_warning:
                Toasty.warning(this, "Warning Toast", Toast.LENGTH_LONG).show();
                break;
            default:
                Toasty.normal(this, "Normal Toast with icon", Toast.LENGTH_LONG, ContextCompat.getDrawable(this, R.drawable.ic_android_black_24dp)).show();
                break;
        }
    }
}