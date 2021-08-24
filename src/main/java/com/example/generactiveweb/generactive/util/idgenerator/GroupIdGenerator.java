package com.example.generactiveweb.generactive.util.idgenerator;

public final class GroupIdGenerator {

    private static int CURRENT = 1;

    public static int getNextId() {
        return CURRENT++;
    }

    private GroupIdGenerator() {

    }
}
