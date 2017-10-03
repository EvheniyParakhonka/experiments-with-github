package piftik.github.com.experementsgithub;

import android.os.Bundle;
import android.support.v7.app.*;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textView);
        imInProcess();
//       Rebase
//       rebase second
    }
    public void imInProcess(){
        String rebase = "Second";
        mTextView.setText(rebase);
    }
}
