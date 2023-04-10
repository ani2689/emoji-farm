package com.ani.emojifarm.domain.field.repository;

import com.ani.emojifarm.domain.field.entity.Field;
import com.ani.emojifarm.domain.field.entity.fieldEnum.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldRepository extends JpaRepository<Field,Long> {
    Field findByStatus(Status status);
}
