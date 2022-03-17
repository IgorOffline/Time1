package practice.time1.demo1;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Demo1Req {

    private String name;
    private LocalDateTime time;
}
