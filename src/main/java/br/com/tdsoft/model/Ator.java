/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tdsoft.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author Elivelton Cabral
 */
@Data
@Entity(name = "actors")
public class Ator implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    @Column
    private String type;
    @Column
    private String login;
    @Column(name = "avatar_url")
    private String avatarUrl;
//    @Column(name = "__updated_at")
//    private String updatedAt;
//    @Column
//    private String bio;
//    @Column
//    private String company;
//    @Temporal(TemporalType.DATE)
//    @Column(name = "created_at")
//    private Date createdAt;
//    @Column
//    private int databaseId;
//    @Column
//    private String email;
//    @Column
//    private int followers;
//    @Column
//    private int following;
//    @Column
//    private int gists;
//    @Column(name = "is_bounty_hunter")
//    private boolean isBountyHunter;
//    @Column(name = "is_campus_expert")
//    private boolean isCampusExpert;
//    @Column(name = "is_developer_program_member")
//    private boolean isDeveloperProgramMember;
//    @Column(name = "is_employee")
//    private boolean isEmployee;
//    @Column(name = "is_hireable")
//    private boolean isHireable;
//    @Column(name = "is_site_admin")
//    private boolean isSiteAdmin;
//    @Column
//    private String location;
//    @Column
//    private String name;
//    @Column
//    private int projects;
//    @Column(name = "projects_url")
//    private String projectsUrl;
//    @Column
//    private int repositories;
//    @Column(name = "repositories_contributed_to")
//    private int repositoriesContributedTo;
//    @Column(name = "starred_repositories")
//    private int starredRepositories;
//    @Column(columnDefinition = "json")
//    private String status;
//    @Column(name = "twitter_username")
//    private String twitterUsername;
//    @Temporal(TemporalType.DATE)
//    @Column(name = "updated_at")
//    private String updated_at;
//    @Column
//    private int watching;
//    @Column(name = "website_url")
//    private String websiteUrl;
//    @Column
//    private String description;
//    @Column(name = "is_verified")
//    private boolean isVerified;
//    @Column(name = "members_with_role")
//    private int membersWithRole;
//    @Column
//    private int teams;
//    @Column
//    private String user;

}
