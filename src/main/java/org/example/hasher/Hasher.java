package org.example.hasher;

import java.util.ArrayList;

public interface Hasher {
    long hash(final String data);
    long hash(final ArrayList<Byte> data);
}
