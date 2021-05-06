package com.example.word.controller;

import com.example.word.entity.Result;
import com.example.word.entity.Word;
import com.example.word.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/word")
public class wordController {
    @Autowired
    WordService wordService;

    @RequestMapping(value = "/add", method = RequestMethod.POST )
    public Result add(@RequestBody Word word) {
        try{
            wordService.add(word);
            return new Result(200, "success");
        }catch (Exception e){
            return new Result(100, "新增失败");
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST )
    public Result update(Word word) {
        wordService.update(word);
        return new Result(200, "success");
    }

    @RequestMapping(value = "/get", method = RequestMethod.POST )
    public Result get(@RequestBody Word word) {
        Word wordRes = wordService.get(word);
        return new Result(200, "success", wordRes);
    }
}
