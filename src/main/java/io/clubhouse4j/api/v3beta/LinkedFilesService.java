package io.clubhouse.api.v3beta;

import java.util.List;

import com.google.common.collect.ImmutableList;

@SuppressWarnings({"UnusedReturnValue", "unused"})
public class LinkedFilesService extends ClubhouseService {

    private static final String LINKED_FILES = "linked-files";

    public LinkedFilesService(ClubhouseClient client) {
        super(client);
    }

    public List<LinkedFile> listLinkedFiles() {
        String url = client.buildUrl(LINKED_FILES);
        return ImmutableList.copyOf(executeGet(url, LinkedFile[].class));
    }

    public LinkedFile createLinkedFile(CreateLinkedFileParams params) {
        String url = client.buildUrl(LINKED_FILES);
        return executePost(url, params, LinkedFile.class);
    }

    public LinkedFile getLinkedFile(long linkedFileId) {
        String url = client.buildUrl(LINKED_FILES, linkedFileId);
        return executeGet(url, LinkedFile.class);
    }

    public Story updateLinkedFile(long linkedFileId, UpdateLinkedFileParams params) {
        String url = client.buildUrl(LINKED_FILES, linkedFileId);
        return executePut(url, params, Story.class);
    }

    public void deleteLinkedFile(long linkedFileId) {
        String url = client.buildUrl(LINKED_FILES, linkedFileId);
        executeDelete(url);
    }
}
