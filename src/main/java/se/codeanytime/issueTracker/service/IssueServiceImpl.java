package se.codeanytime.issueTracker.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.codeanytime.issueTracker.dao.IssueInterface;
import se.codeanytime.issueTracker.entity.Issue;

import java.util.List;
@Service
public class IssueServiceImpl implements IssueServiceInterface {

    private IssueInterface issueInterface;

    @Autowired
    public IssueServiceImpl(IssueInterface issueInterface) {
        this.issueInterface = issueInterface;
    }

    @Override
    public List<Issue> getIssues() {
        return issueInterface.getIssues();
    }

    @Override
    public Issue getIssue(int issueId) {
        return issueInterface.getIssue(issueId);
    }

    @Override
    @Transactional
    public void addIssue(Issue issue) {
        issueInterface.addIssue(issue);
    }

    @Override
    @Transactional
    public Issue uppdateIssue(int issueId) {
       return issueInterface.uppdateIssue(issueId);
    }
    @Override
    @Transactional
    public void deleteIssue(int issueId) {
    issueInterface.deleteIssue(issueId);
    }


}
