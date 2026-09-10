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

@Entity
@Table

public class Day extends BaseEntity {
    @Id
    private Integer id;
    private DayOfWeek dayOfWeek;
    private int classNumbers = 0;
    private List<ClassInfo> classList = new ArrayList<>();

}
