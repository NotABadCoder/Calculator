package com.example.calculator_2;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView editTextMarksObtained1;
    private AutoCompleteTextView editTextTotalMarks1;

    private AutoCompleteTextView editTextMarksObtained2;
    private AutoCompleteTextView editTextTotalMarks2;

    private AutoCompleteTextView editTextMarksObtained3;
    private AutoCompleteTextView editTextTotalMarks3;

    private AutoCompleteTextView editTextMarksObtained4;
    private AutoCompleteTextView editTextTotalMarks4;

    private AutoCompleteTextView editTextMarksObtained5;
    private AutoCompleteTextView editTextTotalMarks5;


    private AutoCompleteTextView editTextMarksObtained6;
    private AutoCompleteTextView editTextTotalMarks6;


    private AutoCompleteTextView editTextMarksObtained7;
    private AutoCompleteTextView editTextTotalMarks7;


    private AutoCompleteTextView editTextMarksObtained8;
    private AutoCompleteTextView editTextTotalMarks8;

    private AutoCompleteTextView editTextMarksObtained9;
    private AutoCompleteTextView editTextTotalMarks9;


    private AutoCompleteTextView editTextMarksObtained10;
    private AutoCompleteTextView editTextTotalMarks10;

    private AutoCompleteTextView editTextMarksObtained11;
    private AutoCompleteTextView editTextTotalMarks11;

    private AutoCompleteTextView editTextMarksObtained12;
    private AutoCompleteTextView editTextTotalMarks12;

    private AutoCompleteTextView editTextMarksObtained13;
    private AutoCompleteTextView editTextTotalMarks13;

    private AutoCompleteTextView editTextMarksObtained14;
    private AutoCompleteTextView editTextTotalMarks14;

    private AutoCompleteTextView editTextMarksObtained15;
    private AutoCompleteTextView editTextTotalMarks15;


    private TextView textViewTextMarksObtainedfinal;
    private TextView textViewTotalMarksfinal;
    private TextView textViewPercentagefinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMarksObtained1 = findViewById(R.id.editTextMarksObtained1);
        editTextTotalMarks1 = findViewById(R.id.editTextTotalMarks1);

        editTextMarksObtained2 = findViewById(R.id.editTextMarksObtained2);
        editTextTotalMarks2 = findViewById(R.id.editTextTotalMarks2);

        editTextMarksObtained3 = findViewById(R.id.editTextMarksObtained3);
        editTextTotalMarks3 = findViewById(R.id.editTextTotalMarks3);

        editTextMarksObtained4 = findViewById(R.id.editTextMarksObtained4);
        editTextTotalMarks4 = findViewById(R.id.editTextTotalMarks4);

        editTextMarksObtained5 = findViewById(R.id.editTextMarksObtained5);
        editTextTotalMarks5 = findViewById(R.id.editTextTotalMarks5);

        editTextMarksObtained6 = findViewById(R.id.editTextMarksObtained6);
        editTextTotalMarks6 = findViewById(R.id.editTextTotalMarks6);

        editTextMarksObtained7 = findViewById(R.id.editTextMarksObtained7);
        editTextTotalMarks7 = findViewById(R.id.editTextTotalMarks7);

        editTextMarksObtained8 = findViewById(R.id.editTextMarksObtained8);
        editTextTotalMarks8 = findViewById(R.id.editTextTotalMarks8);

        editTextMarksObtained9 = findViewById(R.id.editTextMarksObtained9);
        editTextTotalMarks9 = findViewById(R.id.editTextTotalMarks9);

        editTextMarksObtained10 = findViewById(R.id.editTextMarksObtained10);
        editTextTotalMarks10 = findViewById(R.id.editTextTotalMarks10);

        editTextMarksObtained11 = findViewById(R.id.editTextMarksObtained11);
        editTextTotalMarks11 = findViewById(R.id.editTextTotalMarks11);

        editTextMarksObtained12 = findViewById(R.id.editTextMarksObtained12);
        editTextTotalMarks12 = findViewById(R.id.editTextTotalMarks12);

        editTextMarksObtained13 = findViewById(R.id.editTextMarksObtained13);
        editTextTotalMarks13 = findViewById(R.id.editTextTotalMarks13);

        editTextMarksObtained14 = findViewById(R.id.editTextMarksObtained14);
        editTextTotalMarks14 = findViewById(R.id.editTextTotalMarks14);

        editTextMarksObtained15 = findViewById(R.id.editTextMarksObtained15);
        editTextTotalMarks15 = findViewById(R.id.editTextTotalMarks15);
        // Create an array of options from 0 to 100
        String[] options = new String[101];
        for (int i = 0; i <= 100; i++) {
            options[i] = String.valueOf(i);
        }

        // Create an ArrayAdapter with the options
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.custom_popup_menu_item, options);

        // Set the adapter to the AutoCompleteTextView
        editTextMarksObtained1.setAdapter(adapter);
        editTextMarksObtained1.setAdapter(adapter);
        editTextMarksObtained1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                editTextMarksObtained1.setText(selectedItem);
            }
        });
        editTextMarksObtained2.setAdapter(adapter);
        editTextMarksObtained3.setAdapter(adapter);
        editTextMarksObtained4.setAdapter(adapter);
        editTextMarksObtained5.setAdapter(adapter);
        editTextMarksObtained6.setAdapter(adapter);
        editTextMarksObtained7.setAdapter(adapter);
        editTextMarksObtained8.setAdapter(adapter);
        editTextMarksObtained9.setAdapter(adapter);
        editTextMarksObtained10.setAdapter(adapter);
        editTextMarksObtained11.setAdapter(adapter);
        editTextMarksObtained12.setAdapter(adapter);
        editTextMarksObtained13.setAdapter(adapter);
        editTextMarksObtained14.setAdapter(adapter);
        editTextMarksObtained15.setAdapter(adapter);

        editTextTotalMarks1.setAdapter(adapter);
        editTextTotalMarks2.setAdapter(adapter);
        editTextTotalMarks3.setAdapter(adapter);
        editTextTotalMarks4.setAdapter(adapter);
        editTextTotalMarks5.setAdapter(adapter);
        editTextTotalMarks6.setAdapter(adapter);
        editTextTotalMarks7.setAdapter(adapter);
        editTextTotalMarks8.setAdapter(adapter);
        editTextTotalMarks9.setAdapter(adapter);
        editTextTotalMarks10.setAdapter(adapter);
        editTextTotalMarks11.setAdapter(adapter);
        editTextTotalMarks12.setAdapter(adapter);
        editTextTotalMarks13.setAdapter(adapter);
        editTextTotalMarks14.setAdapter(adapter);
        editTextTotalMarks15.setAdapter(adapter);

        Button buttonClearMarks = findViewById(R.id.buttonClearMarks);
        buttonClearMarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextMarksObtained1.setText("");
                editTextMarksObtained2.setText("");
                editTextMarksObtained3.setText("");
                editTextMarksObtained4.setText("");
                editTextMarksObtained5.setText("");
                editTextMarksObtained6.setText("");
                editTextMarksObtained7.setText("");
                editTextMarksObtained8.setText("");
                editTextMarksObtained9.setText("");
                editTextMarksObtained10.setText("");
                editTextMarksObtained11.setText("");
                editTextMarksObtained12.setText("");
                editTextMarksObtained13.setText("");
                editTextMarksObtained14.setText("");
                editTextMarksObtained15.setText("");

                // Update cumulative values
                updateCumulativeValues();
            }
        });
        Button buttonClearAll = findViewById(R.id.buttonClearAll);
        buttonClearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextMarksObtained1.setText("");
                editTextTotalMarks1.setText("");
                editTextMarksObtained2.setText("");
                editTextTotalMarks2.setText("");
                editTextMarksObtained3.setText("");
                editTextTotalMarks3.setText("");
                editTextMarksObtained4.setText("");
                editTextTotalMarks4.setText("");
                editTextMarksObtained5.setText("");
                editTextTotalMarks5.setText("");
                editTextMarksObtained6.setText("");
                editTextTotalMarks6.setText("");
                editTextMarksObtained7.setText("");
                editTextTotalMarks7.setText("");
                editTextMarksObtained8.setText("");
                editTextTotalMarks8.setText("");
                editTextMarksObtained9.setText("");
                editTextTotalMarks9.setText("");
                editTextMarksObtained10.setText("");
                editTextTotalMarks10.setText("");
                editTextMarksObtained11.setText("");
                editTextTotalMarks11.setText("");
                editTextMarksObtained12.setText("");
                editTextTotalMarks12.setText("");
                editTextMarksObtained13.setText("");
                editTextTotalMarks13.setText("");
                editTextMarksObtained14.setText("");
                editTextTotalMarks14.setText("");
                editTextMarksObtained15.setText("");
                editTextTotalMarks15.setText("");
                // Update cumulative values
                updateCumulativeValues();
            }
        });


        textViewTextMarksObtainedfinal = findViewById(R.id.textViewTextMarksObtainedfinal);
        textViewTotalMarksfinal = findViewById(R.id.textViewTotalMarksfinal);
        textViewPercentagefinal = findViewById(R.id.textViewPercentagefinal);
        // Add text change listeners to calculate the percentage
        editTextMarksObtained1.addTextChangedListener(new PercentageTextWatcher());
        editTextTotalMarks1.addTextChangedListener(new PercentageTextWatcher());
        editTextMarksObtained2.addTextChangedListener(new PercentageTextWatcher());
        editTextTotalMarks2.addTextChangedListener(new PercentageTextWatcher());
        editTextMarksObtained3.addTextChangedListener(new PercentageTextWatcher());
        editTextTotalMarks3.addTextChangedListener(new PercentageTextWatcher());
        editTextMarksObtained4.addTextChangedListener(new PercentageTextWatcher());
        editTextTotalMarks4.addTextChangedListener(new PercentageTextWatcher());
        editTextMarksObtained5.addTextChangedListener(new PercentageTextWatcher());
        editTextTotalMarks5.addTextChangedListener(new PercentageTextWatcher());
        editTextMarksObtained6.addTextChangedListener(new PercentageTextWatcher());
        editTextTotalMarks6.addTextChangedListener(new PercentageTextWatcher());
        editTextMarksObtained7.addTextChangedListener(new PercentageTextWatcher());
        editTextTotalMarks7.addTextChangedListener(new PercentageTextWatcher());
        editTextMarksObtained8.addTextChangedListener(new PercentageTextWatcher());
        editTextTotalMarks8.addTextChangedListener(new PercentageTextWatcher());
        editTextMarksObtained9.addTextChangedListener(new PercentageTextWatcher());
        editTextTotalMarks9.addTextChangedListener(new PercentageTextWatcher());
        editTextMarksObtained10.addTextChangedListener(new PercentageTextWatcher());
        editTextTotalMarks10.addTextChangedListener(new PercentageTextWatcher());
        editTextMarksObtained11.addTextChangedListener(new PercentageTextWatcher());
        editTextTotalMarks11.addTextChangedListener(new PercentageTextWatcher());
        editTextMarksObtained12.addTextChangedListener(new PercentageTextWatcher());
        editTextTotalMarks12.addTextChangedListener(new PercentageTextWatcher());
        editTextMarksObtained13.addTextChangedListener(new PercentageTextWatcher());
        editTextTotalMarks13.addTextChangedListener(new PercentageTextWatcher());
        editTextMarksObtained14.addTextChangedListener(new PercentageTextWatcher());
        editTextTotalMarks14.addTextChangedListener(new PercentageTextWatcher());
        editTextMarksObtained15.addTextChangedListener(new PercentageTextWatcher());
        editTextTotalMarks15.addTextChangedListener(new PercentageTextWatcher());
    }

    private class PercentageTextWatcher implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            // Not used
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            // Not used
        }

        @Override
        public void afterTextChanged(Editable editable) {
            calculatePercentage();

        }
    }
    private void updateCumulativeValues() {
        int number1 = 0;
        int number2 = 0;

        String marksObtainedStr = editTextMarksObtained1.getText().toString();
        String totalMarksStr = editTextTotalMarks1.getText().toString();

        if (!marksObtainedStr.isEmpty() && !totalMarksStr.isEmpty()) {
            int marksObtained = Integer.parseInt(marksObtainedStr);
            int totalMarks = Integer.parseInt(totalMarksStr);
            number1 += marksObtained;
            number2 += totalMarks;
        }

        // Repeat the above code for the remaining EditText fields (2 to 6)
        marksObtainedStr = editTextMarksObtained2.getText().toString();
        totalMarksStr = editTextTotalMarks2.getText().toString();

        if (!marksObtainedStr.isEmpty() && !totalMarksStr.isEmpty()) {
            int marksObtained = Integer.parseInt(marksObtainedStr);
            int totalMarks = Integer.parseInt(totalMarksStr);
            number1+=marksObtained;
            number2+=totalMarks;
        }
        marksObtainedStr = editTextMarksObtained3.getText().toString();
        totalMarksStr = editTextTotalMarks3.getText().toString();

        if (!marksObtainedStr.isEmpty() && !totalMarksStr.isEmpty()) {
            int marksObtained = Integer.parseInt(marksObtainedStr);
            int totalMarks = Integer.parseInt(totalMarksStr);
            number1+=marksObtained;
            number2+=totalMarks;
        }
        marksObtainedStr = editTextMarksObtained4.getText().toString();
        totalMarksStr = editTextTotalMarks4.getText().toString();

        if (!marksObtainedStr.isEmpty() && !totalMarksStr.isEmpty()) {
            int marksObtained = Integer.parseInt(marksObtainedStr);
            int totalMarks = Integer.parseInt(totalMarksStr);
            number1+=marksObtained;
            number2+=totalMarks;
        }
        marksObtainedStr = editTextMarksObtained5.getText().toString();
        totalMarksStr = editTextTotalMarks5.getText().toString();

        if (!marksObtainedStr.isEmpty() && !totalMarksStr.isEmpty()) {
            int marksObtained = Integer.parseInt(marksObtainedStr);
            int totalMarks = Integer.parseInt(totalMarksStr);
            number1+=marksObtained;
            number2+=totalMarks;
        }
        marksObtainedStr = editTextMarksObtained6.getText().toString();
        totalMarksStr = editTextTotalMarks6.getText().toString();

        if (!marksObtainedStr.isEmpty() && !totalMarksStr.isEmpty()) {
            int marksObtained = Integer.parseInt(marksObtainedStr);
            int totalMarks = Integer.parseInt(totalMarksStr);
            number1+=marksObtained;
            number2+=totalMarks;
        }
        marksObtainedStr = editTextMarksObtained7.getText().toString();
        totalMarksStr = editTextTotalMarks7.getText().toString();

        if (!marksObtainedStr.isEmpty() && !totalMarksStr.isEmpty()) {
            int marksObtained = Integer.parseInt(marksObtainedStr);
            int totalMarks = Integer.parseInt(totalMarksStr);
            number1 += marksObtained;
            number2 += totalMarks;
        }

        // Repeat the above code for the remaining EditText fields (2 to 6)
        marksObtainedStr = editTextMarksObtained8.getText().toString();
        totalMarksStr = editTextTotalMarks8.getText().toString();

        if (!marksObtainedStr.isEmpty() && !totalMarksStr.isEmpty()) {
            int marksObtained = Integer.parseInt(marksObtainedStr);
            int totalMarks = Integer.parseInt(totalMarksStr);
            number1+=marksObtained;
            number2+=totalMarks;
        }
        marksObtainedStr = editTextMarksObtained9.getText().toString();
        totalMarksStr = editTextTotalMarks9.getText().toString();

        if (!marksObtainedStr.isEmpty() && !totalMarksStr.isEmpty()) {
            int marksObtained = Integer.parseInt(marksObtainedStr);
            int totalMarks = Integer.parseInt(totalMarksStr);
            number1+=marksObtained;
            number2+=totalMarks;
        }
        marksObtainedStr = editTextMarksObtained10.getText().toString();
        totalMarksStr = editTextTotalMarks10.getText().toString();

        if (!marksObtainedStr.isEmpty() && !totalMarksStr.isEmpty()) {
            int marksObtained = Integer.parseInt(marksObtainedStr);
            int totalMarks = Integer.parseInt(totalMarksStr);
            number1+=marksObtained;
            number2+=totalMarks;
        }
        marksObtainedStr = editTextMarksObtained11.getText().toString();
        totalMarksStr = editTextTotalMarks11.getText().toString();

        if (!marksObtainedStr.isEmpty() && !totalMarksStr.isEmpty()) {
            int marksObtained = Integer.parseInt(marksObtainedStr);
            int totalMarks = Integer.parseInt(totalMarksStr);
            number1+=marksObtained;
            number2+=totalMarks;
        }
        marksObtainedStr = editTextMarksObtained12.getText().toString();
        totalMarksStr = editTextTotalMarks12.getText().toString();

        if (!marksObtainedStr.isEmpty() && !totalMarksStr.isEmpty()) {
            int marksObtained = Integer.parseInt(marksObtainedStr);
            int totalMarks = Integer.parseInt(totalMarksStr);
            number1+=marksObtained;
            number2+=totalMarks;
        }
        marksObtainedStr = editTextMarksObtained13.getText().toString();
        totalMarksStr = editTextTotalMarks13.getText().toString();

        if (!marksObtainedStr.isEmpty() && !totalMarksStr.isEmpty()) {
            int marksObtained = Integer.parseInt(marksObtainedStr);
            int totalMarks = Integer.parseInt(totalMarksStr);
            number1+=marksObtained;
            number2+=totalMarks;
        }
        marksObtainedStr = editTextMarksObtained14.getText().toString();
        totalMarksStr = editTextTotalMarks14.getText().toString();

        if (!marksObtainedStr.isEmpty() && !totalMarksStr.isEmpty()) {
            int marksObtained = Integer.parseInt(marksObtainedStr);
            int totalMarks = Integer.parseInt(totalMarksStr);
            number1+=marksObtained;
            number2+=totalMarks;
        }
        marksObtainedStr = editTextMarksObtained15.getText().toString();
        totalMarksStr = editTextTotalMarks15.getText().toString();

        if (!marksObtainedStr.isEmpty() && !totalMarksStr.isEmpty()) {
            int marksObtained = Integer.parseInt(marksObtainedStr);
            int totalMarks = Integer.parseInt(totalMarksStr);
            number1+=marksObtained;
            number2+=totalMarks;
        }
        if (number2 != 0) {
            textViewTextMarksObtainedfinal.setText(String.valueOf(number1));
            textViewTotalMarksfinal.setText(String.valueOf(number2));
            double percentage = (number1 * 100.0) / number2;
            textViewPercentagefinal.setText(String.format("%.2f", percentage));
        } else {
            textViewTextMarksObtainedfinal.setText("");
            textViewTotalMarksfinal.setText("");
            textViewPercentagefinal.setText("");
        }
    }
    private void calculatePercentage() {

        updateCumulativeValues();
    }


}

