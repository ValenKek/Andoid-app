package com.example.lr2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CompanyListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_list);
        AdapterView.OnItemClickListener listener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name=((ProductName) adapterView.getItemAtPosition(i)).toString();
                Intent intent=new Intent(CompanyListActivity.this,ProductActivity.class);
                intent.putExtra(ProductActivity.COMPANY_NAME,name);
                startActivity(intent);
            }
        };

        ListView listView=(ListView) findViewById(R.id.product_list);
        listView.setOnItemClickListener(listener);

        ArrayAdapter<ProductName> adapter=new ArrayAdapter<ProductName>(this,
                android.R.layout.simple_list_item_1,
                ProductName.getNames());
        listView.setAdapter(adapter);
    }

}