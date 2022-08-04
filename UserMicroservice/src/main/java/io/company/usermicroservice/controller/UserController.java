package io.company.usermicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.company.usermicroservice.models.JudgeResponse;
import io.company.usermicroservice.models.Submission;
import io.company.usermicroservice.service.AppUserService;

@RestController
public class UserController {
	@Autowired
	private AppUserService appUserService;


	@PostMapping("/submit-code")
	public Submission submitCode(@RequestBody Submission request) {
		return appUserService.submitCodeToJudge(request);
	}
	
	@GetMapping("/get-submissions/{username}")
	public List<Submission> getSubmissions(@PathVariable String username) {
		return appUserService.getSubmissionByUsername(username);
	}

	@GetMapping("/get-contest-submission")
	public List<Submission> getSubmissionByContest(@RequestParam String username, @RequestParam String contestId){
		return appUserService.getInContestSubmissions(username, contestId);
	}

	@PutMapping("/update-submission")
	public void updateSubmission(@RequestBody JudgeResponse response) {
		appUserService.updateSubmission(response);
	}
}

