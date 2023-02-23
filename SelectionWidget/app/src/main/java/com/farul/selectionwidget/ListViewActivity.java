package com.farul.selectionwidget;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormatSymbols;

public class ListViewActivity extends AppCompatActivity {

    ListView listViewMonth;
    String[] months;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listViewMonth = findViewById(R.id.lvMonth);
        months = new DateFormatSymbols().getMonths();
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,months);
        listViewMonth.setAdapter(monthAdapter);
        listViewMonth.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String month = ((TextView) view).getText().toString();
                Toast.makeText(getApplicationContext(), "Clicked "+month, Toast.LENGTH_SHORT).show();
            }
        });
    }
}