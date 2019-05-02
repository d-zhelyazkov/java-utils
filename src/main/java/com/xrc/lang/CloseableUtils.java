package com.xrc.lang;

public class CloseableUtils {

    public static void closeQuietly(AutoCloseable closeable) {
        if(closeable == null)
            return;

        try {
            closeable.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
