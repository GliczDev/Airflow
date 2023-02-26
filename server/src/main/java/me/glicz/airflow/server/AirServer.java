package me.glicz.airflow.server;

import lombok.Getter;
import me.glicz.airflow.Airflow;
import me.glicz.airflow.Server;
import me.glicz.airflow.Version;

import java.util.logging.Logger;

public class AirServer implements Server {

    @Getter
    private final String name = "Airflow";
    @Getter
    private final Version version = AirVersion.from(1, 19, 2, 760);

    public static void main(String[] args) {
        Airflow.setServer(new AirServer());
        Logger.getLogger("Airflow").info("In development. Minecraft Version: " + Airflow.getVersion().toString());
    }
}
