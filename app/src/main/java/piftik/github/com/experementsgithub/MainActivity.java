package piftik.github.com.experementsgithub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textView);
        imInProcess();
    }

    public void imInProcess() {
        String rebase;
        rebase = "rebasing so hard";
        mTextView.setText(rebase);

    }
}
