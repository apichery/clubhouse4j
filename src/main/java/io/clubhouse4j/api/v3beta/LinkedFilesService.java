package io.clubhouse4j.api.v3beta;

import java.io.IOException;
import java.util.List;

import com.google.common.collect.ImmutableList;

@SuppressWarnings({"UnusedReturnValue", "unused"})
public class LinkedFilesService extends ClubhouseService {

    private static final String LINKED_FILES = "linked-files";

    public LinkedFilesService(ClubhouseClient client) {
        super(client);
    }

    public List<LinkedFile> listLinkedFiles() throws IOException {
        String url = client.buildUrl(LINKED_FILES);
        return ImmutableList.copyOf(executeGet(url, LinkedFile[].class));
    }

    public LinkedFile createLinkedFile(CreateLinkedFileParams params) throws IOException {
        String url = client.buildUrl(LINKED_FILES);
        return executePost(url, params, LinkedFile.class);
    }

    public LinkedFile getLinkedFile(long linkedFileId) throws IOException {
        String url = client.buildUrl(LINKED_FILES, linkedFileId);
        return executeGet(url, LinkedFile.class);
    }

    public Story updateLinkedFile(long linkedFileId, UpdateLinkedFileParams params) throws IOException {
        String url = client.buildUrl(LINKED_FILES, linkedFileId);
        return executePut(url, params, Story.class);
    }

    public void deleteLinkedFile(long linkedFileId) throws IOException {
        String url = client.buildUrl(LINKED_FILES, linkedFileId);
        executeDelete(url);
    }
}
