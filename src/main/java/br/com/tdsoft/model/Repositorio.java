/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tdsoft.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;


/**
 *
 * @author Elivelton Cabral
 */
@Data
@Entity(name = "repositories")
public class Repositorio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    
    @Column(name = "assignable_users")
    private int assignableUsers;

    @Column(name = "code_of_conduct")
    private String codeOfConduct;
    
    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
    
    @Column(name = "database_id")
    private int databaseId;
    
    @Column(name = "default_branch")
    private String defaultBranch;
    
    @Column(name = "delete_branch_on_merge")
    private boolean deleteBranchOnMerge;
    
    @Column
    private String description;
    
    @Column(name = "disk_usage")
    private int diskUsage;
    
    @Column
    private int forks;
    
    @Column(name = "funding_links", columnDefinition = "json")
    private String fundingLinks;
    
    @Column(name = "has_issues_enabled")
    private boolean hasIssuesEnabled;
    
    @Column(name = "has_projects_enabled")
    private boolean hasProjectsEnabled;
    
    @Column(name = "has_wiki_enabled")
    private boolean hasWikiEnabled;
    
    @Column(name = "homepage_url")
    private String homepageUrl;
    
    @Column(name = "is_archived")
    private boolean isArchived;
    
    @Column(name = "is_blank_issues_enabled")
    private boolean isBlankIssuesEnabled;
    
    @Column(name = "is_disabled")
    private boolean isDisabled;
    
    @Column(name = "is_empty")
    private boolean isEmpty;
    
    @Column(name = "is_fork")
    private boolean isFork;
    
    @Column(name = "is_in_organization")
    private boolean isInOrganization;
    
    @Column(name = "is_locked")
    private boolean isLocked;
    
    @Column(name = "is_mirror")
    private boolean isMirror;
    
    @Column(name = "is_private")
    private boolean isPrivate;
    
    @Column(name = "is_security_policy_enabled")
    private boolean isSecurityPolicyEnabled;
    
    @Column(name = "is_template")
    private boolean isTemplate;
    
    @Column(name = "is_user_configuration_repository")
    private boolean isUserConfigurationRepository;
    
    @Column
    private int issues;
    
    @Column
    private int labels;
    
    @Column(columnDefinition = "json")
    private String languages;
    
    @Column(name = "license_info")
    private String licenseInfo;
    
    @Column(name = "lock_reason")
    private String lockReason;
    
    @Column(name = "mentionable_users")
    private int mentionableUsers;
    
    @Column(name = "merge_commit_allowed")
    private boolean mergeCommitAllowed;
    
    @Column
    private int milestones;
    
    @Column(name = "mirror_url")
    private String mirrorUrl;
    
    @Column
    private String name;
    
    @Column(name = "name_with_owner")
    private String nameWithOwner;
    
    @Column(name = "open_graph_image_url")
    private String openGraphImageUrl;
    
    @OneToOne
    @JoinColumn(name = "owner", nullable = false)
    private Ator owner;
    
    @Column
    private String parent;
    
    @Column(name = "primary_language")
    private String primaryLanguage;
    
    @Column(name = "pushed_at")
    @Temporal(TemporalType.DATE)
    private Date pushedAt;
    
    @Column(name = "pull_requests")
    private int pullRequests;
    
    @Column(name = "rebase_merge_allowed")
    private boolean rebaseMergeAllowed;
    
    @Column
    private int releases;
    
    @Column(name = "repository_topics", columnDefinition = "json")
    private String repositoryTopics;
    
    @Column(name = "squash_merge_allowed")
    private boolean squashMergeAllowed;
    
    @Column
    private int stargazers;
    
    @Column
    private int tags;
    
    @Column(name = "template_repository")
    private String templateRepository;
    
    @Column(name = "updated_at")
    @Temporal(TemporalType.DATE)
    private Date updatedAt;
    
    @Column
    private String url;
    
    @Column(name = "uses_custom_open_graph_image")
    private boolean usesCustomOpenGraphImage;
    
    @Column(name = "vulnerability_alerts")
    private int vulnerabilityAlerts;
    
    @Column
    private int watchers;

}
