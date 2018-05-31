package io.clubhouse.api.v3beta;

public class EpicWorkflowService extends ClubhouseService {

    private static final String EPIC_WORKFLOW = "epic-workflow";

    public EpicWorkflowService(ClubhouseClient client) {
        super(client);
    }

    /**
     * Get Epic Workflow returns the Epic Workflow for the organization.
     */
    public EpicWorkflow getEpicWorkflow() {
        String url = client.buildUrl(EPIC_WORKFLOW);
        return executeGet(url, EpicWorkflow.class);
    }
}
