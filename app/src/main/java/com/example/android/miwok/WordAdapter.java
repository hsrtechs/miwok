package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> resource) {
        super(context,0, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false
            );
        }

        Word currentWord = getItem(position);

        TextView eTextView = (TextView) listItemView.findViewById(R.id.english_view);
        if(currentWord != null){
            eTextView.setText(currentWord.getEnglish());
        }

        TextView miwoktext = (TextView) listItemView.findViewById(R.id.miwok_view);
        miwoktext.setText(currentWord.getMiwok());

        return super.getView(position, convertView, parent);
    }
}
