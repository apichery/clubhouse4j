package io.clubhouse4j.api.v3beta;

import java.time.Instant;
import java.util.List;

/**
 * Group of Projects with the same Workflow.
 */
public class Team {
    /**
     * The time/date the Team was created.
     */
    public Instant created_at;

    /**
     * The description of the Team.
     */
    public String description;

    /**
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * The unique identifier of the Team.
     */
    public Long id;

    /**
     * The name of the Team.
     */
    public String name;

    /**
     * A number representing the position of the Team in relation to every other Team within the Organization.
     */
    public Long position;

    /**
     * An array of IDs of projects within the Team.
     */
    public List<Long> project_ids;

    /**
     * The time/date the Team was last updated.
     */
    public Instant updated_at;

    /**
     * Details of the workflow associated with the Team.
     */
    public Workflow workflow;
}
