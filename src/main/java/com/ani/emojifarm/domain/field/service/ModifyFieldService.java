package com.ani.emojifarm.domain.field.service;

import com.ani.emojifarm.domain.field.presentaion.data.dto.FieldDto;

public interface ModifyFieldService {

    void plantCrops(FieldDto fieldDto, String cropsName);

    void waterCrops(FieldDto fieldDto);
}
