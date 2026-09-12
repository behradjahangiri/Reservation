package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalTime;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity(name = "ClassEntity")
//@Table(name = "CLASS_INFO")


public class ClassInfo extends BaseEntity {
    public final static String FIND_ALL = "ClassInfo.findAll";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer classID;
    private String className;
    private LocalTime startTime;
    private LocalTime endTime;
    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;
//    private LocalDateTime dateClassStart;
//    private LocalDateTime dateClassEnd;
}
