package com.example.temp_converter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.temp_converter.databinding.ActivityMainBinding;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    /*
    fahrenheit to celcius formula:
    subtract 32 and multiply by .5556 (9/5)

    celcius to fahrenheit
    multiply by 1.8 and add 32
     */
    EditText inputF, inputC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                inputF = binding.inputF;
                String f = inputF.getText().toString();
                float fahren = Float.parseFloat(f);

                inputC = binding.inputC;
                String c = inputC.getText().toString();
                float celc = Float.parseFloat(c);

                float convertF = (fahren - 32) * (9/5);

                binding.inputF.setText((CharSequence) inputC);


                float convertC = (celc * (5/9)) + 32;

            }
        });
    }
}