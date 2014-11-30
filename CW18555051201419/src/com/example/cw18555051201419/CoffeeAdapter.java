package com.example.cw18555051201419;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CoffeeAdapter extends ArrayAdapter<Coffee> {
	//	Create ArrayAdapter as ArrayAdapter of <Coffee> to put data to item.xml
	Context context;
	int itemLayoutId;
	Coffee coff[] = null;
	
	public CoffeeAdapter(Context context, int itemLayoutId, Coffee[] coff) {
		super(context, itemLayoutId, coff);
		this.context = context;
		this.itemLayoutId = itemLayoutId;
		this.coff = coff;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = ((Activity)context).getLayoutInflater();
		View item = inflater.inflate(itemLayoutId, parent,false);
		
		ImageView imgFlag = (ImageView) item.findViewById(R.id.flag_image);
		TextView txtCofName = (TextView) item.findViewById(R.id.coffee_name);
		TextView txtCofPrice = (TextView) item.findViewById(R.id.coffee_price);
		
		Coffee cf = coff[position];
		imgFlag.setImageResource(cf.getImageId());
		txtCofName.setText(cf.getCoffeeName());
		txtCofPrice.setText(""+cf.getCoffeePrice());
		
		return item;
		
	}

}
