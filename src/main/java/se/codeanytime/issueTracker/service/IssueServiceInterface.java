package se.codeanytime.issueTracker.service;

import org.springframework.stereotype.Repository;
import se.codeanytime.issueTracker.entity.Issue;

import java.util.List;
@Repository
public interface IssueServiceInterface{
    public List<Issue> getIssues();
    public Issue getIssue(int issueId);
    public void addIssue(Issue issue);
    public Issue uppdateIssue(int issueId);
    public void deleteIssue(int issueId);
}
