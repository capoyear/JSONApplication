package com.pao.jsonapplication.OPPMSService.OPPMSDAO;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Pao on 17/3/2560.
 */

public class OPPMSDAO {
    @SerializedName("details")
    public  Details details;
    @SerializedName("graphData")
    public ArrayList<GraphData> graphData;
}
