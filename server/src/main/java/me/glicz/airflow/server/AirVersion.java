package me.glicz.airflow.server;

import lombok.Getter;
import me.glicz.airflow.Version;

public class AirVersion implements Version {

    @Getter
    private final int major, minor, patch, protocolVersion;

    private AirVersion(int major, int minor, int patch, int protocolVersion) {
        this.major = major;
        this.minor = minor;
        this.patch = patch;
        this.protocolVersion = protocolVersion;
    }

    public static AirVersion from(int major, int minor, int patch, int protocolVersion) {
        return new AirVersion(major, minor, patch, protocolVersion);
    }

    @Override
    public String toString() {
        return String.format("v%s.%s.%s (%s)", major, minor, patch, protocolVersion);
    }
}
