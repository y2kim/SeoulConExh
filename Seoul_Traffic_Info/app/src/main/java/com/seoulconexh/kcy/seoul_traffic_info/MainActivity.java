package com.seoulconexh.kcy.seoul_traffic_info;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.net.URI;
import kr.go.seoul.airquality.AirQualityTypeMini;
import kr.go.seoul.culturalevents.CulturalEventButtonTypeA;
import kr.go.seoul.culturalevents.CulturalEventTypeMini;
import kr.go.seoul.trafficsubway.TrafficSubwayButtonTypeB;

public class MainActivity extends AppCompatActivity {

    private String key = "5a6c4f63676b636836384858566346";
    private String subwayKey = "4971434c466b63683539686464636c"; // 지하철 실시간 시간
    public URI uri;


    private TrafficSubwayButtonTypeB subwayButtonTypeB;
    private CulturalEventButtonTypeA typeA;
    private CulturalEventTypeMini typeMinis;
    private AirQualityTypeMini typeMini;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        typeMini = (AirQualityTypeMini) findViewById(R.id.type_mini);
        subwayButtonTypeB = (TrafficSubwayButtonTypeB) findViewById(R.id.subway_type_b);
        typeA = (CulturalEventButtonTypeA) findViewById(R.id.type_a);
        typeMinis = (CulturalEventTypeMini) findViewById(R.id.type_minis);


        typeMini.setOpenAPIKey(key);
        typeMinis.setOpenAPIKey(key);
        typeA.setOpenAPIKey(key);
        subwayButtonTypeB.setOpenAPIKey(key);
        subwayButtonTypeB.setsubwayLocationAPIKey(subwayKey); // 실시간 도착


    }
}
