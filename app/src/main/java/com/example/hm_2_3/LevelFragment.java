package com.example.hm_2_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.hm_2_3.databinding.FragmentLevelBinding;


public class LevelFragment extends  Fragment {

    FragmentLevelBinding binding;
    String firstImg = "https://th.bing.com/th/id/R.4a6273b94ed63f6405639bb4c67fe9d3?rik=t4IrlrQ81n7uPA&pid=ImgRaw&r=0&sres=1&sresct=1";
    String secondImg = "https://i.pinimg.com/564x/ea/aa/a1/eaaaa14391a6c3d1bfcb66ec29acba21.jpg";
    String thirdImg = "https://i.pinimg.com/564x/5a/db/a3/5adba3812da0e89dc464e8fc400c5e63.jpg";
    String fourImg = "https://i.pinimg.com/564x/55/73/f9/5573f9ae166dfae804b423e5823d0edc.jpg";

                        
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLevelBinding.inflate(getLayoutInflater());
        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.firsLevelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("first", firstImg);
                bundle.putString("second", secondImg);
                bundle.putString("third", thirdImg);
                bundle.putString("four",fourImg);
                bundle.putString("answer", "КРД");

                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container, gameFragment)
                        .commit();

            }
        });

        binding.secondLevelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("first","https://i.pinimg.com/564x/66/dc/ca/66dcca5a43bc51a2d669fa4782618c12.jpg");
                bundle.putString("second", "https://i.pinimg.com/564x/62/0e/f4/620ef41606155f91e84bf357e8430fc0.jpg");
                bundle.putString("third", "https://yt3.ggpht.com/ytc/AKedOLTj_0m4-4-v1shHDCmE326sx4MZsltTcRRlZodWmQ=s900-c-k-c0x00ffffff-no-rj");
                bundle.putString("four","https://krot.info/uploads/posts/2021-02/1614128350_39-p-sine-belii-fon-gradientom-40.jpg");
                bundle.putString("answer", "facebook");


                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container, gameFragment)
                        .commit();

            }
        });

        binding.thirdLevelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("first","https://pngimg.com/uploads/circle/circle_PNG44.png");
                bundle.putString("second", "https://images.satu.kz/57746270_obruch-gimnasticheskij.jpg");
                bundle.putString("third", "https://pro-chislo.ru/data/moduleImages/Numbers/0/ee846da6c15bdaf09847a15611d02a95.png");
                bundle.putString("four","data:image/jpeg;base64,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");
                bundle.putString("answer","Кольцо");


                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container, gameFragment)
                        .commit();

            }
        });

    }
}