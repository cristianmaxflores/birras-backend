package meetings.birras.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RequestMapping("api")
@RestController
public class MeetingsController {

    @GetMapping
    public HashMap readMe(){
        HashMap map = new HashMap();
        map.put("version", "1.0");
        return map;
    }
}
