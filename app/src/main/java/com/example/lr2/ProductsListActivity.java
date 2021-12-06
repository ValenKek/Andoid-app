package com.example.lr2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class ProductsListActivity extends AppCompatActivity {
    public static final String COMPANY_NAME="companyname";
    private float textSize=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_list);
        Intent intent=getIntent();
        String cmp=intent.getStringExtra(COMPANY_NAME);
        ListView listView=(ListView) findViewById(R.id.product_list);
        ArrayAdapter<ProductName> adapter= new ArrayAdapter<ProductName>(this, android.R.layout.simple_list_item_1, (List<ProductName>) ProductName.getProductsName(cmp));
        listView.setAdapter(adapter);
    }
    public void onSendBtnClick(View view){
        TextView textView=(TextView) findViewById(R.id.text);

        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,textView.getText().toString());
        intent.putExtra(Intent.EXTRA_SUBJECT,"Список обладнання");
        startActivity(intent);
    }


}

