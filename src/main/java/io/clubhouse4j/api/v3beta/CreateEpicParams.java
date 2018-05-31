package io.clubhouse4j.api.v3beta;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class CreateEpicParams {
    /**
     * A manual override for the time/date the Epic was completed.
     */
    public Instant completed_at_override;

    /**
     * Defaults to the time/date it is created but can be set to reflect another date.
     */
    public Instant created_at;

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
     * This field can be set to another unique ID. In the case that the Epic has been imported from another tool, the ID in the other tool can be indicated here.
     */
    public String external_id;

    /**
     * An array of UUIDs for any Members you want to add as Followers on this new Epic.
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
     * Required. The Epic’s name.
     */
    public String name;

    /**
     * An array of UUIDs for any members you want to add as Owners on this new Epic.
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

    /**
     * Deprecated The Epic’s state (to do, in progress, or done).
     */
    public String state;

    /**
     * Defaults to the time/date it is created but can be set to reflect another date.
     */
    public Instant updated_at;
}
