package com.ani.emojifarm.domain.field.presentaion.data.dto;

import com.ani.emojifarm.domain.field.domain.entity.Crops;
import com.ani.emojifarm.domain.field.domain.entity.Field;
import com.ani.emojifarm.domain.field.domain.entity.fieldEnum.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FieldDto {
    private Long id;

    private Status status;

    private Crops crops;

    public Field toEntity(){
        return Field.builder()
                .id(id)
                .status(status)
                .crops(crops)
                .build();
    }

}
