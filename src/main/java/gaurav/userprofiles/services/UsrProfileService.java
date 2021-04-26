package gaurav.userprofiles.services;

import java.util.List;
import gaurav.userprofiles.entities.UsrProfile;

public interface UsrProfileService {

	public List<UsrProfile> getUsrProfiles();

	public UsrProfile getUsrProfile(long userId);

	public UsrProfile addUsrProfile(UsrProfile usrProfile);
	
	public UsrProfile updateUsrProfile(UsrProfile usrProfile);
	
	public void deleteUsrProfile(long userId);
	
}
