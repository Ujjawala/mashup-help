package com.stackroute.recommendationSystem.controller;


import com.stackroute.recommendationSystem.Exceptions.UserDuplicationException;
import com.stackroute.recommendationSystem.Exceptions.UserNullFieldException;
import com.stackroute.recommendationSystem.domain.Question;
import com.stackroute.recommendationSystem.service.QuestionService;
import com.stackroute.recommendationSystem.service.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1")
public class QuestionController {

    QuestionServiceImpl questionService;
    @Autowired
    public QuestionController(QuestionServiceImpl questionService) {

        this.questionService = questionService;
    }

    @RequestMapping(value = "getAllQuestion", method = RequestMethod.GET)
    public ResponseEntity<?> getAllQuestion() {

        List<Question> questions;
        System.out.println("In questions");
            questions = questionService.getAllQuestion();
        System.out.println("all data is "+questions.toString());
        return new ResponseEntity<List<Question>>(questions, HttpStatus.OK);
    }
}
