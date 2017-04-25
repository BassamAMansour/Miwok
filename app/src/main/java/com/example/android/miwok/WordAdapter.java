package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bassam on 2/9/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int categoryColor;

    public WordAdapter(Context context, ArrayList<Word> wordsArray, int categoryColor) {
        super(context, 0, wordsArray);
        this.categoryColor = categoryColor;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Word currentWord = getItem(position);
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view_item, parent, false);
        }

        TextView miwokTranslationTextView = (TextView) listItemView.findViewById(R.id.miwok_translation_text_view);
        miwokTranslationTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultLanguageTranslationTextView = (TextView) listItemView.findViewById(R.id.user_language_translation_text_view);
        defaultLanguageTranslationTextView.setText(currentWord.getUserDefaultTranslation());

        ImageView wordImageView = (ImageView) listItemView.findViewById(R.id.word_imageView);
        if (currentWord.getImageResourceId() != Word.NO_IMAGE_RESOURCE) {
            wordImageView.setImageResource(currentWord.getImageResourceId());
            wordImageView.setVisibility(View.VISIBLE);
        } else {
            wordImageView.setVisibility(View.GONE);
        }

        LinearLayout textsLinearLayout = (LinearLayout) listItemView.findViewById(R.id.texts_linear_layout);
        textsLinearLayout.setBackgroundResource(categoryColor);

        return listItemView;
    }
}
