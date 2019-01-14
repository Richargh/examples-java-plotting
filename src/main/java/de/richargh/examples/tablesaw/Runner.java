package de.richargh.examples.tablesaw;


import tech.tablesaw.aggregate.AggregateFunctions;
import tech.tablesaw.api.DoubleColumn;
import tech.tablesaw.api.NumberColumn;
import tech.tablesaw.api.Table;
import tech.tablesaw.io.csv.CsvReadOptions;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.api.BoxPlot;
import tech.tablesaw.plotly.api.HorizontalBarPlot;
import tech.tablesaw.plotly.components.Figure;

import java.io.File;
import java.io.IOException;

public class Runner {

    public void doSth(File file) throws IOException {
        Table property = Table.read().csv(CsvReadOptions.builder(file).separator(';').build());
        Figure figure = BoxPlot.create("Execution time by run config", property, "Run", "Execution Time");
        Plot.show(figure);
    }
}
