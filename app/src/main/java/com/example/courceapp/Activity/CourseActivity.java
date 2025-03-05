package com.example.courceapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.courceapp.Adapter.CourseAdapter;
import com.example.courceapp.Domain.CourseDomain;
import com.example.courceapp.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CourseActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterCourseList;
    private RecyclerView recyclerViewCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        ConstraintLayout backBtn = findViewById(R.id.backbtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        initRecyclerView();
    }

    private void initRecyclerView(){
        ArrayList<CourseDomain> items = new ArrayList<>();

        items.add(new CourseDomain("Advanced certificationProgram in AI",169,"ic_1"));
        items.add(new CourseDomain("Google cloud platform Architecture",169,"ic_2"));
        items.add(new CourseDomain("Fundamental of Programming",150,"ic_3"));
        items.add(new CourseDomain("Introduction to UI design history",79,"ic_4"));
        items.add(new CourseDomain("PG Program in Big Data Engineering",169,"ic_5"));
        items.add(new CourseDomain("PG Program in Big Data Engineering",169,"ic_5"));
        items.add(new CourseDomain("PG Program in Big Data Engineering",169,"ic_5"));
        items.add(new CourseDomain("PG Program in Big Data Engineering",169,"ic_5"));

        recyclerViewCourse = findViewById(R.id.view);
        recyclerViewCourse.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        adapterCourseList = new CourseAdapter(items);
        recyclerViewCourse.setAdapter(adapterCourseList);


    }
}