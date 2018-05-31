package io.clubhouse.api.v3beta;

/**
 * Request parameters for creating a Category with a Milestone.
 */
public class CreateCategoryParams {
    /**
     * The hex color to be displayed with the Category (for example, “#ff0000”).
     */
    public String color;

    /**
     * This field can be set to another unique ID. In the case that the Category has been imported from another tool, the ID in the other tool can be indicated here.
     */
    public String external_id;

    /**
     * The name of the new Category.
     */
    public String name;
}
