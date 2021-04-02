package com.example.word;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.word.dao")
@SpringBootApplication
public class WordApplication {
	public static void main(String[] args) {
		SpringApplication.run(WordApplication.class, args);
	}
}
