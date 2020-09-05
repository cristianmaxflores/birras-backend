package meetings.birras.repository;

import meetings.birras.entity.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingsRepository extends JpaRepository<Meeting, Integer  > {
}
