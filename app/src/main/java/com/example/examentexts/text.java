package com.example.examentexts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link text#newInstance} factory method to
 * create an instance of this fragment.
 */
public class text extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public text() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment text.
     */
    // TODO: Rename and change types and number of parameters
    public static text newInstance(String param1, String param2) {
        text fragment = new text();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View mFragment = inflater.inflate(R.layout.fragment_text, container, false);

        TextView textView = getActivity().findViewById(R.id.text_view);

        TextInputLayout textInput = mFragment.findViewById(R.id.text_input);
        SeekBar textSize = mFragment.findViewById(R.id.bar_size);

        Button bText = mFragment.findViewById(R.id.text_button);
        bText.setOnClickListener(view -> {
            textView.setText(textInput.getEditText().getText());
            textView.setTextSize(textSize.getProgress());
        });

        return mFragment;
    }
}