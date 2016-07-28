package touch.androidtown.org.tazza;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//import android.support.v4.app.FragmentStatePagerAdapter;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void baccarat(View v) {
        Intent intent = new Intent(MainActivity.this, baccarat.class);
        startActivity(intent);

    }


    public void roulette(View v) {
        Intent intent = new Intent(MainActivity.this, roulette.class);
        startActivity(intent);
    }


    public void blackjack(View v) {
        Intent intent = new Intent(MainActivity.this, blackjack.class);
        startActivity(intent);
    }

}
