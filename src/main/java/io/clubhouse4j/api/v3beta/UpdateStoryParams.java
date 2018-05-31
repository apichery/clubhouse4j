package io.clubhouse.api.v3beta;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class UpdateStoryParams {
    /**
     * The ID of the story we want to move this story after.
     */
    public Long after_id;

    /**
     * True if the story is archived, otherwise false.
     */
    public Boolean archived;

    /**
     * The ID of the story we want to move this story before.
     */
    public Long before_id;

    /**
     * An array of IDs of Branches attached to the story.
     */
    public List<Long> branch_ids;

    /**
     * An array of IDs of Commits attached to the story.
     */
    public List<Long> commit_ids;

    /**
     * A manual override for the time/date the Story was completed.
     */
    public Instant completed_at_override;

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
     * The title of the story.
     */
    public String name;

    /**
     * An array of UUIDs of the owners of this story.
     */
    public List<UUID> owner_ids;

    /**
     * The ID of the project the story belongs to.
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
     * The type of story (feature, bug, chore).
     */
    public String story_type;

    /**
     * The ID of the workflow state the story is currently in.
     */
    public Long workflow_state_id;
}
