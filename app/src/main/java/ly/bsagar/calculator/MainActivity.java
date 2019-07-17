package ly.bsagar.calculator;

import android.app.Activity;
import android.inputmethodservice.Keyboard;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    // variable declaration
    EditText editText1;
    EditText editText2;

    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // variable initialization
        editText1 = findViewById(R.id.EditText1);
        editText2 = findViewById(R.id.EditText2);

        resultTextView = findViewById(R.id.RESULT);


        resultTextView.setText("Math Error");


    }

    public void Sum(View view) {
        //Toast.makeText(this, "You pressed SUM button", Toast.LENGTH_LONG).show();

        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();
        // fool proofing the APP.
        if (text1.length() == 0 || text2.length() == 0){
            Toast.makeText(this, "Please Provide input values", Toast.LENGTH_SHORT).show();
            return;
        }

        int num1 = Integer.parseInt(text1);
        int num2 = Integer.parseInt(text2);

        int sum = num1 + num2;
        String sumString = String.valueOf(sum);
        resultTextView.setText( sumString  );


        // Code from the internet to hide keyboard.
        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Hide:
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);

    }

    public void minus(View view) {
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();
        // fool proofing the APP.
        if (text1.length() == 0 || text2.length() == 0){
            Toast.makeText(this, "Please Provide input values", Toast.LENGTH_SHORT).show();
            return;
        }

        int num1 = Integer.parseInt(text1);
        int num2 = Integer.parseInt(text2);

        int sum = num1 - num2;
        String sumString = String.valueOf(sum);
        resultTextView.setText( sumString  );


        // Code from the internet to hide keyboard.
        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Hide:
        imm.toggleSoftInput(InputMethodManager.HIDE_NOT_ALWAYS, 0);


    }


    public void multiply(View view) {
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();
        // fool proofing the APP.
        if (text1.length() == 0 || text2.length() == 0){
            Toast.makeText(this, "Please Provide input values", Toast.LENGTH_SHORT).show();
            return;
        }

        int num1 = Integer.parseInt(text1);
        int num2 = Integer.parseInt(text2);

        int sum = num1 * num2;
        String sumString = String.valueOf(sum);
        resultTextView.setText( sumString  );


        // Code from the internet to hide keyboard.
        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Hide:
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);



    }

    public void devide(View view) {
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();
        // fool proofing the APP.
        if (text1.length() == 0 || text2.length() == 0){
            Toast.makeText(this, "Please Provide input values", Toast.LENGTH_SHORT).show();
            return;
        }

        float num1 = Float.parseFloat(text1);
        float num2 = Float.parseFloat(text2);

        float sum = num1 / num2;
        String sumString = String.valueOf(sum);
        resultTextView.setText( sumString  );


        // Code from the internet to hide keyboard.
        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Hide:
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);

    }
}

