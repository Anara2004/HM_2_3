package com.example.hm_2_3;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;


public class GameFragment extends Fragment {
    String first;
    String second;
    String third;
    String four;
    String answer;

    ImageView firstImg,secondImg,thirdImg,fourImg;
    Button applyBtn;
    EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        firstImg=view.findViewById(R.id.firsImg);
        secondImg=view.findViewById(R.id.secoindImg);
        thirdImg=view.findViewById(R.id.thirdImg);
        fourImg=view.findViewById(R.id.fourImg);
        applyBtn=view.findViewById(R.id.applyBtn);
        editText = view.findViewById(R.id.answerEdit);

        first = getArguments().getString("first");
        second = getArguments().getString("second");
        third = getArguments().getString("third");
        four = getArguments().getString("four");
        answer = getArguments().getString("answer");

        Glide.with(firstImg).load(first).into(firstImg);
        Glide.with(secondImg).load(second).into(secondImg);
        Glide.with(thirdImg).load(third).into(thirdImg);
        Glide.with(fourImg).load(four).into(fourImg);
        applyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().trim().equalsIgnoreCase(answer)) {
                    Toast.makeText(requireContext(), "Правильно", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(requireContext(), "Не правильно", Toast.LENGTH_LONG).show();
                }
            }
        });









    }
}
