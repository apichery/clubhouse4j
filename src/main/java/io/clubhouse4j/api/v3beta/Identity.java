package io.clubhouse4j.api.v3beta;

/**
 * The Identity of the GitHub user that authored the Commit.
 */
public class Identity {
    /**
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * This is your login in GitHub.
     */
    public String name;

    /**
     * The type of Identity; currently only type is github.
     */
    public String type;
}
