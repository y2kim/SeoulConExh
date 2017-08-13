package com.seoulconexh.kcy.seoul_traffic_info;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import kr.go.seoul.trafficbus.TrafficBusButtonTypeB;
import kr.go.seoul.trafficbus.TrafficBusButtonTypeN;
import kr.go.seoul.trafficsubway.TrafficSubwayButtonTypeA;
import kr.go.seoul.airquality.AirQualityTypeMini;

public class MainActivity extends AppCompatActivity {

    private String key = "5a6c4f63676b636836384858566346";

    private TrafficBusButtonTypeB busTypeB;
    private TrafficBusButtonTypeN busTypeN;
    private TrafficSubwayButtonTypeA subwayButtonTypeA;
    private AirQualityTypeMini typeMini;
// AAR 를 사용

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        typeMini = (AirQualityTypeMini) findViewById(R.id.type_mini);
        subwayButtonTypeA = (TrafficSubwayButtonTypeA) findViewById(R.id.subway_type_a);

        typeMini.setOpenAPIKey(key);
        subwayButtonTypeA.setOpenAPIKey(key);
    }
}
