package com.ani.emojifarm.entityBuilderTest;


import com.ani.emojifarm.domain.user.entity.User;
import org.junit.jupiter.api.Test;

public class UserBuilder {
    
    @Test
    void createUser(){
        User user = User.builder()
                .name("안녕")
                .password("1234")
                .email("asdfg@ex.com")
                .build();

        System.out.println(user.getName());
    }
}
