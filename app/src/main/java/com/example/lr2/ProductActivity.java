package com.example.lr2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class ProductActivity extends AppCompatActivity {
public static final  String COMPANY_NAME="companyname";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_2);

        Intent intent=getIntent();
        String cmp=intent.getStringExtra(COMPANY_NAME);
        ProductName productName=ProductName.getProductsName(cmp);

        EditText txtCmp=(EditText) findViewById(R.id.companyEdit);
        txtCmp.setText(productName.getCompany());

        EditText txtProduct=(EditText) findViewById(R.id.productEdit);
        txtProduct.setText(productName.getName());

        if(productName.getLevel()==1){
            ((RadioButton)findViewById(R.id.level_GPU)).setChecked(true);
        }
        else ((RadioButton)findViewById(R.id.level_CPU)).setChecked(true);
        ((CheckBox)findViewById(R.id.Date_flg)).setChecked(productName.isExpirationDate());


    }
    public void onOkBtnClick(View view){
        String outString = "Назва" + ((TextView)findViewById(R.id.companyEdit)).getText() +"\n";
        outString+="Вироб"+((TextView)findViewById(R.id.productEdit)).getText()+"\n";
        if(((RadioButton)findViewById(R.id.level_GPU)).isChecked()){
            outString+="Тип - відеокарта \n";
        }
        else outString+="Тип - Процесор \n";
        if(((CheckBox)findViewById(R.id.Date_flg)).isChecked()){
            outString+="Є в наявності";
        }
        else outString+="Немає в наявності";

        Toast.makeText(this,outString,Toast.LENGTH_LONG).show();
}
public void onBtnProductListClick(View view){
        Intent localIntent=getIntent();
        String company=localIntent.getStringExtra(COMPANY_NAME);
        Intent Intent1 =new Intent(this,ProductsListActivity.class);
        Intent1.putExtra(ProductsListActivity.COMPANY_NAME,company);
        startActivity(Intent1);
}
}