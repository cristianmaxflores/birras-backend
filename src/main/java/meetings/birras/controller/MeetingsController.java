package meetings.birras.controller;

import meetings.birras.entity.Meeting;
import meetings.birras.service.MeetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RequestMapping("meetings")
@RestController
public class MeetingsController {

    @Autowired
    private MeetingsService service;

    @GetMapping
    public HashMap readMe(){
        HashMap map = new HashMap();
        map.put("version", "1.0");
        return map;
    }

    @PostMapping("/add")
    public Meeting addMeeting(@RequestBody Meeting meeting){
        return service.saveMeeting(meeting);
    }

    @GetMapping("/{id}")
    public Meeting getMeeting(@PathVariable int id){
        return service.getMeetingById(id);
    }

    @GetMapping("/all")
    public List<Meeting> getAllMeetings(){
        return service.getAllMeetings();
    }
}
