package org.LMNSolutions.WPS;

import org.geotools.coverage.grid.GridCoverage2D;
import org.geotools.coverage.grid.GridGeometry2D;
import org.geoserver.wps.gs.GeoServerProcess;
import org.geoserver.wps.jts.DescribeParameter;
import org.geoserver.wps.jts.DescribeProcess;
import org.geoserver.wps.jts.DescribeResult;

import com.vividsolutions.jts.geom.Geometry;


@DescribeProcess(title = "TestingGrounds", description = "Tests and junk.")
public class TestingGrounds implements GeoServerProcess {

    @DescribeResult(name = "result", description = "The collection of result polygons.")
    public GridGeometry2D execute(
            @DescribeParameter(name = "raster", description = "The raster to check against.") GridCoverage2D _coverage,
    		@DescribeParameter(name = "startPoint", description = "The point to start at.") Geometry _startPoint)
            throws Exception {
    	return test(_coverage, _startPoint);
    }
    
    public static GridGeometry2D test(GridCoverage2D _coverage, Geometry _start) 
	{
    	GridGeometry2D test = _coverage.getGridGeometry();
    	
    	return test;
	}
}