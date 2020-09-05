package meetings.birras.service;

import meetings.birras.entity.Meeting;
import meetings.birras.repository.MeetingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MeetingsService {

    @Autowired
    private MeetingsRepository repository;

    public List<Meeting> getAllMeetings(){
        return repository.findAll();
    }
    public Meeting saveMeeting(Meeting meeting){
        meeting.setCreationDate(new Date());
        meeting.getGuests().forEach(guest -> guest.setMeeting(meeting));
        return repository.save(meeting);
    }

    public Meeting getMeetingById(int id){
        return repository.findById(id).orElse(null);
    }

    public Meeting updateMeeting(Meeting meeting){
        Meeting existingMeeting = repository.findById(meeting.getId()).orElse(null);
        //update meeting...
        return repository.save(existingMeeting);
    }

}
