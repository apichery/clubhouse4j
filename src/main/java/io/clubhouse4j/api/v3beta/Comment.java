package io.clubhouse4j.api.v3beta;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class Comment {
    /**
     * The unique ID of the Member who is the Comment’s author.
     */
    public UUID author_id;

    /**
     * The time/date when the Comment was created.
     */
    public Instant created_at;

    /**
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * This field can be set to another unique ID. In the case that the Comment has been imported from another tool, the ID in the other tool can be indicated here.
     */
    public String external_id;

    /**
     * The unique ID of the Comment.
     */
    public Long id;

    /**
     * The unique IDs of the Member who are mentioned in the Comment.
     */
    public List<UUID> mention_ids;

    /**
     * The Comments numerical position in the list from oldest to newest.
     */
    public Long position;

    /**
     * The ID of the Story on which the Comment appears.
     */
    public Long story_id;

    /**
     * The text of the Comment.
     */
    public String text;

    /**
     * The time/date when the Comment was updated.
     */
    public Instant updated_at;
}
