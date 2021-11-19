package org.example.hasher;

import java.util.ArrayList;

public class HasherImpl implements Hasher {
    @Override
    public long hash(final String data) {
        final int p = 31;
        final int m = (int)Math.exp(9) + 9;
        long hashValue = 0L;
        long pow = 1L;

        for(int i=0;i<data.length();i++) {
            char c = data.charAt(i);
            hashValue = (hashValue + (c - 'a' + 1) * pow) % m;
            pow = (pow * p) % m;
        }

        return hashValue;
    }

    @Override
    public long hash(final ArrayList<Byte> data) {
        return 0;
    }
}
