package me.glicz.airflow;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@NoArgsConstructor(access = AccessLevel.NONE)
public class Airflow {

    @Getter(onMethod_={@NotNull})
    private static Server server;

    public static void setServer(@NotNull Server server) {
        if (Airflow.server != null)
            throw new UnsupportedOperationException("You can't overwrite server instance");
        Airflow.server = server;
    }

    public static Version getVersion() {
        return server.getVersion();
    }
}
