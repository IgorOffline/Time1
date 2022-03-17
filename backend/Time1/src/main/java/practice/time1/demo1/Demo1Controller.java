package practice.time1.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"})
@RestController
@RequestMapping("/demo1")
public class Demo1Controller {

    @Autowired
    private Demo1Repository demo1Repository;

    @GetMapping
    public List<Demo1Dto> get() {
        return demo1Repository.findAll();
    }

    @PostMapping("/uuid")
    public Demo1Dto postUuid() {
        var demo1Dto = new Demo1Dto();
        demo1Dto.setName(UUID.randomUUID().toString());
        demo1Dto.setTime(LocalDateTime.now());
        demo1Dto = demo1Repository.save(demo1Dto);
        return demo1Dto;
    }

    @PostMapping
    public Demo1Dto post(@Valid @RequestBody Demo1Req demo1) {
        var demo1Dto = new Demo1Dto();
        demo1Dto.setName(demo1.getName());
        demo1Dto.setTime(demo1.getTime());
        demo1Dto = demo1Repository.save(demo1Dto);
        return demo1Dto;
    }
}
