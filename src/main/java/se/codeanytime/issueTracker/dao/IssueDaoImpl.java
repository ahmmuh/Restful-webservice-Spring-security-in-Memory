package se.codeanytime.issueTracker.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.codeanytime.issueTracker.entity.Issue;

import java.util.List;
@Service
public class IssueDaoImpl implements IssueInterface{
    private EntityManager entityManager;

    @Autowired
    public IssueDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Issue> getIssues() {
        TypedQuery<Issue> query = entityManager.createQuery("select i from Issue i",Issue.class);
        return query.getResultList();
    }

    @Override
    public Issue getIssue(int issueId) {
        Issue issueTypedQuery = entityManager.find(Issue.class,issueId);
        return issueTypedQuery;
    }

    @Override
    @Transactional
    public void addIssue(Issue issue) {
    entityManager.persist(issue);
    }

    @Override
    @Transactional
    public Issue uppdateIssue(int issueId) {
        Issue updatedIssue =  entityManager.find(Issue.class,issueId);
      return  entityManager.merge(updatedIssue);
    }
    @Override
    @Transactional
    public void deleteIssue(int issueId) {
      Issue deletedIssue =  entityManager.find(Issue.class,issueId);
    entityManager.remove(deletedIssue);
    }


}
