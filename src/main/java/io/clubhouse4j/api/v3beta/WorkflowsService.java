package io.clubhouse4j.api.v3beta;

import java.io.IOException;
import java.util.List;

import com.google.common.collect.Lists;

public class WorkflowsService extends ClubhouseService {

    private static final String WORKFLOWS = "workflows";

    public WorkflowsService(ClubhouseClient client) {
        super(client);
    }

    public List<Workflow> listWorkflows() throws IOException {
        String url = client.buildUrl(WORKFLOWS);
        return Lists.newArrayList(executeGet(url, Workflow[].class));
    }
}
