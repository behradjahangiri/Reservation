package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity(name = "ClassEntity")
@Table(name = "CLASS")


public class ClassInfo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer classID;
    private String className;
    private Integer classDuration;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
//    private LocalDateTime dateClassStart;
//    private LocalDateTime dateClassEnd;

}
