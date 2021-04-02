package com.example.word.service;

import com.example.word.dao.WordDao;
import com.example.word.entity.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService {
    @Autowired
    private WordDao wordDao;

    public void add(Word word){
        wordDao.add(word);
    }

    public void update(Word word){
        wordDao.update(word);
    }

    public Word get(Word word){
        return  wordDao.get(word);
    }
}
