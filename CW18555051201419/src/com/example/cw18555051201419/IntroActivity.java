package com.example.cw18555051201419;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class IntroActivity extends ListActivity {
	//	Change ActionBarActivity to ListActivity to use onListItemClick()
	public static Coffee coffee[];
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_intro);
		// Disable activity_intro then replace with ListView
		coffee = new Coffee[]{
				new Coffee(R.drawable.c1, "Espresso", 60),
				new Coffee(R.drawable.c2, "Americano", 65),
				new Coffee(R.drawable.c3, "Cappucino", 70),
				new Coffee(R.drawable.c4, "Latte", 75),
				new Coffee(R.drawable.c5, "Mocha", 80),
				new Coffee(R.drawable.c6, "Caramel Macchiato", 55),
				new Coffee(R.drawable.c7, "Coming Soon..", 0),
				new Coffee(R.drawable.c8, "Coming Soon..", 0),
				new Coffee(R.drawable.c9, "Coming Soon..", 0),
				new Coffee(R.drawable.c10, "Coming Soon..", 0),
				new Coffee(R.drawable.c11, "Coming Soon..", 0),
				new Coffee(R.drawable.c12, "Coming Soon..", 0)
		};
		CoffeeAdapter adapter = new CoffeeAdapter(this, R.layout.item,coffee);
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		// super.onListItemClick(l, v, position, id);
		String name;
		int price, imageId;
		Intent in = null;
		
		switch(position){
			case 0:
				//Espresso
				in = new Intent(this, Item1Activity.class);
				name = coffee[position].getCoffeeName();
				price = coffee[position].getCoffeePrice();
				imageId = coffee[position].getImageId();
				in.putExtra("name", name);
				in.putExtra("price", price);
				in.putExtra("imageId", imageId);
				startActivity(in);
				break;
			case 1:
				//Americano
				in = new Intent(this, Item1Activity.class);
				name = coffee[position].getCoffeeName();
				price = coffee[position].getCoffeePrice();
				imageId = coffee[position].getImageId();
				in.putExtra("name", name);
				in.putExtra("price", price);
				in.putExtra("imageId", imageId);
				startActivity(in);
				break;
			case 2:
				//Cappucino
				in = new Intent(this, Item1Activity.class);
				name = coffee[position].getCoffeeName();
				price = coffee[position].getCoffeePrice();
				imageId = coffee[position].getImageId();
				in.putExtra("name", name);
				in.putExtra("price", price);
				in.putExtra("imageId", imageId);
				startActivity(in);
				break;
			case 3:
				//Latte
				in = new Intent(this, Item1Activity.class);
				name = coffee[position].getCoffeeName();
				price = coffee[position].getCoffeePrice();
				imageId = coffee[position].getImageId();
				in.putExtra("name", name);
				in.putExtra("price", price);
				in.putExtra("imageId", imageId);
				startActivity(in);
				break;
			case 4:
				//Mocha
				in = new Intent(this, Item1Activity.class);
				name = coffee[position].getCoffeeName();
				price = coffee[position].getCoffeePrice();
				imageId = coffee[position].getImageId();
				in.putExtra("name", name);
				in.putExtra("price", price);
				in.putExtra("imageId", imageId);
				startActivity(in);
				break;
			case 5:
				//Caramel Macchiato
				in = new Intent(this, Item1Activity.class);
				name = coffee[position].getCoffeeName();
				price = coffee[position].getCoffeePrice();
				imageId = coffee[position].getImageId();
				in.putExtra("name", name);
				in.putExtra("price", price);
				in.putExtra("imageId", imageId);
				startActivity(in);
				break;
			default:
				break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.intro, menu);
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
