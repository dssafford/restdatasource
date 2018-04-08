package com.doug.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "quiz")
public class Quiz {
    private Integer id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_added")
    private Date date_added = new Date();

    @NotNull
    private Integer numberOfQuestions;

    @NotNull
    private Integer score;

    @NotNull
    @Size(max = 250)
    private String comments;
    private Set<Answer> answers;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    @JsonBackReference
    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }

    public Quiz(){

    }

    public Quiz(Integer numberOfQuestions, Integer score, String comments,
                Date date_added) {
        this.numberOfQuestions = numberOfQuestions;
        this.score = score;
        this.comments = comments;
        this.date_added = date_added;
    }

    public Date getDate_added() {
        return date_added;
    }

    public void setDate_added(Date date_added) {
        this.date_added = date_added;
    }

    public Integer getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(Integer numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    //    public Quiz(String name) {
//        this.name = name;
//    }

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
