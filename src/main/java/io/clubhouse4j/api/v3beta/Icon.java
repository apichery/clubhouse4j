package io.clubhouse4j.api.v3beta;

import java.time.Instant;
import java.util.UUID;

public class Icon {
    /**
     * The time/date that the Icon was created.
     */
    public Instant created_at;

    /**
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * The unique ID of the Icon.
     */
    public UUID id;

    /**
     * The time/date that the Icon was updated.
     */
    public Instant updated_at;

    /**
     * The URL of the Icon.
     */
    public String url;
}
