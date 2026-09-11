package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity(name = "DayEntity")
@Table(name = "DAYS")


public class Day extends BaseEntity {
    public final static String FIND_ALL = "Day.FIND_ALL";
    @Id
    private Integer id;
    private DayOfWeek dayOfWeek;
    private List<ClassInfo> classList = new ArrayList<>();
//    private int classNumbers = classList.size();
}
