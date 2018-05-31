package io.clubhouse.api.v3beta;

import java.util.List;
import java.util.UUID;

public class ExternalTicket {
    /**
     * The Clubhouse Epics associated with this External Ticket
     */
    public List<Long> epic_ids;

    /**
     * The ID used in the external system.
     */
    public String external_id;

    /**
     * The full qualified url of the external ticket.
     */
    public String external_url;

    /**
     * A unique ID internal to Clubhouse.
     */
    public UUID id;

    /**
     * The Clubhouse Story ids associated with this External Ticket.
     */
    public List<Long> story_ids;
}
