package io.clubhouse.api.v3beta;

import java.time.Instant;
import java.util.List;

public class CreateMilestoneParams {
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
     * Required. The name of the Milestone.
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
