package io.clubhouse.api.v3beta;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class UpdateMultipleStoriesParams {
    /**
     * The ID of the story that the stories are to be moved below.
     */
    public Long after_id;

    /**
     * If the Stories should be archived or not.
     */
    public Boolean archived;

    /**
     * The due date of the story.
     */
    public Instant deadline;

    /**
     * The ID of the epic the story belongs to.
     */
    public Long epic_id;

    /**
     * The numeric point estimate of the story. Can also be null, which means unestimated.
     */
    public Long estimate;

    /**
     * The UUIDs of the new followers to be added.
     */
    public List<UUID> follower_ids_add;

    /**
     * The UUIDs of the followers to be removed.
     */
    public List<UUID> follower_ids_remove;

    /**
     * An array of labels to be added.
     */
    public List<CreateLabelParams> labels_add;

    /**
     * An array of labels to be removed.
     */
    public List<CreateLabelParams> labels_remove;

    /**
     * The UUIDs of the new owners to be added.
     */
    public List<UUID> owner_ids_add;

    /**
     * The UUIDs of the owners to be removed.
     */
    public List<UUID> owner_ids_remove;

    /**
     * The ID of the Project the Stories should belong to.
     */
    public Long project_id;

    /**
     * The ID of the member that requested the story.
     */
    public UUID requested_by_id;

    /**
     * Required. The unique IDs of the Stories you wish to update.
     */
    public List<Long> story_ids;

    /**
     * The type of story (feature, bug, chore).
     */
    public String story_type;

    /**
     * The ID of the workflow state the story is currently in.
     */
    public Long workflow_state_id;
}
