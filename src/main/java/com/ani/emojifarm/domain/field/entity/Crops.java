package com.ani.emojifarm.domain.field.entity;

import com.ani.emojifarm.domain.field.entity.cropsEnum.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Crops {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "emoji_name")
    private String emojiName;

    private Status status = Status.DRIED;

    private int price;

    @Column(name = "growth_rate")
    private int growthRate;



}
