package com.ani.emojifarm.domain.field.presentaion.data.dto;

import com.ani.emojifarm.domain.field.domain.entity.cropsEnum.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CropsDto {
    private Long id;
    private String name;
    private String emojiName;
    private int price;
    private int growthRate;
    private Status status;
}
