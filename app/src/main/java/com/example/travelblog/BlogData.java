package com.example.travelblog;

import java.util.ArrayList;
import java.util.List;

public class BlogData {

    private List<Blog> data;

    public List<Blog> getData() {
        if(data!=null)
            return data;
        else
            return new ArrayList<>();
    }
}
