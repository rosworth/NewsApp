package com.example.android.newsapp;

import android.text.TextUtils;

public class News {
    private String title;
    private String url;
    private String section;

    public News() {
    }

    public News(String title, String section, String url) {
        this.title = title;
        this.section = section;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getSection() {
        if (TextUtils.isEmpty(section)) {
            return "No section";
        }
        return section;
    }
}
