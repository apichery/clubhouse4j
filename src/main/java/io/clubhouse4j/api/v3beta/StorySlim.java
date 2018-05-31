package io.clubhouse.api.v3beta;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class StorySlim {
    /**
     * The Clubhouse application url for the Story.
     */
    public String app_url;

    /**
     * True if the story has been archived or not.
     */
    public Boolean archived;

    /**
     * A true/false boolean indicating if the Story is currently blocked.
     */
    public Boolean blocked;

    /**
     * A true/false boolean indicating if the Story is currently a blocker of another story.
     */
    public Boolean blocker;

    /**
     * An array of IDs of Comments attached to the story.
     */
    public List<Long> comment_ids;

    /**
     * A true/false boolean indicating if the Story has been completed.
     */
    public Boolean completed;

    /**
     * The time/date the Story was completed.
     */
    public Instant completed_at;

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
     * A string description of this resource.
     */
    public String entity_type;

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
     * An array of External Tickets associated with a Story
     */
    public List<ExternalTicket> external_tickets;

    /**
     * An array of IDs of Files attached to the story.
     */
    public List<Long> file_ids;

    /**
     * An array of UUIDs for any Members listed as Followers.
     */
    public List<UUID> follower_ids;

    /**
     * The unique ID of the Story.
     */
    public Long id;

    /**
     * An array of labels attached to the story.
     */
    public List<Label> labels;

    /**
     * An array of IDs of LinkedFiles attached to the story.
     */
    public List<Long> linked_file_ids;

    /**
     * Not documented
     */
    public List<UUID> mention_ids;

    /**
     * The time/date the Story was last changed workflow-state.
     */
    public Instant moved_at;

    /**
     * The name of the story.
     */
    public String name;

    /**
     * An array of UUIDs of the owners of this story.
     */
    public List<UUID> owner_ids;

    /**
     * A number representing the position of the story in relation to every other story in the current project.
     */
    public Long position;

    /**
     * The ID of the project the story belongs to.
     */
    public Long project_id;

    /**
     * The ID of the Member that requested the story.
     */
    public UUID requested_by_id;

    /**
     * A true/false boolean indicating if the Story has been started.
     */
    public Boolean started;

    /**
     * The time/date the Story was started.
     */
    public Instant started_at;

    /**
     * A manual override for the time/date the Story was started.
     */
    public Instant started_at_override;

    /**
     * An array of story links attached to the Story.
     */
    public List<TypedStoryLink> story_links;

    /**
     * The type of story (feature, bug, chore).
     */
    public String story_type;

    /**
     * An array of IDs of Tasks attached to the story.
     */
    public List<Long> task_ids;

    /**
     * The time/date the Story was updated.
     */
    public Instant updated_at;

    /**
     * The ID of the workflow state the story is currently in.
     */
    public Long workflow_state_id;
}
