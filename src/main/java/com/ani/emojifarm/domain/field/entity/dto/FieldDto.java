package com.ani.emojifarm.domain.field.entity.dto;

import com.ani.emojifarm.domain.field.entity.Crops;
import com.ani.emojifarm.domain.field.entity.Field;
import com.ani.emojifarm.domain.field.entity.fieldEnum.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
