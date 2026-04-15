package saucedemo.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class TestDataReader {

    private static final String TEST_DATA_FILE = "testdata.properties";
    private static final Properties PROPERTIES = loadProperties();

    private TestDataReader() {
    }

    public static String get(String key) {
        String value = PROPERTIES.getProperty(key);
        if (value == null) {
            throw new IllegalArgumentException("No se encontró la clave '" + key + "' en " + TEST_DATA_FILE);
        }
        return value;
    }

    private static Properties loadProperties() {
        try (InputStream inputStream = TestDataReader.class.getClassLoader().getResourceAsStream(TEST_DATA_FILE)) {
            if (inputStream == null) {
                throw new IllegalStateException("No se pudo cargar " + TEST_DATA_FILE + " desde el classpath");
            }

            Properties properties = new Properties();
            properties.load(inputStream);
            return properties;
        } catch (IOException e) {
            throw new IllegalStateException("No se pudo leer " + TEST_DATA_FILE, e);
        }
    }
}

