package minhna.materialdesignbootsrap.activity;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Keep;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import minhna.materialdesignbootsrap.R;
import minhna.materialdesignbootsrap.model.Category;
import minhna.materialdesignbootsrap.model.Status;

@Keep
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tv_title)
    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        switch (getIntent().getIntExtra("id", 0)) {
            case Status.NORMAL:
                tvTitle.setText(Category.NORMAL);
                break;
            case Status.UNNORMAL:
                tvTitle.setText(Category.UNNORMAL);
                break;
        }
    }

    public static void start(Context context, int statusId) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra("id", statusId);
        context.startActivity(intent);
    }
}
