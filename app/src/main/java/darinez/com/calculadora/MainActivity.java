package darinez.com.calculadora;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


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
    Integer ans = 0 ;
    Integer typeOP;
    boolean existsfirstOP=false;
    boolean existsSecondOP=false;
    Button bcall;
    Button bans;

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

        bcall = (Button) findViewById(R.id.buttoncall);
        bcall.setOnClickListener(this);

        bans = (Button) findViewById(R.id.buttonans);
        bans.setOnClickListener(this);

        screen = (TextView) findViewById(R.id.screen);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onSaveInstanceState(Bundle outstate){
        super.onSaveInstanceState(outstate);
        outstate.putInt("FirstOp", op1);
        outstate.putInt("SecondOp", op2);
        outstate.putInt("Result", result);
        String screenText = (screen.getText().toString());
        outstate.putString("Screen", screenText);
        outstate.putInt("typeOP", typeOP);
        outstate.putBoolean("existsfirstOP", existsfirstOP);
        outstate.putBoolean("existsSecondOP",existsSecondOP);
        Log.v("Info: ", "Guardando estado");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        op1 = savedInstanceState.getInt("FirstOp");
        op2 = savedInstanceState.getInt("SecondOp");
        result = savedInstanceState.getInt("result");
        typeOP = savedInstanceState.getInt("typeOp");
        existsfirstOP = savedInstanceState.getBoolean("existsfirstOP");
        existsSecondOP = savedInstanceState.getBoolean("existsSecondOP");
        String screenText = savedInstanceState.getString("Screen");
        screen.setText(screenText);
        Log.v("Info: ", "Recuperando estado");
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
                if(!existsfirstOP) {
                    op1= op1*10+2;
                    screen.setText(op1.toString());
                    break;
                }
                else {
                    op2= op2*10+2;
                    screen.setText(op2.toString());
                    break;
                }
            case R.id.button3:
                if(!existsfirstOP) {
                    op1= op1*10+3;
                    screen.setText(op1.toString());
                    break;
                }
                else {
                    op2= op2*10+3;
                    screen.setText(op2.toString());
                    break;
                }
            case R.id.button4:
                if(!existsfirstOP) {
                    op1= op1*10+4;
                    screen.setText(op1.toString());
                    break;
                }
                else {
                    op2= op2*10+4;
                    screen.setText(op2.toString());
                    break;
                }
            case R.id.button5:
                if(!existsfirstOP) {
                    op1= op1*10+5;
                    screen.setText(op1.toString());
                    break;
                }
                else {
                    op2= op2*10+5;
                    screen.setText(op2.toString());
                    break;
                }
            case R.id.button6:
                if(!existsfirstOP) {
                    op1= op1*10+6;
                    screen.setText(op1.toString());
                    break;
                }
                else {
                    op2= op2*10+6;
                    screen.setText(op2.toString());
                    break;
                }
            case R.id.button7:
                if(!existsfirstOP) {
                    op1= op1*10+7;
                    screen.setText(op1.toString());
                    break;
                }
                else {
                    op2= op2*10+7;
                    screen.setText(op2.toString());
                    break;
                }
            case R.id.button8:
                if(!existsfirstOP) {
                    op1= op1*10+8;
                    screen.setText(op1.toString());
                    break;
                }
                else {
                    op2= op2*10+8;
                    screen.setText(op2.toString());
                    break;
                }
            case R.id.button9:
                if(!existsfirstOP) {
                    op1= op1*10+9;
                    screen.setText(op1.toString());
                    break;
                }
                else {
                    op2= op2*10+9;
                    screen.setText(op2.toString());
                    break;
                }
            case R.id.buttonsum:
                if(op1!=0 && op1!=null) existsfirstOP=true;
                if(op2!=0 && op2!=null) existsSecondOP=true;
                if(existsfirstOP && existsSecondOP) {
                    op1=op1+op2;
                    op2=0;
                }
                typeOP=1;
                break;
            case R.id.buttonresta:
                if(op1!=0 && op1!=null) existsfirstOP=true;
                if(op2!=0 && op2!=null) existsSecondOP=true;
                if(existsfirstOP && existsSecondOP) {
                    op1=op1-op2;
                    op2=0;
                }
                typeOP=2;
                break;
            case R.id.buttondiv:
                if(op1!=0 && op1!=null) existsfirstOP=true;
                if(op2!=0 && op2!=null) existsSecondOP=true;
                if(existsfirstOP && existsSecondOP) {
                    op1=op1/op2;
                    op2=0;
                }
                typeOP=3;
                break;
            case R.id.buttonmult:
                if(op1!=0 && op1!=null) existsfirstOP=true;
                if(op2!=0 && op2!=null) existsSecondOP=true;
                if(existsfirstOP && existsSecondOP) {
                    op1=op1*op2;
                    op2=0;
                }
                typeOP=4;
                break;
            case R.id.buttoneq:
                if(typeOP==1) result=suma(op1,op2);
                if(typeOP==2) result=resta(op1,op2);
                if(typeOP==3) result=div(op1, op2);
                if(typeOP==4) result=mult(op1, op2);
                screen.setText(result.toString());
                op1=0;
                op2=0;
                typeOP=0;
                existsfirstOP=false;
                break;
            case R.id.buttonac:
                ac();
                break;
            case R.id.buttonans:
                screen.setText(ans.toString());
                if(!existsfirstOP) op1=ans;
                else if(!existsSecondOP) op2=ans;
                break;
            case R.id.buttoncall:
                call();
                break;
            default:
                break;
        }
    }

    public void call() {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:934137660"));
        startActivity(intent);
    }

    public void ac() {
        op1=0;
        op2=0;
        if(result!=0) ans=result;
        result=0;
        screen.setText("0");
    }

    public int suma(int op1, int op2) {
        return op1+op2;
    }

    public int resta(int op1, int op2) {
        return op1-op2;
    }

    public int mult(int op1, int op2) {
        return op1*op2;
    }

    public int div(int ope1, int ope2) {
        if(ope1!=0 && ope2!=0) {
            return ope1/ope2;
        }
        else {
            op1=0;
            op2=0;
            Toast.makeText(MainActivity.this,"Error: Divendendo = 0", Toast.LENGTH_SHORT).show();
            return 0;
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
