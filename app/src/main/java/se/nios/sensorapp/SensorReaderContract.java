package se.nios.sensorapp;

import android.provider.BaseColumns;

/**
 * This is a contract for sql
 * Created by Nicklas on 2017-04-05.
 */

public final class SensorReaderContract {
    //private constructor to prevent someone from instantiating class..
    private SensorReaderContract(){}

    // Table Names
    public static final String TABLE_SENSOR_DATA = "sensor_data";
    public static final String TABLE_SENSORS = "sensors";

    public static class SensorData implements BaseColumns{
        public static final String TABLE_NAME = TABLE_SENSOR_DATA;
        public static final String COLUMN_NAME_SENSOR_ID = "sensor_id";
        public static final String COLUMN_NAME_TIMESTAMP = "timestamp";
        public static final String COLUMN_NAME_SEQNO ="seqno";
        public static final String COLUMN_NAME_PAYLOAD ="payload";
        public static final String COLUMN_NAME_TEMPERATURE ="temperature";
        public static final String COLUMN_NAME_HUMIDITY ="humidity";
        public static final String COLUMN_NAME_LIGHT ="light";
        public static final String COLUMN_NAME_MOTION_COUNTER ="motion_counter";
        public static final String COLUMN_NAME_BATTERY ="battery";

    }

    public static class Sensors implements BaseColumns{
        public static final String TABLE_NAME = TABLE_SENSORS;
        public static final String COLUMN_NAME_SENSOR_ID = "sensor_id";
        public static final String COLUMN_NAME_URL = "url";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_GROUP = "´group´";

    }

}
