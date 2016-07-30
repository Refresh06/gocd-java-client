package in.ashwanthkumar.gocd.client;

import com.google.gson.annotations.SerializedName;

public class PipelineStatus {
    @SerializedName("locked")
    private boolean locked;
    @SerializedName("paused")
    private boolean paused;
    @SerializedName("schedulable")
    private boolean schedulable;

    public boolean isLocked() {
        return locked;
    }

    public PipelineStatus setLocked(boolean locked) {
        this.locked = locked;
        return this;
    }

    public boolean isPaused() {
        return paused;
    }

    public PipelineStatus setPaused(boolean paused) {
        this.paused = paused;
        return this;
    }

    public boolean isSchedulable() {
        return schedulable;
    }

    public PipelineStatus setSchedulable(boolean schedulable) {
        this.schedulable = schedulable;
        return this;
    }
}
