package com.example.poojajoshi.assignment_10_1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentClaass extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /** Inflating the layout for this fragment **/
        View v = inflater.inflate(R.layout.fragment_layout, null);

        TextView tView = v.findViewById(R.id.textView);
        tView.setText(getArguments().getString("key"));
        return v;
    }
}
