package com.sam_chordas.android.stockhawk.ui;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.db.chart.model.LineSet;
import com.db.chart.model.Point;
import com.db.chart.view.LineChartView;
import com.sam_chordas.android.stockhawk.R;
import com.sam_chordas.android.stockhawk.data.QuoteProvider;
import com.sam_chordas.android.stockhawk.rest.Utils;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_line_graph);
        LineChartView cView = (LineChartView )findViewById(R.id.linechart);
        Intent intent = getIntent();
        int[] arraryStock = intent.getExtras().getIntArray("numbers");
        LineSet dataset = new LineSet();
        dataset.addPoint(new Point("Point1", arraryStock[0]));
        dataset.addPoint(new Point("Point2", arraryStock[1]));
        dataset.addPoint(new Point("Point3", arraryStock[2]));
        dataset.addPoint(new Point("Point4", arraryStock[3]));
        cView.addData(dataset);
        cView.show();
    }
}
