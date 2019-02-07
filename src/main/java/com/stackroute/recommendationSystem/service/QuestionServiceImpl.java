package com.stackroute.recommendationSystem.service;

import com.stackroute.recommendationSystem.domain.Question;
import com.stackroute.recommendationSystem.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class QuestionServiceImpl implements QuestionService {
    public QuestionRepository questionRepository;
    @Autowired
    public QuestionServiceImpl(QuestionRepository questionRepository){
        this.questionRepository=questionRepository;
    }


    public List<Question> getAllQuestion(){
        List<Question> questionCollection =questionRepository.getAllQuestion();
        System.out.println("in quesImpl"+ questionCollection);
        return questionCollection;
    }
}

