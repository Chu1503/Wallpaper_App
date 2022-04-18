package com.example.wallpaperapp;

        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;
        import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView image;

    int[] pics = {R.drawable.img, R.drawable.img2, R.drawable.img3, R.drawable.img4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image=(ImageView) findViewById(R.id.picture);
    }

    public void change(View view)
    {
        Random rand = new Random();
        int rand_int = rand.nextInt(4);
        image.setImageResource(pics[rand_int]);
    }
}