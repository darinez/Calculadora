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
    Button bac;
    TextView screen;
    Integer op1=0;
    Integer op2=0;
    Integer result=0;
    Integer typeOP;
    boolean existsfirstOP=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.button0);
        b0.setOnClickListener(this);

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

        bac = (Button) findViewById(R.id.buttonac);
        bac.setOnClickListener(this);

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
            case R.id.button0:
                if(!existsfirstOP) {
                    op1= op1*10;
                    screen.setText(op1.toString());
                    break;
                }
                else {
                    op2= op2*10;
                    screen.setText(op2.toString());
                    break;
                }
            case R.id.button1:
                if(!existsfirstOP) {
                    op1= op1*10+1;
                    screen.setText(op1.toString());
                    break;
                }
                else {
                    op2= op2*10+1;
                    screen.setText(op2.toString());
                    break;
                }
            case R.id.button2:
                op1= op1*10+2;
                screen.setText(op1.toString());
                break;
            case R.id.button3:
                op1= op1*10+3;
                screen.setText(op1.toString());
                break;
            case R.id.button4:
                op1= op1*10+4;
                screen.setText(op1.toString());
                break;
            case R.id.button5:
                op1= op1*10+5;
                screen.setText(op1.toString());
                break;
            case R.id.button6:
                op1= op1*10+6;
                screen.setText(op1.toString());
                break;
            case R.id.button7:
                op1= op1*10+7;
                screen.setText(op1.toString());
                break;
            case R.id.button8:
                op1= op1*10+8;
                screen.setText(op1.toString());
                break;
            case R.id.button9:
                op1= op1*10+9;
                screen.setText(op1.toString());
                break;
            case R.id.buttonsum:
                if(op1!=0 && op1!=null) existsfirstOP=true;
                screen.setText("0");
                typeOP=0;
                break;
            case R.id.buttonresta:
                resta(op1, op2);
                break;
            case R.id.buttondiv:
                div(op1, op2);
                break;
            case R.id.buttonmult:
                mult(op1, op2);
                break;
            case R.id.buttoneq:
                if(typeOP==0) result=suma(op1,op2);
                screen.setText(result.toString());
                break;
            case R.id.buttonac:
                ac();
                break;
            default:
                break;
        }
    }

    public void ac() {
        screen.setText("0");
    }

    public int suma(int op1, int op2) {
        return op1+op2;
    }

    public int resta(int op1, int op2) {
        return 1;
    }

    public int mult(int op1, int op2) {
        return 1;
    }

    public int div(int op1, int op2) {
        return 1;
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
