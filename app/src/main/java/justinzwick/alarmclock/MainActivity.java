package justinzwick.alarmclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.gc.materialdesign.views.ButtonRectangle;


public class MainActivity extends AppCompatActivity {

    private ButtonRectangle dateButton;
    private ButtonRectangle timeButton;
    private ButtonRectangle alarmButton;
    private TextView dateTextView;
    private TextView timeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //finding the view instances from activity_main.xml
        dateButton = (ButtonRectangle) findViewById(R.id.dateButton);
        timeButton = (ButtonRectangle) findViewById(R.id.timeButton);
        alarmButton = (ButtonRectangle) findViewById(R.id.setAlarmButton);
        dateTextView = (TextView) findViewById(R.id.dateTextView);
        timeTextView = (TextView) findViewById(R.id.timeTextView);


    }
}
