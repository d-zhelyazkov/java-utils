package com.xrc.io;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * {@link Writer} decorator, that flushes on each {@code write}.
 */
public class AutoFlushWriter extends FilterWriter {
    /**
     * @param out a Writer object to provide the underlying stream.
     * @throws NullPointerException if <code>out</code> is <code>null</code>
     */
    public AutoFlushWriter(Writer out) {
        super(out);
    }

    @Override
    public void write(int c) throws IOException {
        super.write(c);
        super.flush();
    }

    @Override
    public void write(char buf[], int off, int len) throws IOException {
        super.write(buf, off, len);
        super.flush();
    }

    @Override
    public void write(String str, int off, int len) throws IOException {
        super.write(str, off, len);
        super.flush();
    }
}
