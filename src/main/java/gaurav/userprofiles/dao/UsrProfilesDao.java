package gaurav.userprofiles.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import gaurav.userprofiles.entities.UsrProfile;

public interface UsrProfilesDao extends JpaRepository<UsrProfile, Long> {

}
