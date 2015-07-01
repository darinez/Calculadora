package darinez.com.calculadora;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    Button b0;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button bsum;
    Button brest;
    Button bmult;
    Button bdiv;
    Button bequ;
    TextView screen;
    Integer op1;
    Integer op2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(this);

        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(this);

        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(this);

        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(this);

        b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(this);

        b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener(this);

        b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener(this);

        b8 = (Button) findViewById(R.id.button8);
        b8.setOnClickListener(this);

        b9 = (Button) findViewById(R.id.button9);
        b9.setOnClickListener(this);

        bsum = (Button) findViewById(R.id.buttonsum);
        bsum.setOnClickListener(this);

        brest = (Button) findViewById(R.id.buttonresta);
        brest.setOnClickListener(this);

        bdiv = (Button) findViewById(R.id.buttondiv);
        bdiv.setOnClickListener(this);

        bmult = (Button) findViewById(R.id.buttonmult);
        bmult.setOnClickListener(this);

        bequ = (Button) findViewById(R.id.buttoneq);
        bequ.setOnClickListener(this);

        screen = (TextView) findViewById(R.id.screen);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                screen.setText("1");
                break;
            case R.id.button2:

                break;
            case R.id.button3:

                break;
            case R.id.button4:

                break;
            case R.id.button5:

                break;
            case R.id.button6:

                break;
            case R.id.button7:

                break;
            case R.id.button8:

                break;
            case R.id.button9:

                break;
            case R.id.buttonsum:

                break;
            case R.id.buttonresta:

                break;
            case R.id.buttondiv:

                break;
            case R.id.buttonmult:

                break;
            case R.id.buttoneq:

                break;
            default:
                break;
        }
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
}
