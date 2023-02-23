package com.farul.selectionwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    private static final String[] HANDPHONES = new String[] {
            "Samsung", "Xiomi", "Redmi", "Razer", "Asus", "iPhone", "LG", "Oppo", "Vivo"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);

        AutoCompleteTextView editText = findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, HANDPHONES);
        editText.setAdapter(adapter);
    }
}