package com.ani.emojifarm.domain.field.service;

import com.ani.emojifarm.domain.field.presentaion.data.dto.FieldDto;
import com.ani.emojifarm.domain.user.entity.User;

public interface RemoveFieldService {
    void harvestCrops(FieldDto fieldDto, User user);

}
