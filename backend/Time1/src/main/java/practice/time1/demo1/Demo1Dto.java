package practice.time1.demo1;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "demo1")
public class Demo1Dto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;
    @Column(nullable = false, length = 160)
    @NotBlank(message = "Name is mandatory")
    private String name;
    @Column(nullable = false)
    private LocalDateTime time;
    @Column
    @CreationTimestamp
    private LocalDateTime ctime;
    @Column
    @UpdateTimestamp
    private LocalDateTime mtime;
}
