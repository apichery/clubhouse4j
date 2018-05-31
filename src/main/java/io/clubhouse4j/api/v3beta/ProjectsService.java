package io.clubhouse.api.v3beta;

import java.util.List;

import com.google.common.collect.Lists;

public class ProjectsService extends ClubhouseService {

    private static final String PROJECTS = "projects";

    public ProjectsService(ClubhouseClient client) {
        super(client);
    }

    public List<Project> listProjects() {
        String url = client.buildUrl(PROJECTS);
        return Lists.newArrayList(executeGet(url, Project[].class));
    }
}
