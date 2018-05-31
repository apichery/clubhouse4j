package io.clubhouse4j.api.v3beta;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class Epic {
    /**
     * True/false boolean that indicates whether the Epic is archived or not.
     */
    public Boolean archived;

    /**
     * A nested array of threaded comments.
     */
    //TODO public List<ThreadedComment> comments;

    /**
     * A true/false boolean indicating if the Epic has been completed.
     */
    public Boolean completed;

    /**
     * The time/date the Epic was completed.
     */
    public Instant completed_at;

    /**
     * A manual override for the time/date the Epic was completed.
     */
    public Instant completed_at_override;

    /**
     * The time/date the Epic was created.
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
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * The ID of the Epic State
     */
    public Long epic_state_id;

    /**
     * This field can be set to another unique ID. In the case that the Epic has been imported from another tool, the ID in the other tool can be indicated here.
     */
    public String external_id;

    /**
     * Not documented
     */
    //TODO public List<SupportTicket> external_tickets;

    /**
     * An array of UUIDs for any Members you want to add as Followers on this Epic.
     */
    public List<UUID> follower_ids;

    /**
     * The unique ID of the Epic.
     */
    public Long id;

    /**
     * An array of Labels attached to the Epic.
     */
    public List<Label> labels;

    /**
     * The ID of the Milestone this Epic is related to.
     */
    public Long milestone_id;

    /**
     * The name of the Epic.
     */
    public String name;

    /**
     * An array of UUIDs for any members you want to add as Owners on this new Epic.
     */
    public List<UUID> owner_ids;

    /**
     * The Epic’s relative position in the Epic workflow state.
     */
    public Long position;

    /**
     * The IDs of Projects related to this Epic.
     */
    public List<Long> project_ids;

    /**
     * The ID of the Member that requested the epic.
     */
    public UUID requested_by_id;

    /**
     * A true/false boolean indicating if the Epic has been started.
     */
    public Boolean started;

    /**
     * The time/date the Epic was started.
     */
    public Instant started_at;

    /**
     * A manual override for the time/date the Epic was started.
     */
    public Instant started_at_override;

    /**
     * The workflow state that the Epic is in.
     */
    public String state;

    /**
     * A group of calculated values for this Epic.
     */
    public EpicStats stats;

    /**
     * The time/date the Epic was updated.
     */
    public Instant updated_at;
}
