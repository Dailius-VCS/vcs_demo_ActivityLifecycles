package lt.vcs.activitylifecycles;

import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    private String activityName = "[No Activity Name!!!]";
    private String tageName = Constants.LIFECYCLES_MAIN_ACTIVITY;

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public void setTageName(String tageName) {
        this.tageName = tageName;
    }

    public final void printLogInfo(String create) {
        Log.i(
                tageName,
                "==========\n " + activityName + ": on" + create + ":\n=========="
        );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        printLogInfo("RESTART");
    }

    @Override
    protected void onResume() {
        super.onResume();
        printLogInfo("RESUME");
    }

    @Override
    protected void onStart() {
        super.onStart();
        printLogInfo("START");
    }

    @Override
    protected void onPause() {
        super.onPause();
        printLogInfo("PAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        printLogInfo("STOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        printLogInfo("DESTROY");
    }
}
