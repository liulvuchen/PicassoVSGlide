package demo.sj.com.mypicassoglide;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import it.sephiroth.android.library.picasso.MemoryPolicy;
import it.sephiroth.android.library.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.head)
    ImageView head;
    @BindView(R.id.head1)
    ImageView head1;
    @BindView(R.id.head2)
    ImageView head2;
    @BindView(R.id.head3)
    ImageView head3;
    @BindView(R.id.head4)
    RoundCornerImageView head4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        head4.yuanjiaotupian(head4);

        Picasso.with(MainActivity.this)
                .load("http://p2.so.qhimgs1.com/t010bf2fad41ee7797e.jpg")
                .placeholder(R.drawable.new_img_138_d)
                .error(R.drawable.home_img_nothing_d)
                .tag(MainActivity.this)
                .memoryPolicy(MemoryPolicy.NO_STORE, MemoryPolicy.NO_CACHE)
                .fit()
                .config(Bitmap.Config.RGB_565)
                .into(head);

        Picasso.with(MainActivity.this)
                .load("http://p2.so.qhimgs1.com/t010bf2fad41ee7797e.jpg")
                .placeholder(R.drawable.new_img_138_d)
                .error(R.drawable.home_img_nothing_d)
                .resize(100, 100)
                .centerInside()
                .tag(MainActivity.this)
                .into(head1);

        Glide.with(MainActivity.this)
                .load("http://p2.so.qhimgs1.com/t010bf2fad41ee7797e.jpg")
                .asBitmap()
                .placeholder(R.drawable.new_img_138_d)
                .error(R.drawable.home_img_nothing_d)
                .dontAnimate()
                .into(head2);

        Glide.with(MainActivity.this)
                .load("http://baobab.wdjcdn.com/14564977406580.mp4")
                .asBitmap()
                .placeholder(R.drawable.new_img_138_d)
                .error(R.drawable.home_img_nothing_d)
                .dontAnimate()
                .into(head3);

    }
}
