package io.clubhouse4j.api.v3beta;

import java.time.Instant;
import java.util.List;

public class UpdateMilestoneParams {
    /**
     * The ID of the Milestone we want to move this Milestone after.
     */
    public Long after_id;

    /**
     * The ID of the Milestone we want to move this Milestone before.
     */
    public Long before_id;

    /**
     * An array of IDs of Categories attached to the Milestone.
     */
    public List<CreateCategoryParams> categories;

    /**
     * A manual override for the time/date the Milestone was completed.
     */
    public Instant completed_at_override;

    /**
     * The Milestone’s description.
     */
    public String description;

    /**
     * The name of the Milestone.
     */
    public String name;

    /**
     * A manual override for the time/date the Milestone was started.
     */
    public Instant started_at_override;

    /**
     * The workflow state that the Milestone is in (done, in progress, to do).
     */
    public String state;
}
