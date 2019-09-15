package com.example.viewcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ViewControl extends AppCompatActivity {
    Button btnDangki;
    EditText etName, etPass, etPhoneNumber;
    CheckBox chOk;
    SeekBar seeBar;
    RatingBar ratingBar;
    ToggleButton toggleButton;
    Switch aSwitch;
    String name;
    String pass;
    String phoneNumber;
    String textdieukhoan;
    boolean iABoolean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_control);

        btnDangki = findViewById(R.id.btnDangKi);
        etName = findViewById(R.id.etName);
        etPass = findViewById(R.id.etPass);
        etPhoneNumber = findViewById(R.id.etPhoneNumber);
        chOk = findViewById(R.id.cbOk);
        seeBar = findViewById(R.id.seeBar);
        ratingBar = findViewById(R.id.ratingBar);
        toggleButton = findViewById(R.id.toggleBtn);
        aSwitch = findViewById(R.id.switchNew);

        btnDangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = etName.getText().toString();
                pass = etPass.getText().toString();
                phoneNumber = etPhoneNumber.getText().toString();
                iABoolean = chOk.isChecked();
                if (iABoolean) textdieukhoan = getString(R.string.checkbox_ok);
                else textdieukhoan = getString(R.string.checkbox_cancel);

                int age = seeBar.getProgress();
                float rating = ratingBar.getRating();
                String togg = toggleButton.isChecked() ? "ON" : "OFF";
                String strs = aSwitch.isChecked() ? "Mở" : "Đóng";

                Toast.makeText(getBaseContext(), name + "\n" + pass + "\n" + phoneNumber +
                                "\n" + textdieukhoan + "\n" + "Tuoi: " + age + "\n" + "Rating: " + rating
                                + "\n" + "ToggleButton: " + togg + "\n" + "Switch: " + strs
                        , Toast.LENGTH_LONG).show();
            }
        });
    }
}
