package io.clubhouse4j.api.v3beta;

import static io.clubhouse4j.api.v3beta.GsonHelper.GSON;

import java.time.Instant;
import java.util.UUID;

public class Member {
    /**
     * The time/date the Member was created.
     */
    public Instant created_at;

    /**
     * True/false boolean indicating whether the Member has been disabled within this Organization.
     */
    public Boolean disabled;

    /**
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * The Member’s ID in Clubhouse.
     */
    public UUID id;

    /**
     * A group of Member profile details.
     */
    public Profile profile;

    /**
     * The Member’s role in the Clubhouse organization.
     */
    public String role;

    /**
     * The time/date the Member was last updated.
     */
    public Instant updated_at;

    @Override
    public String toString() {
        return GSON.toJson(this);
    }
}
