package com.doug.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Table(name = "quiz_single")
public class QuizSingle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_added")
    private Date date_added = new Date();

    @NotNull
    private Integer question;

    @NotNull
    private String answer;

    @NotNull
    private Boolean is_correct;

    @NotNull
    private String comments;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public QuizSingle(){ }

    public QuizSingle(Integer question, String answer, Boolean is_correct, String comments,
                      Date date_added) {
        this.question = question;
        this.answer = answer;
        this.is_correct = is_correct;
        this.comments = comments;
        this.date_added = date_added;
    }

    public Integer getQuestion() {
        return question;
    }

    public void setQuestion(Integer question) {
        this.question = question;
    }

    public Boolean getIs_correct() {
        return is_correct;
    }

    public void setIs_correct(Boolean is_correct) {
        this.is_correct = is_correct;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getDate_added() {
        return date_added;
    }

    public void setDate_added(Date date_added) {
        this.date_added = date_added;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

//    @Override
//    public String toString() {
//        String result = String.format(
//                "Category[id=%d, name='%s']%n",
//                id, name);
//        if (answers != null) {
//            for(Answer answer : answers) {
//                result += String.format(
//                        "Book[id=%d, name='%s']%n",
//                        answer.getId(), answer.getName());
//            }
//        }
//
//        return result;
//    }
}
