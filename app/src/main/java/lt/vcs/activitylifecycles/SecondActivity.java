package lt.vcs.activitylifecycles;

import android.os.Bundle;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        super.setActivityName("Second Activity");
        super.setTageName(Constants.LIFECYCLES_SECOND_ACTIVITY);
        super.printLogInfo("CREATE");
    }
}