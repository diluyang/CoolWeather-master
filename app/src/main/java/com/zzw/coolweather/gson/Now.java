package com.zzw.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dly.
 */

public class Now {
    @SerializedName ("tmp")
    public String tmperature;
    @SerializedName ("cond")
    public More more;
    public class More{
        @SerializedName ("txt")
        public String info;
    }
}
