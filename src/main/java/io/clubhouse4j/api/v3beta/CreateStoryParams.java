package io.clubhouse4j.api.v3beta;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class CreateStoryParams {
    /**
     * Controls the story’s archived state.
     */
    public Boolean archived;

    /**
     * An array of comments to add to the story.
     */
    public List<CreateCommentParams> comments;

    /**
     * A manual override for the time/date the Story was completed.
     */
    public Instant completed_at_override;

    /**
     * The time/date the Story was created.
     */
    public Instant created_at;

    /**
     * The due date of the story.
     */
    public Instant deadline;

    /**
     * The description of the story.
     */
    public String description;

    /**
     * The ID of the epic the story belongs to.
     */
    public Long epic_id;

    /**
     * The numeric point estimate of the story. Can also be null, which means unestimated.
     */
    public Long estimate;

    /**
     * This field can be set to another unique ID. In the case that the Story has been imported from another tool, the ID in the other tool can be indicated here.
     */
    public String external_id;

    /**
     * An array of External Tickets associated with this story. These External Tickets must have unquie external id. Duplicated External Tickets will be removed.
     */
    public List<CreateExternalTicketParams> external_tickets;

    /**
     * An array of IDs of files attached to the story.
     */
    public List<Long> file_ids;

    /**
     * An array of UUIDs of the followers of this story.
     */
    public List<UUID> follower_ids;

    /**
     * An array of labels attached to the story.
     */
    public List<CreateLabelParams> labels;

    /**
     * An array of IDs of linked files attached to the story.
     */
    public List<Long> linked_file_ids;

    /**
     * Required. The name of the story.
     */
    public String name;

    /**
     * An array of UUIDs of the owners of this story.
     */
    public List<UUID> owner_ids;

    /**
     * Required. The ID of the project the story belongs to.
     */
    public Long project_id;

    /**
     * The ID of the member that requested the story.
     */
    public UUID requested_by_id;

    /**
     * A manual override for the time/date the Story was started.
     */
    public Instant started_at_override;

    /**
     * An array of story links attached to the story.
     */
    public List<CreateStoryLinkParams> story_links;

    /**
     * The type of story (feature, bug, chore).
     */
    public String story_type;

    /**
     * An array of tasks connected to the story.
     */
    public List<CreateTaskParams> tasks;

    /**
     * The time/date the Story was updated.
     */
    public Instant updated_at;

    /**
     * The ID of the workflow state the story is currently in.
     */
    public Long workflow_state_id;
}
