package com.ani.emojifarm.domain.field.service;

import com.ani.emojifarm.domain.field.entity.Field;
import com.ani.emojifarm.domain.field.entity.dto.FieldDto;
import com.ani.emojifarm.domain.field.entity.fieldEnum.Status;
import com.ani.emojifarm.domain.field.repository.FieldRepository;
import com.ani.emojifarm.domain.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveFieldService {
    @Autowired
    private FieldRepository fieldRepository;

    void harvestCrops(FieldDto fieldDto, User user){

        Field field = fieldDto.toEntity();

        if(field.getStatus()== Status.HARVESTABLE){
            user.earnCoin(field.harvest());
        }else{
            //수확할 수 있는 상태가 아니에요.
        }
    }
}
