package com.ani.emojifarm.domain.user.entity;

import com.ani.emojifarm.domain.field.domain.entity.Field;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    private String email;

    private int coin;

    @OneToMany
    private List<Field> fields;

    public void earnCoin(int coin){
        this.coin += coin;
    }

    public Field addField(Field field){
        fields.add(field);
        return field;
    }

    @Builder
    public User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }
}
