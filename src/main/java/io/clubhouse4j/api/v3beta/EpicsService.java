package io.clubhouse4j.api.v3beta;

import java.io.IOException;
import java.util.List;

import com.google.common.collect.Lists;

public class EpicsService extends ClubhouseService {

    private static final String EPICS = "epics";

    public EpicsService(ClubhouseClient client) {
        super(client);
    }

    public List<EpicSlim> listEpics() throws IOException {
        String url = client.buildUrl(EPICS);
        return Lists.newArrayList(executeGet(url, EpicSlim[].class));
    }

    public Epic getEpic(long epicId) throws IOException {
        String url = client.buildUrl(EPICS, epicId);
        return executeGet(url, Epic.class);
    }

    public Epic createEpic(CreateEpicParams params) throws IOException {
        String url = client.buildUrl(EPICS);
        return executePost(url, params, Epic.class);
    }

    public Epic updateEpic(long epicId, UpdateEpicParams params) throws IOException {
        String url = client.buildUrl(EPICS, epicId);
        return executePut(url, params, Epic.class);
    }

    public void deleteEpic(long epicId) throws IOException {
        String url = client.buildUrl(EPICS, epicId);
        executeDelete(url);
    }
}
