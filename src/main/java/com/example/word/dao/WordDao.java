package com.example.word.dao;

import com.example.word.entity.Word;

public interface WordDao {
    // 新增单词记录
    public void add(Word word);
    // 更新
    public void update(Word word);
    // 查
    public Word get(Word word);
}
