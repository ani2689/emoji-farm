package com.ani.emojifarm.domain.field.service;

import com.ani.emojifarm.domain.field.presentaion.data.dto.FieldDto;

import java.util.List;

public interface FindFieldService {
    List<FieldDto> findAllUserFields(FieldDto fieldDto);
}
