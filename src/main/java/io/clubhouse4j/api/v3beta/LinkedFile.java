package io.clubhouse4j.api.v3beta;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

/**
 * Linked files are stored on a third-party website and linked to one or more Stories. Clubhouse currently supports linking files from Google Drive, Dropbox, Box, and by URL.
 */
public class LinkedFile {
    /**
     * The content type of the image (e.g. txt/plain).
     */
    public String content_type;

    /**
     * The time/date the LinkedFile was created.
     */
    public Instant created_at;

    /**
     * The description of the file.
     */
    public String description;

    /**
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * The unique identifier for the file.
     */
    public Long id;

    /**
     * The members that are mentioned in the description of the file.
     */
    public List<UUID> mention_ids;

    /**
     * The name of the linked file.
     */
    public String name;

    /**
     * The filesize, if the integration provided it.
     */
    public Long size;

    /**
     * The IDs of the stories this file is attached to.
     */
    public List<Long> story_ids;

    /**
     * The URL of the file thumbnail, if the integration provided it.
     */
    public String thumbnail_url;

    /**
     * The integration type (e.g. google, dropbox, box).
     */
    public String type;

    /**
     * The time/date the LinkedFile was updated.
     */
    public Instant updated_at;

    /**
     * The UUID of the member that uploaded the file.
     */
    public UUID uploader_id;

    /**
     * The URL of the file.
     */
    public String url;
}
