package gaurav.userprofiles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import gaurav.userprofiles.entities.UsrProfile;
import gaurav.userprofiles.services.UsrProfileService;

@RestController
public class UsrProfileController {
	
	@Autowired
	private UsrProfileService usrProfileServiceRef;
	
	@GetMapping("/")
	public String home() {
		return "This is home";
	}
	
	@GetMapping("/userProfile")
	public List<UsrProfile> getUserProfiles() {
		return this.usrProfileServiceRef.getUsrProfiles();
	}
	
	@GetMapping("/userProfile/{userId}")
	public UsrProfile getUserProfile(@PathVariable String userId) {
		return this.usrProfileServiceRef.getUsrProfile(Long.parseLong(userId));
	}
	
	@PostMapping(path="/userProfile", consumes="application/json")
	@CrossOrigin(origins = "http://localhost:8080")
	public UsrProfile addUserProfile(@RequestBody UsrProfile usrProfile) {
		return this.usrProfileServiceRef.addUsrProfile(usrProfile);
	}
}
