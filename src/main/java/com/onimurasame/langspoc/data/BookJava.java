package com.onimurasame.langspoc.data;

import java.util.UUID;

public class BookJava {

    private final UUID id;
    private final String name;

    public BookJava(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
