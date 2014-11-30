package com.example.cw18555051201419;

import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Item1Activity extends ActionBarActivity {

	EditText txtamt;
	EditText txttotal;
	TextView txtname;
	TextView txtprice;
	ImageView imvImageId;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_item1);
		txtamt = (EditText) this.findViewById(R.id.txtAmt);
		txttotal = (EditText) this.findViewById(R.id.txtTotal);
		txtname = (TextView) this.findViewById(R.id.txtName);
		txtprice = (TextView) this.findViewById(R.id.txtPrice);
		imvImageId = (ImageView) this.findViewById(R.id.imageView1);
		// Get data from Intent
		Intent in = getIntent();
		String name = in.getStringExtra("name");
		int price = in.getIntExtra("price", 0);
		int imageId = in.getIntExtra("imageId", 0);
		imvImageId.setImageResource(imageId);
		txtname.setText(name);
		txtprice.setText(""+price);
		
		txtamt.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				if (txtamt.getText().toString().equals("")) {
					txtamt.setText("0");
					txttotal.setText("0");
				} else {
					int amt = Integer.parseInt(txtamt.getText().toString());
					int price = Integer.parseInt(txtprice.getText().toString());
					txttotal.setText(""+(amt*price));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.item1, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
