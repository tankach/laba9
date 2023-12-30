package sumdu.edu.ua.webstudent.res;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author tanka
 */
@Entity
@Table(name="scores")
public class Content {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="stud_id")
    private int stud_id;
    @Column(name="Title")
    private String title;
    @Column(name="mark_let")
    private String score_l;
    @Column(name="mark_num")
    private int score_num;
    
    public Content(){}
    public Content(int id, int stud_id, String title, String score_l, int score_num) {
        this.id = id;
        this.stud_id = stud_id;
        this.title = title;
        this.score_l = score_l;
        this.score_num = score_num;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getScore_l() {
        return score_l;
    }

    public int getScore_num() {
        return score_num;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStud_id(int stud_id) {
        this.stud_id = stud_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setScore_l(String score_l) {
        this.score_l = score_l;
    }

    public void setScore_num(int score_num) {
        this.score_num = score_num;
    }

    public int getStud_id() {
        return stud_id;
    }
    
    
}