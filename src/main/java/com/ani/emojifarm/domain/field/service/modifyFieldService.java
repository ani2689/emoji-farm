package com.ani.emojifarm.domain.field.service;

import com.ani.emojifarm.domain.field.entity.Crops;
import com.ani.emojifarm.domain.field.entity.Field;
import com.ani.emojifarm.domain.field.entity.cropsEnum.Status;
import com.ani.emojifarm.domain.field.entity.dto.FieldDto;
import com.ani.emojifarm.domain.field.repository.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class modifyFieldService {

    @Autowired
    private FieldRepository fieldRepository;

    void plantCrops(FieldDto fieldDto, String cropsName){
        fieldDto.toEntity().updateCrops(Crops.builder()
                .name(cropsName)
                .build());
    }

    void waterCrops(FieldDto fieldDto){
        Field field = fieldDto.toEntity();
        if(field.getCrops().getStatus()== Status.DRIED){
            field.getCrops().watering();
        }else{
            // 이미 축축해요
        }
    }
}
