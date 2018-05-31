package io.clubhouse4j.api.v3beta;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class File {
    /**
     * Free form string corresponding to a text or image file.
     */
    public String content_type;

    /**
     * The time/date that the file was created.
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
     * This field can be set to another unique ID. In the case that the File has been imported from another tool, the ID in the other tool can be indicated here.
     */
    public String external_id;

    /**
     * The name assigned to the file in Clubhouse upon upload.
     */
    public String filename;

    /**
     * The unique ID for the file.
     */
    public Long id;

    /**
     * The unique IDs of the Members who are mentioned in the file description.
     */
    public List<UUID> mention_ids;

    /**
     * The optional User-specified name of the file.
     */
    public String name;

    /**
     * The size of the file.
     */
    public Long size;

    /**
     * The unique IDs of the Stories associated with this file.
     */
    public List<Long> story_ids;

    /**
     * The url where the thumbnail of the file can be found in Clubhouse.
     */
    public String thumbnail_url;

    /**
     * The time/date that the file was updated.
     */
    public Instant updated_at;

    /**
     * The unique ID of the Member who uploaded the file.
     */
    public UUID uploader_id;

    /**
     * The URL for the file.
     */
    public String url;
}
