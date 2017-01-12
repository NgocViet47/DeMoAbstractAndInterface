package com.example.mypc.demoabstractandinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,Cloneable {

    private TextView ediText;
    private Button buttonDog;
    private Button buttonCat;
    private Button buttonFish;
    private EditText ediText2;
    private Animal animal;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mapped();
        buttonClick();
    }
    public void buttonClick()
    {
        buttonCat.setOnClickListener(this);
        buttonDog.setOnClickListener(this);
        buttonFish.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                buttonDog();
                break;
            case R.id.button2:
                buttonCat();
                break;
            case R.id.button3:
                buttonFish();
                break;
        }
    }

    private void buttonFish() {
        animal = new Fish();
        ediText.setText(animal.MakeSound());
    }

    private void buttonCat() {
        //Cat cat = new Cat();
        animal = new Cat();
        ediText.setText(animal.MakeSound());
    }

    private void buttonDog() {
        animal = new Dog();
        String makeSuond2="";
        makeSuond2= ediText2.getText().toString();
        ediText.setText(animal.MakeSuond(makeSuond2));
    }
    public  void Mapped(){
        ediText = (TextView) findViewById(R.id.editText);
        ediText2 = (EditText) findViewById(R.id.editText2);
        buttonCat = (Button) findViewById(R.id.button);
        buttonDog = (Button) findViewById(R.id.button2);
        buttonFish = (Button) findViewById(R.id.button3);
    }

}
