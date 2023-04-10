package com.ani.emojifarm.domain.field.entity;

import com.ani.emojifarm.domain.field.entity.fieldEnum.Status;
import lombok.Builder;
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

    public void updateCrops(Crops crops){
        this.crops = crops;
    }

    public int harvest(){
        status = Status.EMPTY;
        int price = crops.getPrice();
        crops = null;
        return price;
    }

    @Builder
    public Field(Long id, Status status, Crops crops) {
        this.id = id;
        this.status = status;
        this.crops = crops;
    }


}
