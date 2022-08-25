package me.glicz.airflow;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

public class Airflow {

    @Getter(onMethod_={@NotNull})
    private static Server server;

    private Airflow() {}

    public static void setServer(@NotNull Server server) {
        if (Airflow.server != null) {
            throw new UnsupportedOperationException("You can't overwrite server instance");
        }
        Airflow.server = server;
    }
}
