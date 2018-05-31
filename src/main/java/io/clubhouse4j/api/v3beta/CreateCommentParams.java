package io.clubhouse.api.v3beta;

import java.time.Instant;
import java.util.UUID;

public class CreateCommentParams {
    /**
     * The unique ID of the Member who is the Comment’s author.
     */
    public UUID author_id;

    /**
     * The time/date when the Comment was created.
     */
    public Instant created_at;

    /**
     * An optional user-defined ID perhaps associating Comment with an outside tool.
     */
    public String external_id;

    /**
     * The text of the Comment.
     */
    public String text;

    /**
     * The time/date when the Comment was updated.
     */
    public Instant updated_at;
}
