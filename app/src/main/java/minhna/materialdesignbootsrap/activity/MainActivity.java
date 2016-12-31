package minhna.materialdesignbootsrap.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.Keep;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.jakewharton.threetenabp.AndroidThreeTen;

import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

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
        AndroidThreeTen.init(this);
        switch (getIntent().getIntExtra("id", 0)) {
            case Status.NORMAL:
                tvTitle.setText(Category.NORMAL);
                break;
            case Status.UNNORMAL:
                tvTitle.setText(Category.UNNORMAL);
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        LocalDate now = LocalDate.now();//only date, no time part
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = now.format(formatter);
        Toast.makeText(this, "Current Date:"+ date, Toast.LENGTH_SHORT).show();

        List<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(1,2,3,4));
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.N) {
            List<Integer> strings = num.stream().filter(n -> n % 2 == 0).sorted().collect(Collectors.toList());
            for (Integer myInt : strings)
                System.out.println(myInt);
        }
    }

    public static void start(Context context, int statusId) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra("id", statusId);
        context.startActivity(intent);
    }
}
