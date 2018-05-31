package io.clubhouse.api.v3beta;

public class CreateLabelParams {
    /**
     * The Label name.
     */
    public String name;

    /**
     * The hex color to be displayed with the Label (for example, “#ff0000”).
     */
    public String color;

    /**
     * An optional user-defined ID perhaps associating the Epic with an outside tool.
     */
    public String external_id;

    public CreateLabelParams() {
    }

    public CreateLabelParams(String name) {
        this.name = name;
    }

    public CreateLabelParams(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public CreateLabelParams(String name, String color, String externalId) {
        this.name = name;
        this.color = color;
        this.external_id = externalId;
    }
}
