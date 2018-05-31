package io.clubhouse4j.api.v3beta;

public class UpdateLabelParams {
    /**
     * A true/false boolean indicating if the Label has been archived.
     */
    public Boolean archived;

    /**
     * The hex color to be displayed with the Label (for example, “#ff0000”).
     */
    public String color;

    /**
     * The new name of the label.
     */
    public String name;
}
