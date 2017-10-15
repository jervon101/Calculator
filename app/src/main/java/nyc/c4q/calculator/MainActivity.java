package nyc.c4q.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button userInput;
    private Button addButton;
    private Button oneButton;
    private Button twoButton;
    private Button threeButton;
    private Button fourButton;
    private Button fiveButton;
    private Button sixButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;
    private Button zeroButton;
    private Button subButton;
    private Button MultiButton;
    private Button divideButton;
    private Button deciButton;
    private Button equalsButton;
    private TextView numberline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpViews();
        businessLogic();


    }

    private void setUpViews() {

        numberline = (TextView) findViewById(R.id.number_text);
        addButton = (Button) findViewById(R.id.add_button);
        oneButton = (Button) findViewById(R.id.one_button);
        twoButton = (Button) findViewById(R.id.two_button);
        threeButton = (Button) findViewById(R.id.three_button);
        fourButton = (Button) findViewById(R.id.four_button);
        fiveButton = (Button) findViewById(R.id.five_button);
        sixButton = (Button) findViewById(R.id.six_button);
        sevenButton = (Button) findViewById(R.id.seven_button);
        eightButton = (Button) findViewById(R.id.eight_button);
        nineButton = (Button) findViewById(R.id.nine_button);
        zeroButton = (Button) findViewById(R.id.zero_button);
        subButton = (Button) findViewById(R.id.sub_button);
        MultiButton = (Button) findViewById(R.id.multiply_button);
        divideButton = (Button) findViewById(R.id.divide_button);
        deciButton = (Button) findViewById(R.id.deci_button);
        equalsButton = (Button) findViewById(R.id.equal_button);


        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberline.setText(Integer.toString(1));
            }
        });
        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberline.setText(Integer.toString(2));
            }
        });
        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberline.setText(Integer.toString(3));
            }
        });
        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberline.setText(Integer.toString(4));
            }
        });
        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberline.setText(Integer.toString(5));
            }
        });
        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberline.setText(Integer.toString(6));
            }
        });
        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberline.setText(Integer.toString(7));
            }
        });
        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberline.setText(Integer.toString(8));
            }
        });
        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberline.setText(Integer.toString(9));
            }
        });
        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberline.setText(Integer.toString(0));
            }
        });


    }


    private void businessLogic() {

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userInput = numberline.getText().toString();
                addStuff(userInput);
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userInput = numberline.getText().toString();
                subdStuff(userInput);
            }
        });


    }


    private void addStuff(String a){

        int input = Integer.parseInt(a)+;
        String n = input+"";
        numberline.setText(n);

    }
    private void subdStuff(String a){

        int input = Integer.parseInt(a)-;
        String n = input+"";
        numberline.setText(n);

    }
}
















