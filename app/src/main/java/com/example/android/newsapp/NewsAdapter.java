package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView news_title = (TextView) listItemView.findViewById(R.id.tv_title);
        TextView news_section = (TextView) listItemView.findViewById(R.id.tv_section);

        News currentNews = getItem(position);
        news_title.setText(currentNews.getTitle());
        news_section.setText(currentNews.getSection());

        return listItemView;
    }
}
