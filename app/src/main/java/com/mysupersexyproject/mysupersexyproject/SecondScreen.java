package com.mysupersexyproject.mysupersexyproject;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class SecondScreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        String editMessageTEXT1 = getIntent().getStringExtra("editMessageTEXT1");
        String editMessageTEXT2 = getIntent().getStringExtra("editMessageTEXT2");
        String editMessageTEXT3 = getIntent().getStringExtra("editMessageTEXT3");

        TextView hello2 = (TextView) findViewById(R.id.hello2);
        hello2.setText("Hello, " + editMessageTEXT1 + "!\n\nIt seems that you like " + editMessageTEXT2 + ", but dislike " + editMessageTEXT3 + ". \n\nThank you for sharing that. Very interesting!");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void sendBack(View view) {
        Intent intent = new Intent(this, MyActivity.class);


        startActivity(intent);
    }
}
