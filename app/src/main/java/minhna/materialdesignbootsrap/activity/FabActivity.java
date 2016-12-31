package minhna.materialdesignbootsrap.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;


import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.henrytao.mdcore.widgets.FabSheetWindow;
import minhna.materialdesignbootsrap.R;
import minhna.materialdesignbootsrap.model.Status;
import minhna.materialdesignbootsrap.model.TypeDefClass;

public class FabActivity extends BaseActivity {

  @Bind(R.id.fab_popup_window) FloatingActionButton vFabPopupWindow;

  @Bind(R.id.toolbar) Toolbar vToolbar;

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fab);
    ButterKnife.bind(this);

    setSupportActionBar(vToolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    vToolbar.setNavigationOnClickListener(v -> onBackPressed());
  }

  @OnClick(R.id.fab_popup_window)
  protected void onFabPopupWindowClick() {
    View sheet = getLayoutInflater().inflate(R.layout.custom_fab_sheet_window, null, false);
    FabSheetWindow fabSheetWindow = new FabSheetWindow.Builder(vFabPopupWindow, sheet).build();
    fabSheetWindow.show();
  }

  public void showMainActivity(View view) {
    TypeDefClass typeDefClass = new TypeDefClass();
    typeDefClass.setStatus(Status.UNNORMAL);
    MainActivity.start(this,typeDefClass.getStatus());
  }
}