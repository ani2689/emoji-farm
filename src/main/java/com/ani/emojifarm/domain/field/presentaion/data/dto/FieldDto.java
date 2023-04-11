package com.ani.emojifarm.domain.field.presentaion.data.dto;

import com.ani.emojifarm.domain.field.domain.entity.Crops;
import com.ani.emojifarm.domain.field.domain.entity.Field;
import com.ani.emojifarm.domain.field.domain.entity.fieldEnum.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class FieldDto {
    private Long id;
    private Status status;
    private Crops crops;
}
