package activities.among.communication.tutorials.anus.com.communications;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RequestChangeActivity extends AppCompatActivity {
EditText editText;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_change);

        editText = (EditText)findViewById(R.id.changed_text_box);
        btn = (Button)findViewById(R.id.request_change_text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("changed_text",editText.getText().toString());
                setResult(1200,intent);
                finish();
            }
        });
    }
}
