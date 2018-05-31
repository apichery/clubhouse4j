package io.clubhouse4j.api.v3beta;

public class CreateExternalTicketParams {

    public CreateExternalTicketParams() {
    }

    public CreateExternalTicketParams(String external_id, String external_url) {
        this.external_id = external_id;
        this.external_url = external_url;
    }

    /**
     * The id of the ticket in the external system.
     */
    public String external_id;


    /**
     * The url for the ticket in the external system
     */
    public String external_url;
}

