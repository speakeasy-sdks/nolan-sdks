package .models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ProjectRunStatusEnum {
    PENDING("PENDING"),
    RUNNING("RUNNING"),
    ERRORED("ERRORED"),
    COMPLETED("COMPLETED"),
    KILLED("KILLED"),
    UNABLE_TO_ALLOCATE_KERNEL("UNABLE_TO_ALLOCATE_KERNEL");

    @JsonValue
    public final String value;

    private ProjectRunStatusEnum(String value) {
        this.value = value;
    }
}
