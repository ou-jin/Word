package com.example.word.controller;

import com.example.word.entity.Result;
import com.example.word.entity.Word;
import com.example.word.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/word")
public class wordController {
    @Autowired
    WordService wordService;

    @RequestMapping("/add")
    public Result add(Word word) {
        wordService.add(word);
        return new Result(200, "success");
    }

    @RequestMapping("/update")
    public Result update(Word word) {
        wordService.update(word);
        return new Result(200, "success");
    }

    @RequestMapping("/get")
    public Result get(Word word) {
        Word wordRes = wordService.get(word);
        return new Result(200, "success", wordRes);
    }
}
