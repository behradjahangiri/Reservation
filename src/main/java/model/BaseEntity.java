package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;

@MappedSuperclass

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@ToString

public abstract class BaseEntity {
    private boolean deleted;
}
