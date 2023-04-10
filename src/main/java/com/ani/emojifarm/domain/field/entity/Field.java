package com.ani.emojifarm.domain.field.entity;

import com.ani.emojifarm.domain.field.entity.fieldEnum.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Field {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private Status status = Status.EMPTY;

    @JoinColumn(name = "planted_crops")
    @OneToOne
    private Crops crops;

}
