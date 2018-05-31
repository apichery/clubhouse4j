package io.clubhouse4j.api.v3beta;

import java.time.Instant;
import java.util.List;

/**
 * Details of the workflow associated with the Team.
 */
public class Workflow {
    /**
     * Indicates if an owner is automatically assigned when an unowned story is started.
     */
    public Boolean auto_assign_owner;

    /**
     * The date the Workflow was created.
     */
    public Instant created_at;

    /**
     * The unique ID of the default state that new Stories are entered into.
     */
    public Long default_state_id;

    /**
     * A description of the workflow.
     */
    public String description;

    /**
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * The unique ID of the Workflow.
     */
    public Long id;

    /**
     * The name of the workflow.
     */
    public String name;

    /**
     * A map of the states in this Workflow.
     */
    public List<WorkflowState> states;

    /**
     * The ID of the team the workflow belongs to.
     */
    public Long team_id;

    /**
     * The date the Workflow was updated.
     */
    public Instant updated_at;
}
