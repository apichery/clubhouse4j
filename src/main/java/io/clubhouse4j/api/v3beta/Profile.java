package io.clubhouse4j.api.v3beta;

import java.util.UUID;

public class Profile {
    /**
     * A true/false boolean indicating whether the Member has been deactivated within Clubhouse.
     */
    public Boolean deactivated;

    /**
     * Icons are used to attach images to Organizations, Members, and Loading screens in the Clubhouse web application.
     */
    public Icon display_icon;

    /**
     * The primary email address of the Member with the Organization.
     */
    public String email_address;

    /**
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * This is the gravatar hash associated with email_address.
     */
    public String gravatar_hash;

    /**
     * The unique identifier of the profile.
     */
    public UUID id;

    /**
     * The Member’s username within the Organization.
     */
    public String mention_name;


    /**
     * The Member’s name within the Organization.
     */
    public String name;

    /**
     * If Two Factor Authentication is activated for this User.
     */
    public Boolean two_factor_auth_activated;
}
