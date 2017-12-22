package tk.zielony.carbonsamples.feature;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import tk.zielony.carbonsamples.R;
import tk.zielony.randomdata.common.DrawableImageGenerator;

public class RoundedCornersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rounded_corners);

        ImageView view = findViewById(R.id.image);
        view.setImageDrawable(new DrawableImageGenerator(this).next(null));
    }
}
