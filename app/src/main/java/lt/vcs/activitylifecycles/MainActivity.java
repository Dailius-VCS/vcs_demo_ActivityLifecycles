package lt.vcs.activitylifecycles;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.buttonFirstActivity);

        button.setOnClickListener(
                view -> {
                    startActivity(new Intent(MainActivity.this, SecondActivity.class));
                }
        );

        super.setActivityName("MainActivity");
        super.printLogInfo("CREATE");
    }
}