package io.clubhouse4j.api.v3beta;

public class CreateStoryLinkParams {
    /**
     * The unique ID of the Story defined as object.
     */
    public Long object_id;

    /**
     * The unique ID of the Story defined as subject.
     */
    public Long subject_id;

    /**
     * How the subject Story acts on the object Story. This can be “blocks”, “duplicates”, or “relates to”.
     */
    public String verb;
}
