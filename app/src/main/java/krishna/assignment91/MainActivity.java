package krishna.assignment91;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import static krishna.assignment91.R.color.Red;

public class MainActivity extends AppCompatActivity {

    TextView text;
//specifying xxml
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();
    }

    @Override//creating menu on application bar
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.mainmenu, menu);

        return true;
    }

    //describing items on menu
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.redcolor:
                text = (TextView) findViewById(R.id.text);
                text.setTextColor(ContextCompat.getColor(this, R.color.Red));
                break;


            case R.id.greencolor:
                text = (TextView) findViewById(R.id.text);
                text.setTextColor(ContextCompat.getColor(this, R.color.Green));

                //text.setBackgroundColor(getResources().getColor(Red));
                break;


            case R.id.bluecolor:
                text = (TextView) findViewById(R.id.text);

                text.setTextColor(ContextCompat.getColor(this, R.color.Blue))
                ;
                break;


        }
        return super.onOptionsItemSelected(item);

    }
}

