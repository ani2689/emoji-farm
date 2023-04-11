package com.ani.emojifarm.domain.field.service;

import com.ani.emojifarm.domain.field.domain.entity.Field;
import com.ani.emojifarm.domain.field.domain.repository.FieldRepository;
import com.ani.emojifarm.domain.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateFieldService {
    @Autowired
    private FieldRepository fieldRepository;

    void CreateFieldService(User user) {
        fieldRepository.save(user.addField(new Field()));
    }
}
