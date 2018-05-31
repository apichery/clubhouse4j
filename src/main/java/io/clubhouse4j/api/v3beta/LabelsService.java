package io.clubhouse4j.api.v3beta;

import java.util.List;

import com.google.common.collect.Lists;

public class LabelsService extends ClubhouseService {

    private static final String LABELS = "labels";

    public LabelsService(ClubhouseClient client) {
        super(client);
    }

    /**
     * List Labels returns a list of all Labels and their attributes.
     */
    public List<Label> listLabels() {
        String url = client.buildUrl(LABELS);
        return Lists.newArrayList(executeGet(url, Label[].class));
    }

    /**
     * Get Label returns information about the selected Label.
     */
    public Label getLabel(long epicId) {
        String url = client.buildUrl(LABELS, epicId);
        return executeGet(url, Label.class);
    }

    /**
     * Create Label allows you to create a new Label in Clubhouse.
     */
    public Label createLabel(CreateLabelParams params) {
        String url = client.buildUrl(LABELS);
        return executePost(url, params, Label.class);
    }

    /**
     * Update Label allows you to replace a Label name with another name.
     * If you try to name a Label something that already exists, you will receive a 422 response.
     */
    public Label updateLabel(long epicId, UpdateLabelParams params) {
        String url = client.buildUrl(LABELS, epicId);
        return executePut(url, params, Label.class);
    }

    /**
     * Delete Label can be used to delete any Label.
     */
    public void deleteLabel(long epicId) {
        String url = client.buildUrl(LABELS, epicId);
        executeDelete(url);
    }
}
