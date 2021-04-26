package gaurav.userprofiles.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gaurav.userprofiles.dao.UsrProfilesDao;
import gaurav.userprofiles.entities.UsrProfile;

@Component
public class UsrProfileServiceImpl implements UsrProfileService {
	
	@Autowired
	private UsrProfilesDao usrProfileDaoRef;
	
	public List<UsrProfile> getUsrProfiles() {
		return usrProfileDaoRef.findAll();
	}

	@Override
	public UsrProfile getUsrProfile(long userId) {
		return usrProfileDaoRef.getOne(userId);
	}

	@Override
	public UsrProfile addUsrProfile(UsrProfile usrProfile) {
		return usrProfileDaoRef.save(usrProfile);
	}

	@Override
	public UsrProfile updateUsrProfile(UsrProfile usrProfile) {
		usrProfileDaoRef.save(usrProfile);
		return usrProfile;
	}

	@Override
	public void deleteUsrProfile(long userId) {
		UsrProfile UsrProfile =  usrProfileDaoRef.getOne(userId);
		usrProfileDaoRef.delete(UsrProfile);
	}
}
