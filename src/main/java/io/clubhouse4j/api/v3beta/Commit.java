package io.clubhouse4j.api.v3beta;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class Commit {
    /**
     * The email address of the GitHub user that authored the Commit.
     */
    public String author_email;

    /**
     * The ID of the Member that authored the Commit, if known.
     */
    public UUID author_id;

    /**
     * The Identity of the GitHub user that authored the Commit.
     */
    public Identity author_identity;

    /**
     * The time/date the Commit was created.
     */
    public Instant created_at;

    /**
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * The Commit hash.
     */
    public String hash;

    /**
     * The unique ID of the Commit.
     */
    public Long id;

    /**
     * The IDs of the Branches the Commit has been merged into.
     */
    public List<Long> merged_branch_ids;

    /**
     * The Commit message.
     */
    public String message;

    /**
     * The ID of the Repository that contains the Commit.
     */
    public Long repository_id;

    /**
     * The time/date the Commit was pushed.
     */
    public Instant timestamp;

    /**
     * The time/date the Commit was updated.
     */
    public Instant updated_at;

    /**
     * The URL of the Commit.
     */
    public String url;
}
