package com.example.board.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;
    // 24.01.05
    @Column(nullable = false)
    private String writer;

    @Column(nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date Cre_Date = new Date();

    public String getCreDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(Cre_Date);
    }
}
