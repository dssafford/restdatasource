package com.doug.service;

import com.doug.model.Answer;
import com.doug.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void addAnswer(Answer answer) {
        answerRepository.save(answer);
    }

//    @Override
//    public List<String> findAllById(Integer id) {
////        Iterable<Answer> myanswers = answerRepository.findByQuiz_Id(1);
//        return null;
//    }

    @Override
    public List<String> getAnswers(Integer id) {
        String sql = "SELECT * FROM answer where quiz_id = "+ id;

        List<String> dogList = new ArrayList<String>();

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.query(sql, new ResultSetExtractor<List>() {
            public List extractData(ResultSet rs) throws SQLException {

                while (rs.next()) {
                    String question = rs.getString("question");
                    String answer = rs.getString("answer");
                    String correct = rs.getString("correct");
                    String comments = rs.getString("comments");
                    System.out.println("question = " + question
                            + " answer = " + answer
                            + " and correct = " + correct);
                    dogList.add(comments);
                }
                return dogList;
            }
        });
        return dogList;
    }


    @Override
    public String getLorayneAnswer(Integer answer) {


        return null;
    }
}
