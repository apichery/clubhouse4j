package io.clubhouse4j.api.v3beta;

import java.time.Instant;
import java.util.List;

public class EpicWorkflow {
    /**
     * The date the Epic Workflow was created.
     */
    public Instant created_at;

    /**
     * The unique ID of the default Epic State that new Epics are assigned by default.
     */
    public Long default_epic_state_id;

    /**
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * A map of the Epic States in this Epic Workflow.
     */
    public List<EpicState> epic_states;

    /**
     * The unique ID of the Epic Workflow.
     */
    public Long id;

    /**
     * The date the Epic Workflow was updated.
     */
    public Instant updated_at;
}
