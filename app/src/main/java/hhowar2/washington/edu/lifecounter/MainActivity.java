package hhowar2.washington.edu.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity {
    //Player p1 = new Player();
    public int p1Counter = 20;
    public int p2Counter = 20;
    public int p3Counter = 20;
    public int p4Counter = 20;

    Button P1Plus1;
    Button P1Minus1;
    Button P1Minus5;
    Button P1Plus5;
    Button P2Plus1;
    Button P2Minus1;
    Button P2Plus5;
    Button P2Minus5;
    Button P3Plus1;
    Button P3Minus1;
    Button P3Plus5;
    Button P3Minus5;
    Button P4Plus1;
    Button P4Minus1;
    Button P4Plus5;
    Button P4Minus5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView)findViewById(R.id.P1LifeCount);
        myTextView.setText(p1Counter + "");
        P1Plus1 = (Button) findViewById(R.id.P1_Plus1);
        P1Minus1 = (Button) findViewById(R.id.P1_Minus1);
        P1Minus5 = (Button) findViewById(R.id.P1_Minus5);
        P1Plus5 = (Button) findViewById(R.id.P1_Plus5);
        P2Plus1 = (Button) findViewById(R.id.P2_Plus1);
        P2Minus1 = (Button) findViewById(R.id.P2Minus1);
        P2Minus5 = (Button) findViewById(R.id.P2Minus5);
        P2Plus5 = (Button) findViewById(R.id.P2Plus5);
        P3Plus1 = (Button) findViewById(R.id.P3_Plus1);
        P3Minus1 = (Button) findViewById(R.id.P3_Minus1);
        P3Minus5 = (Button) findViewById(R.id.P3_Minus5);
        P3Plus5 = (Button) findViewById(R.id.P3_Plus5);
        P4Plus1 = (Button) findViewById(R.id.P4_Plus1);
        P4Minus1 = (Button) findViewById(R.id.P4_Minus1);
        P4Minus5 = (Button) findViewById(R.id.P4_Minus5);
        P4Plus5 = (Button) findViewById(R.id.P4_Plus5);

        OnClickListener oclBtn = new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()) {
                    case(R.id.P1_Plus1):
                        Log.i("Plus1", "button was clicked");
                        TextView newTextView =
                                (TextView)findViewById(R.id.P1LifeCount);
                        newTextView.setText(p1Counter + 1 + "");
                        p1Counter++;
                        checkLifeCounter(p1Counter, "1");
                        break;
                    case(R.id.P1_Minus1):
                        Log.i("Minus1", "button was clicked");
                        newTextView =
                                (TextView)findViewById(R.id.P1LifeCount);
                        newTextView.setText(p1Counter - 1 + "");
                        p1Counter--;
                        checkLifeCounter(p1Counter, "1");
                        break;
                    case(R.id.P1_Plus5):
                         Log.i("Plus 5", "button was clicked");
                         newTextView =
                                 (TextView)findViewById(R.id.P1LifeCount);
                         newTextView.setText(p1Counter + 5 + "");
                         p1Counter = p1Counter + 5;
                        checkLifeCounter(p1Counter, "1");
                        break;
                    case(R.id.P1_Minus5):
                        Log.i("Minus1", "button was clicked");
                        newTextView =
                                (TextView)findViewById(R.id.P1LifeCount);
                        newTextView.setText(p1Counter - 5 + "");
                        p1Counter = p1Counter - 5;
                        checkLifeCounter(p1Counter, "1");
                        break;
                    case(R.id.P2_Plus1):
                        Log.i("Plus1", "button was clicked");
                        newTextView =
                                (TextView)findViewById(R.id.P2LifeCount);
                        newTextView.setText(p2Counter + 1 + "");
                        p2Counter++;
                        checkLifeCounter(p2Counter, "2");
                        break;
                    case(R.id.P2Minus1):
                        Log.i("Minus1", "button was clicked");
                        newTextView =
                                (TextView)findViewById(R.id.P2LifeCount);
                        newTextView.setText(p2Counter - 1 + "");
                        p2Counter--;
                        checkLifeCounter(p2Counter, "2");
                        break;
                    case(R.id.P2Plus5):
                        Log.i("Plus 5", "button was clicked");
                        newTextView =
                                (TextView)findViewById(R.id.P2LifeCount);
                        newTextView.setText(p2Counter + 5 + "");
                        p2Counter = p2Counter + 5;
                        checkLifeCounter(p2Counter, "2");
                        break;
                    case(R.id.P2Minus5):
                        Log.i("Minus1", "button was clicked");
                        newTextView =
                                (TextView)findViewById(R.id.P2LifeCount);
                        newTextView.setText(p2Counter - 5 + "");
                        p2Counter = p2Counter - 5;
                        checkLifeCounter(p2Counter, "2");
                        break;
                    case(R.id.P3_Plus1):
                        Log.i("Plus1", "button was clicked");
                        newTextView =
                                (TextView)findViewById(R.id.P3LifeCounter);
                        newTextView.setText(p3Counter + 1 + "");
                        p3Counter++;
                        checkLifeCounter(p3Counter, "3");
                        break;
                    case(R.id.P3_Minus1):
                        Log.i("Minus1", "button was clicked");
                        newTextView =
                                (TextView)findViewById(R.id.P3LifeCounter);
                        newTextView.setText(p3Counter - 1 + "");
                        p3Counter--;
                        checkLifeCounter(p3Counter, "3");
                        break;
                    case(R.id.P3_Plus5):
                        Log.i("Plus 5", "button was clicked");
                        newTextView =
                                (TextView)findViewById(R.id.P3LifeCounter);
                        newTextView.setText(p3Counter + 5 + "");
                        p3Counter = p3Counter + 5;
                        checkLifeCounter(p3Counter, "3");
                        break;
                    case(R.id.P3_Minus5):
                        Log.i("Minus1", "button was clicked");
                        newTextView =
                                (TextView)findViewById(R.id.P3LifeCounter);
                        newTextView.setText(p3Counter - 5 + "");
                        p3Counter = p3Counter - 5;
                        checkLifeCounter(p3Counter, "3");
                        break;
                    case(R.id.P4_Plus1):
                        Log.i("Plus1", "button was clicked");
                        newTextView =
                                (TextView)findViewById(R.id.P4LifeCounter);
                        newTextView.setText(p4Counter + 1 + "");
                        p4Counter++;
                        checkLifeCounter(p4Counter, "4");
                        break;
                    case(R.id.P4_Minus1):
                        Log.i("Minus1", "button was clicked");
                        newTextView =
                                (TextView)findViewById(R.id.P4LifeCounter);
                        newTextView.setText(p4Counter - 1 + "");
                        p4Counter--;
                        checkLifeCounter(p4Counter, "4");
                        break;
                    case(R.id.P4_Plus5):
                        Log.i("Plus 5", "button was clicked");
                        newTextView =
                                (TextView)findViewById(R.id.P4LifeCounter);
                        newTextView.setText(p4Counter + 5 + "");
                        p4Counter = p4Counter + 5;
                        checkLifeCounter(p4Counter, "4");
                        break;
                    case(R.id.P4_Minus5):
                        Log.i("Minus1", "button was clicked");
                        newTextView =
                                (TextView)findViewById(R.id.P4LifeCounter);
                        newTextView.setText(p4Counter - 5 + "");
                        p4Counter = p4Counter - 5;
                        checkLifeCounter(p4Counter, "4");
                        break;
                }
            }
        };
        P1Plus1.setOnClickListener(oclBtn);
        P1Minus1.setOnClickListener(oclBtn);
        P1Minus5.setOnClickListener(oclBtn);
        P1Plus5.setOnClickListener(oclBtn);
        P2Plus1.setOnClickListener(oclBtn);
        P2Minus1.setOnClickListener(oclBtn);
        P2Minus5.setOnClickListener(oclBtn);
        P2Plus5.setOnClickListener(oclBtn);
        P3Plus1.setOnClickListener(oclBtn);
        P3Minus1.setOnClickListener(oclBtn);
        P3Minus5.setOnClickListener(oclBtn);
        P3Plus5.setOnClickListener(oclBtn);
        P4Plus1.setOnClickListener(oclBtn);
        P4Minus1.setOnClickListener(oclBtn);
        P4Minus5.setOnClickListener(oclBtn);
        P4Plus5.setOnClickListener(oclBtn);
        /*Button button = (Button)findViewById(R.id.plus1);
        button.setOnClickListener(new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.i("Plus1", "button was clicked");
                        TextView newTextView =
                                (TextView)findViewById(R.id.P1LifeCount);
                        //p1.changeLifePoints(1);
                        //myTextView.setText(p1.getLifePoints());
                        newTextView.setText(p1Counter + 1 + "");
                        p1Counter++;
                    }
                }
        );*/
    }

    public void checkLifeCounter(int player, String playerNumber) {
        if(player <= 0) {
            TextView newTextView =
                    (TextView)findViewById(R.id.textView2);
            newTextView.setText("Player " + playerNumber + " LOSES!");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
