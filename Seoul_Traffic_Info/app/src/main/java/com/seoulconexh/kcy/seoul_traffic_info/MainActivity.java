package com.seoulconexh.kcy.seoul_traffic_info;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import kr.go.seoul.trafficbus.TrafficBusButtonTypeB;
import kr.go.seoul.trafficbus.TrafficBusButtonTypeN;
import kr.go.seoul.trafficsubway.TrafficSubwayButtonTypeA;
import kr.go.seoul.airquality.AirQualityTypeMini;
import kr.go.seoul.trafficsubway.TrafficSubwayButtonTypeB;

public class MainActivity extends AppCompatActivity {

    private String key = "5a6c4f63676b636836384858566346";
    private String subwayKey = "4971434c466b63683539686464636c"; // 지하철 실시간 시간
    private String busKey = "62%2FsfGqNoWk%2BFSOxNXLyhw%2B7HUV%2FCJJ41P1nFSxUJ8ukbYYIOzQ7GZMrgVbnp6mPQ9OjMQde0EB%2FfrSpWP%2F16w%3D%3D";

    private TrafficBusButtonTypeB busTypeB;
    private TrafficBusButtonTypeN busTypeN;
    private TrafficSubwayButtonTypeA subwayButtonTypeA;
    private TrafficSubwayButtonTypeB subwayButtonTypeB;
    private AirQualityTypeMini typeMini;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        typeMini = (AirQualityTypeMini) findViewById(R.id.type_mini);
        subwayButtonTypeB = (TrafficSubwayButtonTypeB) findViewById(R.id.subway_type_b);
        busTypeB = (TrafficBusButtonTypeB) findViewById(R.id.bus_type_b);

        typeMini.setOpenAPIKey(key);
        subwayButtonTypeB.setOpenAPIKey(key);
        subwayButtonTypeB.setsubwayLocationAPIKey(subwayKey); // 실시간 도착
        busTypeB.setOpenAPIKey(busKey);
    }
}
