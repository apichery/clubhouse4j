package io.clubhouse4j.api.v3beta;

import java.time.Instant;
import java.util.List;

/**
 * A Milestone is a collection of Epics that represent a release or some other large initiative that your organization is working on.
 */
public class Milestone {
    /**
     * An array of Categories attached to the Milestone.
     */
    public List<Category> categories;

    /**
     * A true/false boolean indicating if the Milestone has been completed.
     */
    public Boolean completed;

    /**
     * The time/date the Milestone was completed.
     */
    public Instant completed_at;

    /**
     * A manual override for the time/date the Milestone was completed.
     */
    public Instant completed_at_override;

    /**
     * The time/date the Milestone was created.
     */
    public Instant created_at;

    /**
     * The Milestone’s description.
     */
    public String description;

    /**
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * The unique ID of the Milestone.
     */
    public Long id;

    /**
     * The name of the Milestone.
     */
    public String name;

    /**
     * A number representing the position of the Milestone in relation to every other Milestone within the Organization.
     */
    public Long position;

    /**
     * A true/false boolean indicating if the Milestone has been started.
     */
    public Boolean started;

    /**
     * The time/date the Milestone was started.
     */
    public Instant started_at;

    /**
     * A manual override for the time/date the Milestone was started.
     */
    public Instant started_at_override;

    /**
     * The workflow state that the Milestone is in.
     */
    public String state;

    /**
     * The time/date the Milestone was updated.
     */
    public Instant updated_at;

}
