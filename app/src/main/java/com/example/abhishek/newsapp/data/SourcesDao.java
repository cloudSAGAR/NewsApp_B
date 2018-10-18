package com.example.abhishek.newsapp.data;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.abhishek.newsapp.models.Source;

import java.util.List;

public interface SourcesDao {
    @Insert
    void bulkInsert(List<Source> sources);

    @Query("SELECT * FROM sources")
    LiveData<List<Source>> getAllSources();
}