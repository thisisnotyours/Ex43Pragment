package com.suek.ex43pragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyFragment extends Fragment {

    //프레그먼트 뷰들의 참조변수
    TextView tv;   //메인자바의 tv 랑은 아무 관계없음
    Button btn;   //onClick 은 액티비티에서만 사용 가능하기때문에...여기 Fragment 에서는 사용을 안했음
    Button btn2;


    //마치 MainActivity 의 onCreate()같은 역할의 메소드가 있음
    //즉, 프레그먼트가 화면에 보여줄 뷰들을 만들어 리턴하는 콜백메소드
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //이 프레그먼트가 보여줄 뷰를 만들기
        View view = inflater.inflate(R.layout.fragment_my, container, false); //컨테이너(LinearLayout)한테 붙일건데 지금은 안붙임(false)


        //만들어진 뷰 안에 있는 TextView 와 Button 참조하기
        tv= view.findViewById(R.id.tv_myfragment);
        btn= view.findViewById(R.id.btn1);

        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                tv.setText("Hello Fragment");
                return false;
            }
        });


        btn2= view.findViewById(R.id.btn2);
        /*btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //이 프레그먼트를 보여주는 액티비티의 TextView 를 제어
                //액티비티 참조하기
                MainActivity activity= (MainActivity) getActivity();   //다운캐스팅
                activity.tv.setText("!!!!!!!!");
            }
        });*/
        return view;
    }



    public void changeText(String msg){
        tv.setText(msg);
    }

}

