package se.codeanytime.issueTracker.controller;


import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;
import se.codeanytime.issueTracker.entity.Issue;
import se.codeanytime.issueTracker.service.IssueServiceInterface;

import java.util.List;

@RestController
@RequestMapping("api/issues")
@CrossOrigin(origins = "http://localhost:4200")
public class IssueController {
    private IssueServiceInterface issueServiceInterface;

    public IssueController(IssueServiceInterface issueServiceInterface) {
        this.issueServiceInterface = issueServiceInterface;
    }

    @GetMapping("/all")
    public List<Issue> getIssues(){
        List<Issue> issues = issueServiceInterface.getIssues();
        return issues;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Issue> getIssue(@PathVariable("id") int id){
        Issue issue = issueServiceInterface.getIssue(id);
        return ResponseEntity.ok().body(issue);
    }

    @PostMapping("/add")
    public void addIssue(@RequestBody Issue issue){
    issueServiceInterface.addIssue(issue);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Issue> updateIssue(@PathVariable("id") int issueId, @RequestBody Issue issueDetail){
       Issue updatedIssue = issueServiceInterface.getIssue(issueId);
       updatedIssue.setIssueName(issueDetail.getIssueName());
       updatedIssue.setIssueRapporter(issueDetail.getIssueRapporter());
       updatedIssue.setIssueDecription(issueDetail.getIssueDecription());
       updatedIssue.setClosed(issueDetail.getClosed());
       updatedIssue.setRegisterDate(issueDetail.getRegisterDate());
       issueServiceInterface.uppdateIssue(issueId);
       return ResponseEntity.ok(updatedIssue);
    }
    @DeleteMapping("/{id}")
    public void deleteIssue(@PathVariable("id") int issueId){
      issueServiceInterface.deleteIssue(issueId);
    }

}
