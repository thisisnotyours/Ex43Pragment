package com.suek.ex43pragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    MyFragment myFragment;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv= findViewById(R.id.tv);

        //프레그먼트를 관리하는 매니저객체 소환
        fragmentManager= getSupportFragmentManager();

        myFragment= (MyFragment) fragmentManager.findFragmentById(R.id.frag);
    }




    public void clickBtn(View view) {
        //MyFragment 안에있는 TextView 의 글씨를 변경
        //myFragment.tv.setText("Nice!");        //메인을 직접 바꾸고 건드리는 것 보다는..
        myFragment.changeText("Nice!!!");   //객체지향적으로.. 니꺼니까.
    }


    //MyFragment 안에 있는 Button 의 onClick 속성의 콜백메소드가 액티비티가 대신..
    public void clickBtn2(View v){
        tv.setText("!!!!!!!!!!!! 2");   //Fragment 가 처리하지 못해서 액티비티가 대신해줌
    }
}
