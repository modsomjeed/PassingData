package th.ac.pim.passingdata;

import com.example.passingdata.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener{

	Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }
 
    @Override
    public void onClick(View view) {
 
        // 1. create an intent pass class name or intnet action name 
        Intent intent = new Intent(this,ShowDataActivity.class);
 
        // 2. put key/value data
        EditText et = (EditText)findViewById(R.id.Text1);
        intent.putExtra("message1", et.getText().toString());
        
        EditText et1 = (EditText)findViewById(R.id.Text2);
        intent.putExtra("message2", et1.getText().toString());
        
 
        // 3. or you can add data to a bundle
        Bundle extras = new Bundle();
        extras.putString("status", "Data Received!");
 
        // 4. add bundle to intent
        intent.putExtras(extras);
 
        // 5. start the activity
        startActivity(intent);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
