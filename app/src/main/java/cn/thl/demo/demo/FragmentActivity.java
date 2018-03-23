package cn.thl.demo.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.thl.demo.R;



public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment, new Fragment())
                .commit();
    }
}
