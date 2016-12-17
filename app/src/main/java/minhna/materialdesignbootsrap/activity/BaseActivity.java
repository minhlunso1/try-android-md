package minhna.materialdesignbootsrap.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import me.henrytao.mdcore.core.MdCore;

/**
 * Created by Administrator on 17-Dec-16.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        MdCore.init(this);
        super.onCreate(savedInstanceState);
    }
}
