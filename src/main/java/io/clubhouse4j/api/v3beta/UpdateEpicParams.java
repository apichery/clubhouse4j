package io.clubhouse4j.api.v3beta;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class UpdateEpicParams {
    /**
     * The ID of the Epic we want to move this Epic after.
     */
    public Long after_id;

    /**
     * A true/false boolean indicating whether the Epic is in archived state.
     */
    public Boolean archived;

    /**
     * The ID of the Epic we want to move this Epic before.
     */
    public Long before_id;

    /**
     * A manual override for the time/date the Epic was completed.
     */
    public Instant completed_at_override;

    /**
     * The Epic’s deadline.
     */
    public Instant deadline;

    /**
     * The Epic’s description.
     */
    public String description;

    /**
     * The ID of the Epic State
     */
    public Long epic_state_id;

    /**
     * An array of UUIDs for any Members you want to add as Followers on this Epic.
     */
    public List<UUID> follower_ids;

    /**
     * An array of Labels attached to the Epic.
     */
    public List<CreateLabelParams> labels;

    /**
     * The ID of the Milestone this Epic is related to.
     */
    public Long milestone_id;

    /**
     * The Epic’s name.
     */
    public String name;

    /**
     * An array of UUIDs for any members you want to add as Owners on this Epic.
     */
    public List<UUID> owner_ids;

    /**
     * The ID of the member that requested the epic.
     */
    public UUID requested_by_id;

    /**
     * A manual override for the time/date the Epic was started.
     */
    public Instant started_at_override;
}
