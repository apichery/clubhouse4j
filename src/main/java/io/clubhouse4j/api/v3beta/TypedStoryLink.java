package io.clubhouse4j.api.v3beta;

import java.time.Instant;

public class TypedStoryLink {
    /**
     * The time/date when the Story Link was created.
     */
    public Instant created_at;

    /**
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * The unique identifier of the Story Link.
     */
    public Long id;

    /**
     * The ID of the object Story.
     */
    public Long object_id;

    /**
     * The ID of the subject Story.
     */
    public Long subject_id;

    /**
     * This indicates whether the Story is the subject or object in the Story Link.
     */
    public String type;

    /**
     * The time/date when the Story Link was last updated.
     */
    public Instant updated_at;

    /**
     * How the subject Story acts on the object Story. This can be “blocks”, “duplicates”, or “relates to”.
     */
    public String verb;
}
