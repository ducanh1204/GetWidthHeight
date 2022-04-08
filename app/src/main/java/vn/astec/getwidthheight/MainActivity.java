package vn.astec.getwidthheight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private DisplayMetrics displayMetrics;
    private int screenWidth = 0;
    private int screenHeight = 0;
    private TextView tvInfor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvInfor = findViewById(R.id.tv_infor);

        tvInfor.setText(getScreenWidth()+"-"+getScreenHeight());


    }
    private DisplayMetrics getDisplayMetrics() {
        if (displayMetrics == null)
            displayMetrics = getResources().getDisplayMetrics();
        return displayMetrics;
    }
    private int getScreenWidth() {
        if (screenWidth == 0)
            screenWidth = getDisplayMetrics().widthPixels;
        return screenWidth;
    }
    private int getScreenHeight() {
        if (screenHeight == 0)
            screenHeight = getDisplayMetrics().heightPixels;
        return screenHeight;
    }
}