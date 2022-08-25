package me.glicz.airflow.types;

public interface Version {

    int getMajor();
    int getMinor();
    int getPatch();
    int getProtocolVersion();
}
