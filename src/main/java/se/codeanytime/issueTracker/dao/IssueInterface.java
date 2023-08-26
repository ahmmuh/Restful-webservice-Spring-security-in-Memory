package se.codeanytime.issueTracker.dao;

import org.springframework.stereotype.Repository;
import se.codeanytime.issueTracker.entity.Issue;

import java.util.List;

@Repository
public interface IssueInterface {
    public List<Issue> getIssues();
    public Issue getIssue(int issueId);
    public void addIssue(Issue issue);
    public void deleteIssue(int issueId);
    public Issue uppdateIssue( int issueId);

}
