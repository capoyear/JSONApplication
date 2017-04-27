package com.pao.jsonapplication.OPPMSService;

import com.pao.jsonapplication.OPPMSService.OPPMSDAO.OPPMSDAO;
import com.pao.jsonapplication.OPPMSService.OPPMSDAO.SendQuick;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Pao on 17/3/2560.
 */

public interface OPPMSService {
    @POST("index.php/OPPMS/service_android/graph_cycle")
    Call<OPPMSDAO> getOPPMSData();
    @FormUrlEncoded
    @POST("index.php/OPPMS/service_android/send_quick")
    Call<SendQuick> sendData(@Field("id") String id,@Field("name") String name);
}
