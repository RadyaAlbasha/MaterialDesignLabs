package android.materialdesign.labs.playwithlayouts.screens.textdecorationscreen;

import android.materialdesign.labs.playwithlayouts.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TextDecorationActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_decoration);
        textView = findViewById(R.id.textViewDecoration);
        editText = findViewById(R.id.editTextDecoration);
    }

    public void convertText(View view) {
        textView.setText(editText.getText());
    }
}
