package demo2.contactapp.com.contactappdemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class AddContactActivity extends AppCompatActivity {
    private EditText edtName;
    private EditText edtPhone;
    private RadioButton rbMale;
    private RadioButton rbFemale;
    private Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
        initWidget();
    }

    private void initWidget() {
        edtName = new findViewById(R.id.edtName);
        edtPhone = new findViewById(R.id.edtPhone);
        rbFemale = new findViewById(R.id.rbFemale);
        rbMale = new
    }
}
