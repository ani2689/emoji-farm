package com.ani.emojifarm.domain.field.domain.entity;

import com.ani.emojifarm.domain.field.domain.entity.cropsEnum.Status;
import lombok.Builder;
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

    @Builder
    public Crops(String name) {
        this.name = name;
        this.emojiName = ":seedling:";
    }

    public void sprout(){
        this.emojiName = ":herb:";
    }

    public void fruitful(){
        this.emojiName = ":"+name+":";
    }

    public void watering(){
        status = Status.DANK;
    }

    public void drying(){
        status = Status.DRIED;
    }


}
