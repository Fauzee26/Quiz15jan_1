package fauzi.hilmy.quiz15jan_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNumber;
    Button btnCheck;
    TextView lblResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber = (EditText)findViewById(R.id.etNumber);
        btnCheck = (Button)findViewById(R.id.btnCheck);
        lblResult = (TextView)findViewById(R.id.lblResult);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nNumber = etNumber.getText().toString();


                if (nNumber.isEmpty()){
                    etNumber.setError("Fill The Data With Number");
                } else if (nNumber.equalsIgnoreCase("0")) {
                    lblResult.setText("NULL");
                }else if (nNumber.equalsIgnoreCase("1") || (nNumber.equalsIgnoreCase("2") || (nNumber.equalsIgnoreCase("3") || (nNumber.equalsIgnoreCase("4") || (nNumber.equalsIgnoreCase("5") || (nNumber.equalsIgnoreCase("6") || (nNumber.equalsIgnoreCase("7") || (nNumber.equalsIgnoreCase("8") || (nNumber.equalsIgnoreCase("9")))))))))) {
                    lblResult.setText("NOT NULL");
                }else{
                    etNumber.setError("Please Fill Only 0-9");
                }
            }
        });

    }
}
